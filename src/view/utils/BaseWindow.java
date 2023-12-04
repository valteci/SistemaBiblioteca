/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.utils;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public abstract class BaseWindow extends javax.swing.JFrame {
    private final String pastaImagem = "./src/view/img/";
    protected JPanel jPanel = null;
    
    public BaseWindow(JPanel fundo) {
        this.jPanel = fundo;
    }
    
    protected void aplicarConfiguracoes() {
        configurarCores(jPanel);
        configurarPosicoes();
        setarLogo();
    }
    
    private void configurarCores(JPanel jPanelFundo) {
        jPanelFundo.setBackground(PaletaCores.FUNDO);
        
        configurarTemaBotes(jPanelFundo);
        configurarTemaPanels(jPanelFundo);
    }
    
    private void configurarTemaPanels(Container container) {
        Component[] componentes = container.getComponents();
        
        for (var componente : componentes) {
            if (componente instanceof JPanel) {
                JPanel panel = (JPanel) componente;
                
                panel.setBorder(
                        BorderFactory.createLineBorder(
                                PaletaCores.PANEL_BORDA,
                                3
                        )
                );
                
                panel.setBackground(PaletaCores.PANEL_FUNDO);
                configurarTemaPanels((Container) componente);                
            }
        }
    }
    
    private void configurarTemaBotes(Container container) {
        Component[] componentes = container.getComponents();
        
        for (var componente : componentes) {
            if (componente instanceof JButton) {
                componente.setBackground(PaletaCores.BOTAO);
                
                ((JButton) componente).addMouseListener(new MouseAdapter() {
                    
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        mouseEntrarBotao(e);
                    }
                    
                    @Override
                    public void mouseExited(MouseEvent e) {
                        mouseSairBotao(e);
                    }
                    
                    @Override
                    public void mousePressed(MouseEvent e) {
                        mousePressedBotao(e);
                    }
                    
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        mouseReleasedBotao(e);
                    }
                });
                
            }
            else if (componente instanceof JPanel) {
                configurarTemaBotes((Container) componente);
            }
        }
    }
    
    private void mouseReleasedBotao(MouseEvent evt) {
        JButton botao = (JButton) evt.getSource();
        botao.setBackground(PaletaCores.BOTAO_RELEASED);
        botao.setForeground(PaletaCores.TEXTO_FONTE);
    }
    
    private void mousePressedBotao(MouseEvent evt) {
        JButton botao = (JButton) evt.getSource();
        botao.setBackground(PaletaCores.BOTAO_CLICK);
        botao.setForeground(PaletaCores.BOTAO);
    }
    
    private void mouseEntrarBotao(MouseEvent evt) {
        JButton botao = (JButton) evt.getSource();
        botao.setBackground(PaletaCores.BOTAO_ENTER);
    }
    
    private void mouseSairBotao(MouseEvent evt) {
        JButton botao = (JButton) evt.getSource();
        botao.setBackground(PaletaCores.BOTAO);
    }
    
    private void configurarPosicoes() {
        this.setLocationRelativeTo(null);
    }

    private void setarLogo() {
        try {
            
            String caminho = pastaImagem + "logo_512.png";
            BufferedImage logo = ImageIO.read(new File(caminho));
            
            setIconImage(logo);
            
        } catch (IOException e) {
            exibirMesagemDeErro(
                    "Erro: não foi possível carregar a imagem"
            );
        
        } catch (Exception e) {
            exibirMesagemDeErro(e.getMessage());
        }
        
        
    }
    
    protected void exibirMesagemDeErro(String mensagem) {
        JOptionPane.showMessageDialog(
                rootPane,
                mensagem,
                "ERRO",
                JOptionPane.ERROR_MESSAGE
        );
    }
    
    protected void exibirMensagemInformativa(String mensagem) {
        JOptionPane.showMessageDialog(
                rootPane,
                mensagem,
                "ERRO",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}