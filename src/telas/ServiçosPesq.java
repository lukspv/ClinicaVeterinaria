/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author lucas
 */
public class ServiçosPesq extends javax.swing.JFrame {

    /**
     * Creates new form Prinicipal
     */
    public ServiçosPesq() {
        initComponents();
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
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Tela Principal");
        setMinimumSize(new java.awt.Dimension(1280, 722));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 722));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 37)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pesquisar Serviço");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(450, 70, 370, 60);

        jTextField1.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        jTextField1.setToolTipText("");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(430, 170, 342, 56);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 270, 90, 60);

        jTextField2.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        jTextField2.setToolTipText("");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(340, 270, 572, 56);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tempo");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 350, 110, 60);

        jTextField3.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        jTextField3.setToolTipText("");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(340, 350, 572, 56);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Valor");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 430, 100, 60);

        jTextField4.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        jTextField4.setToolTipText("");
        getContentPane().add(jTextField4);
        jTextField4.setBounds(340, 430, 572, 56);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 170, 140, 60);

        jButton1.setBackground(new java.awt.Color(10, 140, 84));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow_back_ios-24px.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 30, 80, 60);

        jButton4.setBackground(new java.awt.Color(48, 157, 77));
        jButton4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Pesquisar");
        jButton4.setBorder(null);
        jButton4.setPreferredSize(new java.awt.Dimension(250, 121));
        getContentPane().add(jButton4);
        jButton4.setBounds(790, 160, 149, 77);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Ativo 1.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 722);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ServiçosPesq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiçosPesq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiçosPesq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiçosPesq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiçosPesq().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
