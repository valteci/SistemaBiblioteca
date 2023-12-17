/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import data.Banco;
import data.IBanco;
import view.Login;


public class SistemaBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            IBanco banco = Banco.getInstance("postgres", "1Z2ht6b.", "SistemaBiblioteca");
        } catch(Exception erro) {
            System.err.println(erro.getMessage());
        }
        
        Login.main(null);
    }
    
}
