/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;


public interface IExemplar {
    
    //atributos
    public int getId();
    public double getPreco();
    public boolean estaAtivo();
    public Date getDataAquisicao();
    public void setId(int id);
    public void setPreco(double preco);
    public void setDataAquisicao(Date data);
    public Iterator<IEmprestimo> getEmprestimos();
    
    //lado n da relação
    public ILivro getLivro();
    public String getMotivoExclusao();
    public void setLivro(ILivro livro);
    public void setMotivoExclusao(String motivo);    
    
    //relacionamentos
    public boolean estaReservado();
    public boolean estaEmprestado();
    public void setEmprestimos(Iterator<IEmprestimo> livros);
    
    public Iterator<IReserva> getReservas();
    public void setReservas(Iterator<IReserva> reservas);
    
}

