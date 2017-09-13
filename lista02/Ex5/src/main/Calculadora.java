/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author eduardohilario
 */
public class Calculadora {
    
    private double n1;
    private double n2;

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    public double somar(){
        return n1+n2;
    }
    
    public double subtrair(){
        return n1-n2;
    }
    
    public double multiplicar(){
        return n1*n2;
    }
    
    public double dividir() throws Exception{
        if(n2 < 0) throw new Exception();
        return n1/n2;
    }
    
    public double potencia(){
        return Math.pow(n1, n2);
    }
    
    public double raiz(){
        return Math.pow(n1, 1/n2);
    }
    
}
