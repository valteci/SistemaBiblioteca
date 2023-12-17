/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.Iterator;


public class Livro implements ILivro {
    
    private Date DateAnoPublicacao = null;
    private String isbn = "";
    private String titulo = "";
    private int edicao = -1;
    private IAreaDireito areaDireito = null;
    private IEditora editora = null;
    private Iterator<IAutor> autoresLivro = null;
    private boolean absoleto = false;
    
    public Livro() {};
    
    public Livro(String isbn) {
        this.isbn = isbn;
    }

    public Date getAnoPublicacao() {
        return DateAnoPublicacao;
    }

    public void setAnoPublicacao(Date DateAnoPublicacao) {
        this.DateAnoPublicacao = DateAnoPublicacao;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public IAreaDireito getAreaDireito() {
        return areaDireito;
    }

    public void setAreaDireito(IAreaDireito areaDireito) {
        this.areaDireito = areaDireito;
    }

    public IEditora getEditora() {
        return editora;
    }

    public void setEditora(IEditora editora) {
        this.editora = editora;
    }

    public Iterator<IAutor> getAutoresLivro() {
        return autoresLivro;
    }

    public void setAutoresLivro(Iterator<IAutor> autoresLivro) {
        this.autoresLivro = autoresLivro;
    }
    
    public boolean estaAbsoleto() {
        return this.absoleto;
    }
}
