/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import view.utils.*;
import java.awt.Image;
import javax.swing.ImageIcon;

public class TelaMenuLivro extends BaseWindow {

    
    private final String pastaImagem = "./src/view/img/";
    
    public TelaMenuLivro() {
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
        lb_autores = new javax.swing.JLabel();
        bt_autores = new javax.swing.JButton();
        lb_editoras = new javax.swing.JLabel();
        bt_editoras = new javax.swing.JButton();
        lb_areasDireito = new javax.swing.JLabel();
        bt_areasDireito = new javax.swing.JButton();
        lb_exemplares = new javax.swing.JLabel();
        bt_exemplares = new javax.swing.JButton();
        lb_removerLivroOuExemplar = new javax.swing.JLabel();
        bt_removerLivroOuExemplar = new javax.swing.JButton();
        lb_voltar = new javax.swing.JLabel();
        bt_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU - LIVROS");
        jPanelFundo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1270, 40));
        jPanelFundo.add(lb_livros, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 170, 110));

        bt_livros.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        bt_livros.setText("LIVROS");
        bt_livros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        bt_livros.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bt_livros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_livrosActionPerformed(evt);
            }
        });
        jPanelFundo.add(bt_livros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 400, 230));
        jPanelFundo.add(lb_autores, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 170, 110));

        bt_autores.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        bt_autores.setText("AUTORES");
        bt_autores.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        bt_autores.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bt_autores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_autoresActionPerformed(evt);
            }
        });
        jPanelFundo.add(bt_autores, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 400, 230));
        jPanelFundo.add(lb_editoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, 170, 110));

        bt_editoras.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        bt_editoras.setText("EDITORAS");
        bt_editoras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        bt_editoras.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bt_editoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editorasActionPerformed(evt);
            }
        });
        jPanelFundo.add(bt_editoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 400, 230));
        jPanelFundo.add(lb_areasDireito, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 170, 110));

        bt_areasDireito.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        bt_areasDireito.setText("ÁREAS DO DIREITO");
        bt_areasDireito.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        bt_areasDireito.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bt_areasDireito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_areasDireitoActionPerformed(evt);
            }
        });
        jPanelFundo.add(bt_areasDireito, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 400, 230));
        jPanelFundo.add(lb_exemplares, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 170, 110));

        bt_exemplares.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        bt_exemplares.setText("EXEMPLARES");
        bt_exemplares.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        bt_exemplares.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bt_exemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exemplaresActionPerformed(evt);
            }
        });
        jPanelFundo.add(bt_exemplares, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 400, 230));
        jPanelFundo.add(lb_removerLivroOuExemplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 450, 170, 110));

        bt_removerLivroOuExemplar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        bt_removerLivroOuExemplar.setText("REMOVER LIVRO / EXEMPLAR");
        bt_removerLivroOuExemplar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        bt_removerLivroOuExemplar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bt_removerLivroOuExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_removerLivroOuExemplarActionPerformed(evt);
            }
        });
        jPanelFundo.add(bt_removerLivroOuExemplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, 400, 230));
        jPanelFundo.add(lb_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 60));

        bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarActionPerformed(evt);
            }
        });
        jPanelFundo.add(bt_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 80));

        getContentPane().add(jPanelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_autoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_autoresActionPerformed
        
        this.setVisible(false);
        TelaAutores.main(null);
    }//GEN-LAST:event_bt_autoresActionPerformed

    private void bt_exemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exemplaresActionPerformed
        this.setVisible(false);
        TelaExemplares.main(null);
    }//GEN-LAST:event_bt_exemplaresActionPerformed

    private void bt_removerLivroOuExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_removerLivroOuExemplarActionPerformed
        this.setVisible(false);
        TelaMenuRemocao.main(null);
    }//GEN-LAST:event_bt_removerLivroOuExemplarActionPerformed

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed
        this.setVisible(false);
        MainWindow.main(null);
    }//GEN-LAST:event_bt_voltarActionPerformed

    private void bt_editorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editorasActionPerformed
        this.setVisible(false);
        TelaEditoras.main(null);
    }//GEN-LAST:event_bt_editorasActionPerformed

    private void bt_areasDireitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_areasDireitoActionPerformed
        this.setVisible(false);
        TelaAreasDireito.main(null);
    }//GEN-LAST:event_bt_areasDireitoActionPerformed

    private void bt_livrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_livrosActionPerformed
        this.setVisible(false);
        TelaLivros.main(null);
    }//GEN-LAST:event_bt_livrosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenuLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenuLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenuLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenuLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaMenuLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_areasDireito;
    private javax.swing.JButton bt_autores;
    private javax.swing.JButton bt_editoras;
    private javax.swing.JButton bt_exemplares;
    private javax.swing.JButton bt_livros;
    private javax.swing.JButton bt_removerLivroOuExemplar;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JLabel lb_areasDireito;
    private javax.swing.JLabel lb_autores;
    private javax.swing.JLabel lb_editoras;
    private javax.swing.JLabel lb_exemplares;
    private javax.swing.JLabel lb_livros;
    private javax.swing.JLabel lb_removerLivroOuExemplar;
    private javax.swing.JLabel lb_voltar;
    // End of variables declaration//GEN-END:variables



    private void setarImagemBotoes() {
        try {
            
            carregarImagem(lb_livros, "livros.png");
            carregarImagem(lb_autores, "autor_512.png");
            carregarImagem(lb_editoras, "editora_512.png");
            carregarImagem(lb_areasDireito, "areasDireito_512.png");
            carregarImagem(lb_exemplares, "exemplares.png");
            carregarImagem(lb_removerLivroOuExemplar, "remover.png");
            carregarImagem(lb_voltar, "voltar.png");
            
                        
        } catch (Exception e) {
            exibirMesagemDeErro(e.getMessage());
        }
    }
}
