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
public class ContaPoupanca {
    
    private String nomeDoCliente;
    private int numeroDaConta;
    private int agencia;
    private double saldo;

    public String getNome() {
        return nomeDoCliente;
    }

    public void setNome(String nome) {
        this.nomeDoCliente = nome;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) throws Exception {
        if (numeroDaConta < 0) throw new Exception("Erro!! Conta inválida");
        this.numeroDaConta = numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) throws Exception {
        if (agencia < 0) throw new Exception("Erro!! Agência inválida");
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void deposite(double valor) throws Exception{
        if (valor <= 0) throw new Exception("Erro!! Impossivel depositar este valor");
        this.saldo += valor;
    }
    
    public void saque(double valor) throws Exception{
        if (valor <= 0 || this.saldo < valor) throw new Exception("Erro!! Impossivel sacar este valor");
        this.saldo -= valor;
    }
}
