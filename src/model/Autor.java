/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Objects;


public class Autor implements IAutor {
    
    private int id = -1;
    private String nome = "";
    
    public Autor() {
    }
    
    public Autor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public Autor(String nome) {
        this.nome = nome;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public ArrayList<ILivro> getLivros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setLivros(ArrayList<ILivro> livros) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Autor other = (Autor) obj;
        return id == other.id;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
}
