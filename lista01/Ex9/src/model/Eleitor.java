/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;


/**
 *
 * @author eduardohilario
 */
public class Eleitor {
    
    private String nome;
    private int anoNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) throws Exception {
        if(anoNascimento < 1900) throw new Exception();
        this.anoNascimento = anoNascimento;
    }
    
    public String podeVotar(){
        int idade = LocalDateTime.now().getYear() - getAnoNascimento();
        String resp = "com "+idade+" você";
        if (idade < 16){
            return resp+" não pode votar";
        }else if (idade < 18 || idade >= 65){
            return resp+" tem o voto facultativo";
        }else {
            return resp+" tem o voto obrigatório";
        }
    }
    
}
