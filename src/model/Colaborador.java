/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;


public abstract class Colaborador implements IColaborador {
        
    private String matricula = "";
    private String email = "";
    private String nome = "";
    private String telefone = "";
    private boolean estaAtivo = true;
    
    
    public Colaborador() {};
    
    public Colaborador(String matricula) {
        this.matricula = matricula;        
    }
   

    @Override
    public String getMatricula() {
        return this.matricula;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getTelefone() {
        return this.telefone;
    }

    @Override
    public boolean estaAtivo() {
        return this.estaAtivo;
    }

    @Override
    public ArrayList<IEmprestimo> getLivrosEmprestimo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void setLivrosEmprestimos(ArrayList<IEmprestimo> livros) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
