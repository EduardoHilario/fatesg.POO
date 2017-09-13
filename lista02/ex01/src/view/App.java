/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ContaPoupanca;

/**
 *
 * @author eduardohilario
 */
public class App extends javax.swing.JFrame {
    
    ContaPoupanca contaPoupanca = new ContaPoupanca();

    /**
     * Creates new form App
     */
    public App() {
        initComponents();
        labelSaldo.setText("Crie uma nova conta");
        outSaldo.setVisible(false);
        btnSaque.setEnabled(false);
        btnDeposito.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        inputAgencia = new javax.swing.JTextField();
        inputConta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnSaque = new javax.swing.JButton();
        btnDeposito = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelSaldo = new javax.swing.JLabel();
        outSaldo = new javax.swing.JLabel();
        btnNovaConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Conta Poupança");

        jLabel2.setText("Nome do Cliente:");

        jLabel3.setText("Agência:");

        jLabel4.setText("Conta:");

        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });

        btnSaque.setText("Saque");
        btnSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaqueActionPerformed(evt);
            }
        });

        btnDeposito.setText("Depósito");
        btnDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(106, 102, 99));

        labelSaldo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelSaldo.setForeground(new java.awt.Color(254, 254, 254));
        labelSaldo.setText("Saldo: R$");

        outSaldo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        outSaldo.setForeground(new java.awt.Color(254, 254, 254));
        outSaldo.setText("0,00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outSaldo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSaldo)
                    .addComponent(outSaldo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNovaConta.setText("Nova Conta");
        btnNovaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(inputAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(inputConta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNovaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnNovaConta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaque)
                    .addComponent(btnDeposito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeActionPerformed

    private void btnNovaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaContaActionPerformed
        contaPoupanca.setNome(inputNome.getText());
        try {
            contaPoupanca.setAgencia(Integer.parseInt(inputAgencia.getText()));
            contaPoupanca.setNumeroDaConta(Integer.parseInt(inputConta.getText()));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Nova Conta"
                + "\nNome: "+contaPoupanca.getNome()
                + "\nAgência: "+contaPoupanca.getAgencia()
                + "\nConta: "+contaPoupanca.getNumeroDaConta()
                + "\nSaldo: "+contaPoupanca.getSaldo());
        
        inputAgencia.setEnabled(false);
        inputNome.setEnabled(false);
        inputConta.setEnabled(false);
        btnNovaConta.setEnabled(false);
        btnSaque.setEnabled(true);
        btnDeposito.setEnabled(true);
        labelSaldo.setText("Saldo: R$");
        outSaldo.setVisible(true);
        
    }//GEN-LAST:event_btnNovaContaActionPerformed

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
        try {
            contaPoupanca.deposite(
                    Double.parseDouble(JOptionPane.showInputDialog("Valor: ")));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        outSaldo.setText(Double.toString(contaPoupanca.getSaldo()));
    }//GEN-LAST:event_btnDepositoActionPerformed

    private void btnSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaqueActionPerformed
        try {
            contaPoupanca.saque(
                    Double.parseDouble(JOptionPane.showInputDialog("Valor: ")));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        outSaldo.setText(Double.toString(contaPoupanca.getSaldo()));
    }//GEN-LAST:event_btnSaqueActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnNovaConta;
    private javax.swing.JButton btnSaque;
    private javax.swing.JTextField inputAgencia;
    private javax.swing.JTextField inputConta;
    private javax.swing.JTextField inputNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelSaldo;
    private javax.swing.JLabel outSaldo;
    // End of variables declaration//GEN-END:variables
}
