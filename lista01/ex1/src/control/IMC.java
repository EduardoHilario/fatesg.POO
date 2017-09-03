package control;

import model.Pessoa;

/**
 *
 * @author eduardohilario
 */
public class IMC {
    
    private Pessoa pessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public IMC(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public float calculeIMC(){
        
        return (float)(pessoa.getPeso()*Math.pow(pessoa.getAltura(),2));
    }
}
