package model;

/**
 * 
 * @author eduardohilario
 */
public class Pessoa {
    
    private String nome;
    private Float altura;
    private Float peso;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) throws Exception{
        if(altura < 0 || altura == null) throw new Exception();
        this.altura = altura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) throws Exception{
        if(peso < 0 || peso == null) throw new Exception();
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
