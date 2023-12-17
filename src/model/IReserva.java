/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.Date;


public interface IReserva {
    public IAdvogado getAdvogado();
    public Date getDataReserva();
    public Date getDataLiberacao();
    public IExemplar getExemplarReserva();
    
    
    public void setAdvogado(IAdvogado advogado);
    public void setDataReserva(Date data);    
    public void setDataLiberacao(Date data);
    public void setExemplarReserva(IExemplar exemplar);
}
