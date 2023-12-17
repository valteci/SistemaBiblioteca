/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import view.utils.*;
import java.awt.Image;
import javax.swing.ImageIcon;

public class MainWindow extends BaseWindow {
        
    
    public MainWindow() {
        super(null);
        initComponents();        

        setarImagemBotoes();
        jPanel = jPanelFundo;
        aplicarConfiguracoes();
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
        jLabel1 = new javax.swing.JLabel();
        lb_livros = new javax.swing.JLabel();
        bt_livros = new javax.swing.JButton();
        lb_colaboradores = new javax.swing.JLabel();
        bt_colaboradores = new javax.swing.JButton();
        lb_emprestimos = new javax.swing.JLabel();
        bt_emprestimos = new javax.swing.JButton();
        lb_reservas = new javax.swing.JLabel();
        bt_reservas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");
        jPanelFundo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1270, 40));
        jPanelFundo.add(lb_livros, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 170, 110));

        bt_livros.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        bt_livros.setText("LIVROS");
        bt_livros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        bt_livros.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bt_livros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_livrosActionPerformed(evt);
            }
        });
        jPanelFundo.add(bt_livros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 605, 290));
        jPanelFundo.add(lb_colaboradores, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 170, 110));

        bt_colaboradores.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        bt_colaboradores.setText("COLABORADORES");
        bt_colaboradores.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        bt_colaboradores.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bt_colaboradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_colaboradoresActionPerformed(evt);
            }
        });
        jPanelFundo.add(bt_colaboradores, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 605, 290));
        jPanelFundo.add(lb_emprestimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 170, 110));

        bt_emprestimos.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        bt_emprestimos.setText("EMPRÉSTIMOS");
        bt_emprestimos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        bt_emprestimos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bt_emprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_emprestimosActionPerformed(evt);
            }
        });
        jPanelFundo.add(bt_emprestimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 605, 290));
        jPanelFundo.add(lb_reservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, 170, 110));

        bt_reservas.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        bt_reservas.setText("RESERVAS");
        bt_reservas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        bt_reservas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bt_reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reservasActionPerformed(evt);
            }
        });
        jPanelFundo.add(bt_reservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 605, 290));

        getContentPane().add(jPanelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_colaboradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_colaboradoresActionPerformed
        
        this.setVisible(false);
        TelaColaboradores.main(null);
    }//GEN-LAST:event_bt_colaboradoresActionPerformed

    private void bt_livrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_livrosActionPerformed
        this.setVisible(false);
        TelaMenuLivro.main(null);
    }//GEN-LAST:event_bt_livrosActionPerformed

    private void bt_emprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_emprestimosActionPerformed
        this.setVisible(false);
        TelaMenuEmprestimo.main(null);
    }//GEN-LAST:event_bt_emprestimosActionPerformed

    private void bt_reservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reservasActionPerformed
        this.setVisible(false);
        TelaReservas.main(null);
    }//GEN-LAST:event_bt_reservasActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_colaboradores;
    private javax.swing.JButton bt_emprestimos;
    private javax.swing.JButton bt_livros;
    private javax.swing.JButton bt_reservas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JLabel lb_colaboradores;
    private javax.swing.JLabel lb_emprestimos;
    private javax.swing.JLabel lb_livros;
    private javax.swing.JLabel lb_reservas;
    // End of variables declaration//GEN-END:variables



    private void setarImagemBotoes() {
        try {
            
            carregarImagem(lb_livros, "livros.png");
            carregarImagem(lb_colaboradores, "colaboradores.png");
            carregarImagem(lb_emprestimos, "emprestimos.png");
            carregarImagem(lb_reservas, "reservas.png");                                    
                        
        } catch (Exception e) {
            exibirMesagemDeErro(e.getMessage());
        }
    }

    @Override
    protected Object[] templedMethodObjectType(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
