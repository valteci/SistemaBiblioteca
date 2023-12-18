/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.Date;
import java.util.ArrayList;
import java.util.Iterator;

public interface ILivro {
    public Date getAnoPublicacao();
    public String getISBN();
    public String getTitulo();
    public int getEdicao();
    public IAreaDireito getAreaDireito();
    public IEditora getEditora();
    public Iterator<IAutor> getAutoresLivro();
    public boolean estaAbsoleto();
    
    
    public void setAnoPublicacao(Date ano);
    public void setISBN(String isbn);
    public void setTitulo(String titulo);
    public void setEdicao(int edicao);
    public void setAreaDireito(IAreaDireito areaDireito);
    public void setEditora(IEditora editora);
    public void setAutoresLivro(Iterator<IAutor> autores);
    public void setEstaAbsoleto(boolean val);
    
    
}






