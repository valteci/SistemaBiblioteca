/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.ArrayList;


public interface IColaborador {
    
    public String getMatricula();
    public String getEmail();
    public String getNome();
    public String getTelefone();
    public boolean estaAtivo();
    public ArrayList<IEmprestimo> getLivrosEmprestimo();
    
    public void setMatricula(String matricula);
    public void setEmail(String email);
    public void setNome(String nome);
    public void setTelefone(String telefone);
    public void setLivrosEmprestimos(ArrayList<IEmprestimo> livros);
    
    
}
