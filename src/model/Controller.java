/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import data.Banco;
import data.IBanco;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.Iterator;


public class Controller implements IController{

    
    private static Controller instance = null;
    
    private Controller() {
        
    }
    
    public static Controller getInstance() {
        if (instance == null)
            instance = new Controller();
        
        return instance;
    }
    
    
    
    @Override
    public Iterator<IAutor> getTodosAutores() throws Exception {
        ArrayList<IAutor> resultado = new ArrayList<IAutor>();
        IBanco banco = Banco.getInstance();
        
        ResultSet resultadoQuery = banco.getTodosAutores();
        
        while (resultadoQuery.next()) {
            int id = resultadoQuery.getInt("idAutor");
            String nome = resultadoQuery.getString("nome");
            
            Autor autor = new Autor(id, nome);
            resultado.add(autor);
        }
        
        return resultado.iterator();
    }
    
}
