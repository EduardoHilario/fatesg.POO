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
public class Paralelepipedo extends Figura {

    private float altura;
    private float largura;
    private float comprimento;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        if(altura < 0) throw new Exception();
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) throws Exception {
        if(largura < 0) throw new Exception();
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) throws Exception {
        if(comprimento < 0) throw new Exception();
        this.comprimento = comprimento;
    }

    public float calculeArea() {
        return (float) (2 * (getAltura() * getLargura()
                + getAltura() * getComprimento()
                + getLargura() * getComprimento()));
    }

    public float calculeVolume() {
        return (float) (getLargura() * getComprimento() * getAltura());

    }
    
    @Override
    public String calculosToString(){
        return "Area Total: " + calculeArea() +
                "\nVolume: " + calculeVolume();
    }

}
