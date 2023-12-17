/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JComboBox;
import view.utils.BaseWindow;

/**
 *
 * @author junio
 */
public class TelaCadastrarColaboradores extends BaseWindow {

    /**
     * Creates new form TelaCadastrarColaboradores
     */
    public TelaCadastrarColaboradores() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_matricula = new javax.swing.JTextField();
        bt_cadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cb_cargo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_telefone = new javax.swing.JTextField();
        lb_numeroOAB = new javax.swing.JLabel();
        txt_numeroOAB = new javax.swing.JTextField();

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
        jLabel1.setText("CADASTRAR COLABORADOR");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 640, 80));

        jPanelFundo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 100));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Cargo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 60, -1));

        txt_matricula.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txt_matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 33, 320, 30));

        bt_cadastrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        bt_cadastrar.setText("CADASTRAR");
        bt_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 500, 60));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nome:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 60, -1));

        txt_nome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 113, 320, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Matrícula:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 80, -1));

        cb_cargo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cb_cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADVOGADO", "ESTAGIÁRIO", "FUNCIONÁRIO" }));
        cb_cargo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_cargoItemStateChanged(evt);
            }
        });
        jPanel1.add(cb_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 73, 320, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Email:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 60, -1));

        txt_email.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 153, 320, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Telefone:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 80, -1));

        txt_telefone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txt_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 193, 320, 30));

        lb_numeroOAB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lb_numeroOAB.setText("Número Na OAB:");
        jPanel1.add(lb_numeroOAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, -1));

        txt_numeroOAB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txt_numeroOAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 233, 320, 30));

        jPanelFundo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 520, 380));

        getContentPane().add(jPanelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed
        this.setVisible(false);
        TelaColaboradores.main(null);
    }//GEN-LAST:event_bt_voltarActionPerformed

    private void bt_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastrarActionPerformed
        String email = txt_email.getText();
        if (validarEmail(email))
            exibirMensagemInformativa("email válido!");
        else
            exibirMensagemInformativa("email inválido!");
    }//GEN-LAST:event_bt_cadastrarActionPerformed

    private void cb_cargoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_cargoItemStateChanged
        JComboBox texto = (JComboBox) evt.getSource();
        if (! texto.getSelectedItem().toString().equalsIgnoreCase(
                "advogado")
           ) {
            txt_numeroOAB.setVisible(false);
            lb_numeroOAB.setVisible(false);
        }
        else {
            txt_numeroOAB.setVisible(true);
            lb_numeroOAB.setVisible(true);
        }
    }//GEN-LAST:event_cb_cargoItemStateChanged

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
            java.util.logging.Logger.getLogger(TelaCadastrarColaboradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarColaboradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarColaboradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarColaboradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarColaboradores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JComboBox<String> cb_cargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JLabel lb_numeroOAB;
    private javax.swing.JLabel lb_voltar;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_matricula;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_numeroOAB;
    private javax.swing.JTextField txt_telefone;
    // End of variables declaration//GEN-END:variables

    @Override
    protected Object[] templedMethodObjectType(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }







}
