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
public class Cone extends Figura {

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

    public float calculeGeratriz() {
        return (float) (Math.sqrt(Math.pow(getAltura(), 2)
                * Math.pow(getRaio(), 2)));
    }

    public float calculeAreaLateral() {
        return (float) (Math.PI * getRaio() * calculeGeratriz());

    }

    public float calculeAreaTotal() {
        return (float) (Math.PI * getRaio()
                * (calculeGeratriz() + getRaio()));
    }

    public float calculeVolume() {
        return (float) (1.0 / 3 * Math.PI * Math.pow(getRaio(), 2) * getAltura());

    }
    
    @Override
    public String calculosToString(){
        return "Area Total: " + calculeAreaTotal() +
                "\nArea Lateral: " + calculeAreaLateral() +
                "\nVolume: " + calculeVolume();
    }
}
