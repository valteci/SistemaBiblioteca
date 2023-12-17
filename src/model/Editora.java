/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Editora  implements IEditora {
    
    private int id = -1;
    private String nome = "";
    private String local = "";
    
    public Editora() {};
    
    public Editora(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }
    
    public Editora(
        int idEditora,
        String nome,
        String local
    ) {        
        this.id = idEditora;
        this.nome = nome;
        this.local = local;
    }

    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getLocal() {
        return local;
    }

    @Override
    public void setLocal(String local) {
        this.local = local;
    }
    
    
    
}
