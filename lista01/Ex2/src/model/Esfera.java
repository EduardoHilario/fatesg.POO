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
public class Esfera extends Figura{
    
    private float raio;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception {
        if(raio < 0) throw new Exception();
        this.raio = raio;
    }
    
    public float calculeArea(){
        return (float)(4 * Math.PI * Math.pow(getRaio(), 2));

    }
    
    public float calculeVolume(){
        return (float)((4.0/3)*Math.PI*Math.pow(getRaio(), 3));
    }
    
    @Override
    public String calculosToString(){
        return "Area : " + calculeArea() +
                "\nVolume: " + calculeVolume();
    }
}
