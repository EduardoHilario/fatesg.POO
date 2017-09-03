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
public class Funcionario {

    private String nome;
    private double salarioDoMes;
    private int quantidadeDeFilhos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioDoMes() {
        return salarioDoMes;
    }

    public void setSalarioDoMes(double salarioDoMes) throws Exception {
        if (salarioDoMes <= 0) throw new Exception("Erro!! Salário Inválido");
        this.salarioDoMes = salarioDoMes;
    }

    public int getQuantidadeDeFilhos() {
        return quantidadeDeFilhos;
    }

    public void setQuantidadeDeFilhos(int quantidadeDeFilhos) throws Exception {
        if (salarioDoMes < 0) throw new Exception("Erro!! Não existe "+quantidadeDeFilhos+" filhos");
        this.quantidadeDeFilhos = quantidadeDeFilhos;
    }

    public double calculeAumentoSalarial(float percentual) throws Exception {
        if (percentual < 0) throw new Exception("Erro!! Percentual inválido");
        return getSalarioDoMes() * percentual/100;
    }

    public double calculeINSS() {
        if (getSalarioDoMes() <= 2545) {
            return getSalarioDoMes() * 6 / 100;
        } else {
            return getSalarioDoMes() * 10 / 100;
        }
    }

    public double calculeIR() {
        if (getSalarioDoMes() > 4664.68) {
            return getSalarioDoMes() * 27.5 / 100;
        } else if (getSalarioDoMes() > 3751.06) {
            return getSalarioDoMes() * 22.5 / 100;
        } else if (getSalarioDoMes() > 2826.66) {
            return getSalarioDoMes() * 15 / 100;
        } else if (getSalarioDoMes() > 1903.98) {
            return getSalarioDoMes() * 7.5 / 100;
        } else {
            return 0.00;
        }
    }

    public double calculeIRPF() {
        if(getQuantidadeDeFilhos()*545 < calculeIR()){
            return getQuantidadeDeFilhos()*545;
        }else {
            return 0.00;
        }
    }
    
    public double calculeSalarioLiquido(double percentual) {
        return getSalarioDoMes() 
                + percentual
                - calculeINSS()
                - calculeIR()
                + calculeIRPF();
    }

}
