/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.ArrayList;


public interface IAutor {
    public int getId();
    public String getNome();
    public ArrayList<ILivro> getLivros();
    
    public void setId();
    public void setNome();
    public void setLivros(ArrayList<ILivro> livros);
}
