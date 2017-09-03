package view;

import javax.swing.JOptionPane;

/**
 *
 * @author eduardohilario
 */
public class Msg {
    
    static public void validaNegativo(){
        JOptionPane.showMessageDialog(null, "ERRO! Por favor verifique os campos e tente"
                + " novamente.");
    }
    
    static public void operacaoInvalidaParaObjeto(){
        JOptionPane.showMessageDialog(null, "ERRO! Esta operação não pode ser realizada"
                + " para este tipo de objeto.");
    }
}
