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
public class Triangulo {

    private float ladoA;
    private float ladoB;
    private float ladoC;

    public float getLadoA() {
        return ladoA;
    }

    public float getLadoB() {
        return ladoB;
    }

    public float getLadoC() {
        return ladoC;
    }

    public void setLados(float a, float b, float c) throws Exception {
        if (!isTriangulo(a, b, c)) {
            throw new Exception("Erro!! Triângulo nao existe");
        }
        this.ladoA = a;
        this.ladoB = b;
        this.ladoC = c;

    }

    public boolean isTriangulo(float a, float b, float c) {
        if (a > 0 && b > 0 && c > 0) {
            if (a < b + c && b < a + c && c < a + b) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String classifiquePeloLado() {
        if (getLadoA() == getLadoB() || getLadoB() == getLadoC()) {
            if (getLadoA() == getLadoC()) {
                return "equilátero";
            } else {
                return "isósceles";
            }
        } else {
            return "escaleno";
        }
    }

    public String classifiquePeloAngulo() {
        if (Math.pow(getLadoA(), 2) < Math.pow(getLadoB(), 2) + Math.pow(getLadoC(), 2)) {
            return "acutângulo";
        } else if (Math.pow(getLadoA(), 2) > Math.pow(getLadoB(), 2) + Math.pow(getLadoC(), 2)) {
            return "obtusângulo";
        } else {
            return "retângulo";
        }
    }
    
    public double calculeArea(){
        
        float t = (getLadoA() + getLadoB() + getLadoC())/2;
        
        return Math.sqrt(t*(t-getLadoA())*(t-getLadoB())*(t-getLadoC()));
    }
    
    public String toString(){
        return "Medidas do triângulo: "
                + "\nLado A = "+getLadoA()
                + "\nLado B = "+getLadoB()
                + "\nLado C = "+getLadoC()
                + "\nArea = "+calculeArea()
                + "\nEste triângulo é "+classifiquePeloAngulo()
                + " e "+classifiquePeloLado()+".";
    }
}
