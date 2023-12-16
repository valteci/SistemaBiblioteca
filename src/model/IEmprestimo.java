/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.Date;


public interface IEmprestimo {
    public IExemplar getExemplar();
    public IColaborador getColaborador();
    public double getMulta();
    public Date getDataEmprestimo();
    public Date getDataDevolucao();
    
    public void setExemplar(IExemplar exemplar);
    public void setColaborador(IColaborador colaborador);
    public void setMulta(double multa);
    public void setDataEmprestimo(Date data);
    public void setDataDevolucao(Date data);
    
    
}
