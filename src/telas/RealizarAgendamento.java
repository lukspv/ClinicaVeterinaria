/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class RealizarAgendamento extends javax.swing.JFrame {

    /**
     * Creates new form Prinicipal
     */
    public RealizarAgendamento() throws ParseException {
        initComponents();
        txtdatagen.setDateFormatString("dd/MM/yyyy");

        Date dataAtual = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateFormat.format(dataAtual);

        String date = dataFormatada;
        java.util.Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        //System.out.println("Data: "+new Date());
        txtdatagen.setDate(date2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtservico = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JFormattedTextField();
        txtdatagen = new com.toedter.calendar.JDateChooser();
        jTextField5 = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Tela Principal");
        setMinimumSize(new java.awt.Dimension(1280, 722));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 722));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 37)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Realizar Agendamento");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(450, 70, 380, 60);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nome do Paciente");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 170, 280, 60);

        txtnome.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        txtnome.setToolTipText("");
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });
        txtnome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomeKeyTyped(evt);
            }
        });
        getContentPane().add(txtnome);
        txtnome.setBounds(390, 170, 572, 56);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Serviço");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 270, 130, 60);

        txtservico.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        txtservico.setToolTipText("");
        txtservico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtservicoKeyTyped(evt);
            }
        });
        getContentPane().add(txtservico);
        txtservico.setBounds(340, 270, 572, 56);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 360, 90, 60);

        try {
            jTextField6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###,00")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextField6.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(490, 470, 270, 56);

        txtdatagen.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        getContentPane().add(txtdatagen);
        txtdatagen.setBounds(220, 360, 340, 56);

        jTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jTextField5.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(730, 360, 340, 56);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hora");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(650, 360, 90, 60);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Valor Total");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(320, 470, 170, 60);

        jButton7.setBackground(new java.awt.Color(0, 135, 255));
        jButton7.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save-24px.png"))); // NOI18N
        jButton7.setText("Salvar");
        jButton7.setPreferredSize(new java.awt.Dimension(250, 121));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(510, 550, 204, 71);

        jButton1.setBackground(new java.awt.Color(10, 140, 84));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow_back_ios-24px.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 30, 80, 60);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Ativo 1.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 722);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        if (txtservico.getText().equals("") || txtnome.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Por favor preencher todos os campos Obrigatorios!!");

        } else {

            JOptionPane.showMessageDialog(this, "Dados Salvos Com Sucesso!");

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void txtnomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomeKeyTyped

        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }

// TODO add your handling code here:
    }//GEN-LAST:event_txtnomeKeyTyped

    private void txtservicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtservicoKeyTyped
        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        } // TODO add your handling code here:
    }//GEN-LAST:event_txtservicoKeyTyped

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
            java.util.logging.Logger.getLogger(RealizarAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealizarAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealizarAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealizarAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RealizarAgendamento().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(RealizarAgendamento.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JFormattedTextField jTextField5;
    private javax.swing.JFormattedTextField jTextField6;
    private com.toedter.calendar.JDateChooser txtdatagen;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtservico;
    // End of variables declaration//GEN-END:variables
}