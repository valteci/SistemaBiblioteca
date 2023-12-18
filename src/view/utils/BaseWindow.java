/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.utils;

import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.IAutor;
import model.IEditora;


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
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    
    private void mouseSairBotao(MouseEvent evt) {
        JButton botao = (JButton) evt.getSource();
        botao.setBackground(PaletaCores.BOTAO);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
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
    
    protected void carregarImagem(JLabel label, String nomeImagem) {
        ImageIcon imagemIcon    = new ImageIcon(pastaImagem + nomeImagem);
        Image imagem            = imagemIcon.getImage();        
        int larguraLabel        = label.getWidth();
        int alturaLabel         = label.getHeight();
        
        Image novaImagem = imagem.getScaledInstance(
                larguraLabel,
                alturaLabel,
                Image.SCALE_AREA_AVERAGING
        );
        
        ImageIcon imagemRedimensionada = new ImageIcon(novaImagem);

        label.setIcon(imagemRedimensionada);
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
    
    protected boolean exibirMensagemConfirmacao(String mensagem) {
        
        int resposta = JOptionPane.showConfirmDialog(
            null,
            mensagem,
            "CONFIRMAÇÃO",
            JOptionPane.YES_NO_OPTION
        );

        if (resposta == JOptionPane.YES_OPTION)            
            return true;
        
        return false;
    }
    
    
    protected String getStringFromUser(String mensagem) {
        String valorDigitado = JOptionPane.showInputDialog(mensagem);
        
        return valorDigitado;
    }
    
    protected int getIntFromUser(String mensagem) throws Exception {
        //retorna -1 se o usuário apertar em cancelar ou fechar o input
        
        
        String valorDigitado = JOptionPane.showInputDialog(mensagem);
        
        if (valorDigitado == null)
            return -1;
        
        int valorDigitadoInt = Integer.parseInt(valorDigitado);
        
        return valorDigitadoInt;
    }
    
    protected boolean validarEmail(String email) {
        String regex    = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-]" +
                          "[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        
        
        return matcher.matches();
    }
    
    protected<T> Iterator<Object> converIteratorToObject(Iterator<T> it) {
        
        ArrayList<Object> resultado = new ArrayList<Object>();
        
        while (it.hasNext()) {
            resultado.add(it.next());
        }
        
        return resultado.iterator();
    }
    
    protected abstract Object[] templedMethodObjectType(Object obj);
    
    
    protected void listarItens(JTable table, Iterator<Object> itens) {
        //tabela deve ter 2 campos: id e nome.
        var model = (DefaultTableModel) table.getModel();
        
        while (model.getRowCount()> 0)
            model.removeRow(0);
        
        while (itens.hasNext()) {
            Object item = itens.next();
            
            model.addRow(templedMethodObjectType(item));
        }
    }
    
    protected void listarItem(JTable table, Object item) {
        
        var model = (DefaultTableModel) table.getModel();

        while (model.getRowCount()> 0)
            model.removeRow(0);


        model.addRow(templedMethodObjectType(item));
    }
                    
    
    protected void listarAutores(JTable table, Iterator<IAutor> autores) {
        //tabela deve ter 2 campos: id e nome.
        var model = (DefaultTableModel) table.getModel();
        
        while (model.getRowCount()> 0)
            model.removeRow(0);
        
        while (autores.hasNext()) {
            IAutor autor = autores.next();
            
            model.addRow(new Object[] {
                    autor.getId(),
                    autor.getNome()                    
                }
            );
                        
        }
    }
    
    protected void listarAutor(JTable table, IAutor autor) {
        //tabela deve ter 2 campos: id e nome.
        var model = (DefaultTableModel) table.getModel();
        
        while (model.getRowCount()> 0)
            model.removeRow(0);
        
        model.addRow(new Object[] {
                autor.getId(),
                autor.getNome()                    
            }
        );
        
    }
    
    
    
    protected Iterator<Object> getLinhaSelecionada(JTable table) throws Exception{
        ArrayList<Object> resultado = new ArrayList<Object>();
        
        int linhaSelecionada = table.getSelectedRow();
        
        if (linhaSelecionada == -1)
            throw new Exception("Selectione um registro primeiro");
        
        var model = (DefaultTableModel) table.getModel();
        int quantidadeColuna = table.getColumnCount();
        
        for (int coluna = 0; coluna < quantidadeColuna; coluna++) {
            
            Object valorColuna = model.getValueAt(
                    linhaSelecionada,
                    coluna
            );
            
            resultado.add(valorColuna);
        }
        
        
        return resultado.iterator();
    }
    
    protected void limparTabela(JTable table) throws Exception {
        var model = (DefaultTableModel) table.getModel();
        
        while (model.getRowCount()> 0)
            model.removeRow(0);
    }

    protected Date strToDate(String data) throws Exception {
        
        Date date = null;
        SimpleDateFormat dataFormato = new SimpleDateFormat(
                    "yyyy-MM-dd"
        );
        
        date = dataFormato.parse(data);
        
        
        return date;
    }
    
}
