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
public class Gerenciar extends javax.swing.JFrame {

    /**
     * Creates new form Prinicipal
     */
    public Gerenciar() {
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
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Tela Principal");
        setMinimumSize(new java.awt.Dimension(1280, 722));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 722));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 37)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gerenciar");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(550, 70, 160, 60);

        jButton1.setBackground(new java.awt.Color(10, 140, 84));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow_back_ios-24px.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 30, 80, 60);

        jButton5.setBackground(new java.awt.Color(0, 135, 255));
        jButton5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icone Shopping.png"))); // NOI18N
        jButton5.setText("Produto");
        jButton5.setBorder(null);
        jButton5.setPreferredSize(new java.awt.Dimension(250, 121));
        getContentPane().add(jButton5);
        jButton5.setBounds(640, 210, 285, 125);

        jButton6.setBackground(new java.awt.Color(0, 135, 255));
        jButton6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icone Animal.png"))); // NOI18N
        jButton6.setText("Animais");
        jButton6.setBorder(null);
        jButton6.setPreferredSize(new java.awt.Dimension(250, 121));
        getContentPane().add(jButton6);
        jButton6.setBounds(640, 350, 285, 125);

        jButton2.setBackground(new java.awt.Color(0, 135, 255));
        jButton2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icone Serviço.png"))); // NOI18N
        jButton2.setText("Serviço");
        jButton2.setBorder(null);
        jButton2.setPreferredSize(new java.awt.Dimension(250, 121));
        getContentPane().add(jButton2);
        jButton2.setBounds(340, 350, 285, 125);

        jButton4.setBackground(new java.awt.Color(0, 135, 255));
        jButton4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icone Funcionario.png"))); // NOI18N
        jButton4.setText("Funcionario");
        jButton4.setBorder(null);
        jButton4.setPreferredSize(new java.awt.Dimension(250, 121));
        getContentPane().add(jButton4);
        jButton4.setBounds(340, 210, 285, 125);

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
            java.util.logging.Logger.getLogger(Gerenciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerenciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerenciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerenciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gerenciar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
