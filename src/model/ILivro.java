/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.Date;
import java.util.ArrayList;

public interface ILivro {
    public Date getAnoPublicacao();
    public String getISBN();
    public String getTitulo();
    public int getEdicao();
    public IAreaDireito getAreaDireito();
    public IEditora getEditora();
    public ArrayList<IAutor> getAutoresLivro();
    public boolean estaAbsoleto();
    
    public void setAnoPublicacao(Date ano);
    public void setISBN(String ISBN);
    public void setTitulo(String titulo);
    public void setEdicao(String edicao);
    public void setAreaDireito(IAreaDireito areaDireito);
    public void setEditora(IEditora editora);
    public void setAutoresLivro(ArrayList<IAutor> autores);
    
    
}






