/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.Iterator;


public interface IController {
    
    
    public String getEmail() throws Exception;
    public String getHashSenha() throws Exception;
    
    //CREUD autor
    public Iterator<IAutor> getTodosAutores() throws Exception;
    public IAutor getAutor(int id) throws Exception;
    public void alterarAutor(IAutor novoAutor) throws Exception;
    public void removerAutor(int idAutor) throws Exception;
    public void criarAutor(IAutor autor) throws Exception;
    public boolean existeAutor(int idAutor) throws Exception;
}
