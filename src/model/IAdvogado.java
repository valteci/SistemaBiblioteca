/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.Iterator;


public interface IAdvogado extends IColaborador {
    public String getNumeroOAB();
    public void setNumeroOAB(String numeroOAB);
    
    public Iterator<IReserva> getReservas();
    public void setReservas(Iterator<IReserva> reservas);
    
}
