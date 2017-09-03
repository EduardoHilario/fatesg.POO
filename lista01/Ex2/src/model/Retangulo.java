/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author eduardohilario
 */
public class Retangulo extends Figura{
    
    private float comprimento;
    private float largura;

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) throws Exception {
        if(comprimento < 0) throw new Exception();
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) throws Exception {
        if(largura < 0) throw new Exception();
        this.largura = largura;
    }
    
    public float calculeArea(){
        return (float)(getLargura() * getComprimento());

    }
    
    public float calculePerimetro(){
        return (float)(2*getLargura() + 2*getComprimento());
            
    }
    
    @Override
    public String calculosToString(){
        return "Area: " + calculeArea() +
                "\nPerimetro: "+ calculePerimetro();
                
    }
}
