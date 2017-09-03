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
public class Cilindro extends Figura {

    private float raio;
    private float altura;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception {
        if(raio < 0) throw new Exception();
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        if(altura < 0) throw new Exception();
        this.altura = altura;
    }

    public float calculeAreaTotal() {
        return (float) (2 * Math.PI * getRaio()
                * (getAltura() + getRaio()));
    }

    public float calculeAreaLateral() {
        return (float) (2 * Math.PI * getRaio() * getAltura());

    }

    public float calculeVolume() {
        return (float) (Math.PI * Math.pow(getRaio(), 2) * getAltura());

    }
    
    @Override
    public String calculosToString(){
        return "Area Total: " + calculeAreaTotal() +
                "\nArea Lateral: " + calculeAreaLateral() +
                "\nVolume: " + calculeVolume();
    }

}
