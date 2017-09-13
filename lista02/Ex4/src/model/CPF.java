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
public class CPF {
    
    private long numeroCPF;

    public long getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(long numeroCPF) {
        this.numeroCPF = numeroCPF;
    }


    
    public boolean validaCPF(){
        int dv1 = calculeDv1();
        int dv2 = calculeDv2(dv1);
        
        int dvValido = (dv1*10)+dv2;
        int dvInformado = obterVerificador();
        
        if (dvValido == dvInformado){
            return true;
        }else{
            return false;
        }
        
    }
    
    public Integer calculeDv1(){
        int soma = 0;
        long cpf = obterCPF();
        int dv1 = 0;
        
        //Realiza soma das potencias dos numeros
        for(int i=2;i<=10;i++){
            soma += (int)(cpf%10)*i;
            cpf = cpf/10;
            
        }
        
        //Obtem o digito verificador 1
        dv1 = 11-(soma%11);
        if(dv1 > 9){
            dv1 = 0;
        }
        //Retorna Dv1
        return dv1;
        
    }
    
    public int calculeDv2(int dv1) {
        
        int soma = dv1*2;
        long cpf = obterCPF();
        int dv2 = 0;
        
        //Realiza soma das potencias dos numeros
        for(int i=3;i<=11;i++){
            soma += (int)(cpf%10)*i;
            cpf = cpf/10;
            
        }
        
        //Obtem o digito verificador 1
        dv2 = 11-(soma%11);
        if(dv2 > 9){
            dv2 = 0;
        }
        
        //retorna dv2
        return dv2;
    }
    
    public long obterCPF(){
        return numeroCPF/100;
    }
    
    public int obterVerificador(){
        return (int)(numeroCPF%100);
    }
}
