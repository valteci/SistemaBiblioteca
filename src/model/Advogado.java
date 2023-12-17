/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Iterator;


public class Advogado extends Colaborador implements IAdvogado{
    
    String numeroOAB = "";
    Iterator<IReserva> reservas = null;
    
    public Advogado() {
        super();
    }
    
    public Advogado(String matricula) {
        super(matricula);
    }
    
    public Advogado(String matricula, String numeroOAB) {
        super(matricula);
        this.numeroOAB = numeroOAB;
    }

    @Override
    public String getNumeroOAB() {
        return numeroOAB;
    }

    @Override
    public void setNumeroOAB(String numeroOAB) {
        this.numeroOAB = numeroOAB;
    }

    @Override
    public Iterator<IReserva> getReservas() {
        return this.reservas;
    }

    @Override
    public void setReservas(Iterator<IReserva> reservas) {
        this.reservas = reservas;
    }
    
    
    
    
}
