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
public class Equacao2Grau {
    
    
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    
    public Double calculeDelta(){
        
        return Math.pow(getB(), 2) - 4*getA()*getC();
    }
    
    public Double[] calculeEquacao() throws Exception{
        double delta = calculeDelta();
        if(delta < 0) throw new Exception();
        
        if (delta > 0){
            Double[] raizes = {(-getB()+Math.sqrt(delta))/2.0*getA(),
                                (-getB()-Math.sqrt(delta))/2.0*getA()};
            return raizes;
        }else if (delta == 0){
            Double[] raizes = {(-getB()+Math.sqrt(delta))/2.0*getA()};
            return raizes;
            
        }else{
            return null;
        }
    }
    
}
