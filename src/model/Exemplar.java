/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.Iterator;


public class Exemplar implements IExemplar {
    
    private int id = -1;
    private double preco = 0;
    private boolean ativo = true;
    private Date dataAquisicao = null;
    private Iterator<IEmprestimo> emprestimos = null;
    private ILivro livro = null;
    private String motivoExclusao = "";
    private Iterator<IReserva> reservas = null;
    
    
    public Exemplar() {};
    
    public Exemplar(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean estaAtivo() {
        return ativo;
    }

    @Override
    public Iterator<IEmprestimo> getEmprestimos() {
        return emprestimos;
    }

    @Override
    public void setEmprestimos(Iterator<IEmprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    @Override
    public ILivro getLivro() {
        return livro;
    }

    @Override
    public void setLivro(ILivro livro) {
        this.livro = livro;
    }

    @Override
    public String getMotivoExclusao() {
        return motivoExclusao;
    }

    @Override
    public void setMotivoExclusao(String motivoExclusao) {
        this.motivoExclusao = motivoExclusao;
    }

    @Override
    public Iterator<IReserva> getReservas() {
        return reservas;
    }

    @Override
    public void setReservas(Iterator<IReserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public Date getDataAquisicao() {
        return this.dataAquisicao;
    }

    @Override
    public void setDataAquisicao(Date data) {
        this.dataAquisicao = data;
    }

    @Override
    public boolean estaReservado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean estaEmprestado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
}
