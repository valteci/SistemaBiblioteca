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

    @Override
    public IAutor getAutor(int id) throws Exception {
        IAutor resultado = null;
        IBanco banco = Banco.getInstance();
        
        var resultadoQuery = banco.getAutor(id);
        boolean existeAutor = resultadoQuery.next();
        
        if (! existeAutor)
            throw new Exception("Autor não cadastrado");
        
        String nomeAutor = resultadoQuery.getString("nome");
        
        Autor autor = new Autor(id, nomeAutor);
        
        resultado = autor;
        
        return resultado;
    }

    @Override
    public boolean existeAutor(int idAutor) throws Exception {
        IBanco banco = Banco.getInstance();
        
        var resultadoQuery = banco.getAutor(idAutor);
        boolean existeAutor = resultadoQuery.next();
        
        return existeAutor;
    }
        
    @Override
    public void alterarAutor(IAutor novoAutor) throws Exception {
        IBanco banco = Banco.getInstance();
        if (novoAutor.getNome().equals(""))
            throw new Exception("Selecione ao menos 1 dado para alterar");
        
        banco.alterarAutor(novoAutor);
    }

    @Override
    public void removerAutor(int idAutor) throws Exception {
        IBanco banco = Banco.getInstance();
        banco.removerAutor(idAutor);
    }

    @Override
    public void criarAutor(IAutor autor) throws Exception {
        IBanco banco = Banco.getInstance();
        banco.criarAutor(autor);
    }
    
    
        
    @Override
    public String getEmail() throws Exception {
        IBanco banco = Banco.getInstance();
        return banco.getEmail();
    }

    @Override
    public String getHashSenha() throws Exception {
        IBanco banco = Banco.getInstance();
        return banco.getHashSenha();
    }

    
    
    @Override
    public Iterator<IEditora> getTodasEditoras() throws Exception {
        
        ArrayList<IEditora> resultado = new ArrayList<IEditora>();
        
        IBanco banco = Banco.getInstance();
        
        ResultSet resultadoQuery = banco.getTodasEditoras();
        
        while (resultadoQuery.next()) {
            int id = resultadoQuery.getInt("idEditora");
            String nome = resultadoQuery.getString("nome");
            String local = resultadoQuery.getString("localizacao");
            
            Editora editora = new Editora(id, nome, local);
            resultado.add(editora);
        }
        
        
        return resultado.iterator();
    }

    @Override
    public IEditora getEditora(int id) throws Exception {
        IEditora resultado = null;
        IBanco banco = Banco.getInstance();
        
        var resultadoQuery = banco.getEditora(id);
        boolean existeEditora = resultadoQuery.next();
        
        if (! existeEditora)
            throw new Exception("Editora não cadastrada");
        
        String nomeEditora = resultadoQuery.getString("nome");
        String local = resultadoQuery.getString("localizacao");
        
        Editora editora = new Editora(id, nomeEditora, local);
        
        resultado = editora;
        
        return resultado;
    }

    @Override
    public void alterarEditora(IEditora novaEditora) throws Exception {
        
        IBanco banco = Banco.getInstance();
        
        if (novaEditora.getNome().equals("") && 
            novaEditora.getLocal().equals("")
        ) {            
            throw new Exception("Selecione ao menos 1 dado para alterar");            
        }
        
        banco.alterarEditora(novaEditora);
    }

    @Override
    public void removerEditora(int idEditora) throws Exception {
        IBanco banco = Banco.getInstance();
        banco.removerEditora(idEditora);
    }

    @Override
    public void criarEditora(IEditora editora) throws Exception {
        IBanco banco = Banco.getInstance();
        banco.criarEditora(editora);
    }

    @Override
    public boolean existeEditora(int idEditora) throws Exception {
        IBanco banco = Banco.getInstance();
        
        var resultadoQuery = banco.getEditora(idEditora);
        boolean existeEditora = resultadoQuery.next();
        
        return existeEditora;
    }

    
    
    @Override
    public Iterator<IAreaDireito> getTodasAreasDireito() throws Exception {
        
        ArrayList<IAreaDireito> resultado = new ArrayList<IAreaDireito>();
        
        IBanco banco = Banco.getInstance();
        
        ResultSet resultadoQuery = banco.getTodasAreasDireito();
        
        while (resultadoQuery.next()) {
            int id = resultadoQuery.getInt("idAreaDireito");
            String nome = resultadoQuery.getString("nome");
            
            
            AreaDireito areaDireito = new AreaDireito(id, nome);
            resultado.add(areaDireito);
        }        
        
        return resultado.iterator();
    }

    @Override
    public IAreaDireito getAreaDireito(int id) throws Exception {
        IAreaDireito resultado = null;
        IBanco banco = Banco.getInstance();
        
        var resultadoQuery = banco.getAreaDireito(id);
        boolean existeAreaDireito = resultadoQuery.next();
        
        if (! existeAreaDireito)
            throw new Exception("Área do direito não cadastrada");
        
        String nome = resultadoQuery.getString("nome");
        
        
        AreaDireito areaDireito = new AreaDireito(id, nome);
        
        resultado = areaDireito;
        
        return resultado;
    }

    @Override
    public void alterarAreaDireito(IAreaDireito novaAreaDireito) throws Exception {
        IBanco banco = Banco.getInstance();
        
        if (novaAreaDireito.getNome().equals("")) {            
            throw new Exception("Selecione ao menos 1 dado para alterar");
        }
        
        banco.alterarAreaDireito(novaAreaDireito);
    }

    @Override
    public void removerAreaDireito(int idAreaDireito) throws Exception {
        IBanco banco = Banco.getInstance();
        banco.removerAreaDireito(idAreaDireito);
    }

    @Override
    public void criarAreaDireito(IAreaDireito areaDireito) throws Exception {
        IBanco banco = Banco.getInstance();
        banco.criarAreaDireito(areaDireito);
    }

    @Override
    public boolean existeAreaDireito(int idAreaDireito) throws Exception {
        IBanco banco = Banco.getInstance();
        
        var resultadoQuery = banco.getAreaDireito(idAreaDireito);
        boolean existeAreaDireito = resultadoQuery.next();
        
        return existeAreaDireito;
    }

    
    
    @Override
    public Iterator<ILivro> getTodosLivros() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Livro getLivro(String ISBN) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alterarLivro(ILivro novoLivro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removerLivro(String ISBN) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void criarLivro(ILivro livro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean existeLivro(String ISBN) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    @Override
    public Iterator<IExemplar> getTodosExemplares() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public IExemplar getExemplar(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alterarExemplar(IExemplar novoExempar) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removerExemplar(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void criarExemplar(IExemplar exemplar) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean existeExemplar(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    @Override
    public Iterator<Colaborador> getTodosColoboradores() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Colaborador getColaborador(String matricula) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alterarColaborador(IColaborador novoColaborador) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removerColaborador(String matricula) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void criarColaborador(IColaborador colaborador) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean existeColaborador(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    @Override
    public Iterator<IAutor> getAutoresDoLivro(ILivro livro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setAutoresDoLivro(ILivro livro, Iterator<IAutor> autores) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    @Override
    public void fazerReserva(IReserva reserva) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
    @Override
    public void fazerEmprestimo(IEmprestimo emprestimo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void devolverEmprestimo(IEmprestimo emprestimo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void getEmprestimosEmAtrado() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
    
}
