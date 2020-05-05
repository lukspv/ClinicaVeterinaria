/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dao.ProdutoDao;
import entidade.Produto;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author lucas
 */
public class ProdutosCad extends javax.swing.JFrame {

    /**
     * Creates new form Prinicipal
     */
    public ProdutosCad() throws ParseException {
        initComponents();
        txtqtd.setModel(new SpinnerNumberModel(0, 0, 100, 1)); //sequencia de parametros é: o valor inicial, mínimo, máximo, incremento/decremento…
        txtvalidade.setDateFormatString("dd/MM/yyyy");

        Date dataAtual = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateFormat.format(dataAtual);

        String date = dataFormatada;
        java.util.Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        //System.out.println("Data: "+new Date());
        txtvalidade.setDate(date2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        txtvalor = new javax.swing.JFormattedTextField();
        txtvalidade = new com.toedter.calendar.JDateChooser();
        txtqtd = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Tela Principal");
        setMinimumSize(new java.awt.Dimension(1280, 722));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 722));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 190, 140, 60);

        txtcodigo.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        txtcodigo.setToolTipText("");
        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });
        getContentPane().add(txtcodigo);
        txtcodigo.setBounds(340, 190, 342, 56);

        txtnome.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        txtnome.setToolTipText("");
        txtnome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomeKeyTyped(evt);
            }
        });
        getContentPane().add(txtnome);
        txtnome.setBounds(340, 270, 572, 56);

        try {
            txtvalor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.00")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtvalor.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        getContentPane().add(txtvalor);
        txtvalor.setBounds(780, 440, 130, 56);

        txtvalidade.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        getContentPane().add(txtvalidade);
        txtvalidade.setBounds(340, 350, 572, 56);

        txtqtd.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        getContentPane().add(txtqtd);
        txtqtd.setBounds(340, 440, 120, 56);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 270, 90, 60);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Validade");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 350, 140, 60);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantidade");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(150, 430, 170, 60);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Valor");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(670, 430, 90, 60);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 37)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cadastrar Produto");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(450, 70, 370, 60);

        jButton7.setBackground(new java.awt.Color(0, 135, 255));
        jButton7.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save-24px.png"))); // NOI18N
        jButton7.setText("Salvar");
        jButton7.setBorder(null);
        jButton7.setPreferredSize(new java.awt.Dimension(250, 121));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(510, 610, 204, 71);

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

        Produto p = new Produto();
        ProdutoDao pdao = new ProdutoDao();

        if (txtnome.getText().equals("") || txtvalor.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Por favor preencher todos os campos Obrigatorios!!");

        } else {

            p.setProid(Integer.parseInt(txtcodigo.getText()));
            p.setPronome(txtnome.getText());
            p.setProdval(txtvalidade.getDate().toString());
            p.setQtd(Integer.parseInt(txtqtd.getValue().toString()));
            p.setProdvalor(Double.parseDouble(txtvalor.getText()));

            try {
                pdao.Cadastrar(p);
                JOptionPane.showMessageDialog(this, "Dados Salvos Com Sucesso!");
            } catch (SQLException ex) {
                Logger.getLogger(ProdutosCad.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Cadastro ja Existente para o Codigo ou Nome Informado", "Atenção", 0);
            }

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtnomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomeKeyTyped

        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txtnomeKeyTyped

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcodigoKeyTyped

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
            java.util.logging.Logger.getLogger(ProdutosCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutosCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutosCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutosCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new ProdutosCad().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(ProdutosCad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnome;
    private javax.swing.JSpinner txtqtd;
    private com.toedter.calendar.JDateChooser txtvalidade;
    private javax.swing.JFormattedTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
