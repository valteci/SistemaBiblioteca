/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;


public class Reserva implements IReserva {
    
    private IAdvogado advogado = null;
    private Date dataReserva = null;
    private Date dataLiberacao = null;
    private IExemplar exemplarReserva = null;
    
    public Reserva() {};
    
    public Reserva(IAdvogado advogado, IExemplar exemplar) {
        this.advogado = advogado;
        this.exemplarReserva = exemplar;
    }
    
    @Override
    public IAdvogado getAdvogado() {
        return advogado;
    }

    @Override
    public void setAdvogado(IAdvogado advogado) {
        this.advogado = advogado;
    }

    @Override
    public Date getDataLiberacao() {
        return this.dataLiberacao;
    }

    @Override
    public void setDataLiberacao(Date data) {
        this.dataLiberacao = data;
    }

    

    @Override
    public IExemplar getExemplarReserva() {
        return exemplarReserva;
    }

    @Override
    public void setExemplarReserva(IExemplar exemplar) {
        this.exemplarReserva = exemplar;
    }

    @Override
    public Date getDataReserva() {
        return this.dataReserva;
    }

    @Override
    public void setDataReserva(Date data) {
        this.dataReserva = data;
    }
    
    
    
    
}
