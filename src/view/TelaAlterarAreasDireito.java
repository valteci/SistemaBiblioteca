/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import view.utils.BaseWindow;

/**
 *
 * @author junio
 */
public class TelaAlterarAreasDireito extends BaseWindow {

    /**
     * Creates new form TelaAlterarColaborador
     */
    public TelaAlterarAreasDireito() {
        super(null);
        initComponents();
        jPanel = jPanelFundo;
        aplicarConfiguracoes();
        carregarImagem(lb_voltar, "voltar.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lb_voltar = new javax.swing.JLabel();
        bt_voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_matricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        ckb_alterarNome = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(lb_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 60));

        bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarActionPerformed(evt);
            }
        });
        jPanel2.add(bt_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALTERAR ÁREA DO DIREITO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 720, 80));

        jPanelFundo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 100));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("ALTERAR");
        jPanelFundo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 150, 50));

        txt_matricula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanelFundo.add(txt_matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Id da Area:");
        jPanelFundo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Novo Nome Da Área:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 160, -1));

        txt_nome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_nome.setEnabled(false);
        jPanel1.add(txt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 230, -1));

        ckb_alterarNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ckb_alterarNome.setText("Alterar");
        ckb_alterarNome.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckb_alterarNomeItemStateChanged(evt);
            }
        });
        ckb_alterarNome.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ckb_alterarNomeStateChanged(evt);
            }
        });
        jPanel1.add(ckb_alterarNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        jPanelFundo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 470, 100));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("ALTERE OS DADOS");
        jPanelFundo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        getContentPane().add(jPanelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed
        this.setVisible(false);
        TelaAreasDireito.main(null);
    }//GEN-LAST:event_bt_voltarActionPerformed

    private void ckb_alterarNomeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ckb_alterarNomeStateChanged
                
    }//GEN-LAST:event_ckb_alterarNomeStateChanged

    private void ckb_alterarNomeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ckb_alterarNomeItemStateChanged
        JCheckBox ckb = (JCheckBox) evt.getSource();
        if (ckb.isSelected()) {
            txt_nome.setEnabled(true);
        }
        else {
            txt_nome.setText("");
            txt_nome.setEnabled(false);
        }
    }//GEN-LAST:event_ckb_alterarNomeItemStateChanged

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
            java.util.logging.Logger.getLogger(TelaAlterarAreasDireito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarAreasDireito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarAreasDireito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarAreasDireito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaAlterarAreasDireito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_voltar;
    private javax.swing.JCheckBox ckb_alterarNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JLabel lb_voltar;
    private javax.swing.JTextField txt_matricula;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables
}