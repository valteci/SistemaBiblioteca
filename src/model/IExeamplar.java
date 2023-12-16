/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.Date;


public interface IExeamplar {
    
    //atributos
    public int getId();
    public double getPreco();
    public boolean estaAtivo();
    public Date getDataAquisicao();
    public void setId(int id);
    public void setPreco(double preco);
    public void setDataAquisicao(Date data);
    
    //lado n da relação
    public ILivro getLivro();
    public String getMotivoExclusao();
    public void setLivro(ILivro livro);
    public void setMotivoExclusao(String motivo);
    
    //relacionamentos
    public boolean estaReservado();
    public boolean estaEmprestado();
    
}

