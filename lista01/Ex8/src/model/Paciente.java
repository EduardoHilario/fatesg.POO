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
public class Paciente {

    private String nome;
    private float peso;
    private float altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) throws Exception {
        if(peso < 0) throw new Exception();
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        if(altura < 0) throw new Exception();
        this.altura = altura;
    }

    public float calculeIMC() {
        return (float) (getPeso() / Math.pow(getAltura(), 2));
    }

    public String faixaDePeso(float imc) {
        if (imc < 20) {
            return "Abaixo do peso ideal";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Excesso de peso";
        } else if (imc < 35) {
            return "Obesidade";
        } else {
            return "Obesidade morbida";
        }
    }

}
