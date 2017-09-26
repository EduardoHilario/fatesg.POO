/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;
import model.Produto;

/**
 *
 * @author eduardohilario
 */
public class MainTeste {
    public static void main(String[] args) {
        Produto[] listaProdutos = new Produto[5];
        
        listaProdutos[0] = new Produto("Arroz",001,10);
        listaProdutos[1] = new Produto("Feijão", 002, 6);
        listaProdutos[2] = new Produto("Açucar", 003, 3.5);
        listaProdutos[3] = new Produto("Leite", 004, 1.5);
        listaProdutos[4] = new Produto("Cerveja", 005, 7.5);
        
        
        double novoValor = Double.parseDouble(JOptionPane.showInputDialog("Informe o novo valor: R$"));
        listaProdutos[4].setValorCusto(novoValor);
        
        
        String mostra = "";
        for(Produto produto: listaProdutos){
            mostra += "\n"+produto.toString();
        }
        
        //JOptionPane.showMessageDialog(null,mostra);
        
        JOptionPane.showMessageDialog(null,mostra);
        
    }
}
