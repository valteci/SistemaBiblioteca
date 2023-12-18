/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import data.Banco;
import data.IBanco;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        
        
        ResultSet queryEditora = banco.getEditora(id);
        boolean existeEditora = queryEditora.next();
        
        if (! existeEditora)
            throw new Exception("Editora não cadastrada");
        
        String nomeEditora = queryEditora.getString("nome");
        String local = queryEditora.getString("localizacao");
        
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
        ArrayList<ILivro> resultado = new ArrayList<ILivro>();
        
        ArrayList<Integer> idEditoras = new ArrayList<Integer>();        
        ArrayList<Integer> idAreasDireito = new ArrayList<Integer>();
        
        IBanco banco = Banco.getInstance();
        
        ResultSet query = banco.getTodosLivros();
        
        while (query.next()) {
            
            String isbn = query.getString("isbn");
            String titulo = query.getString("titulo");
            Date anoPublicacao = query.getDate("anoPublicacao");
            int edicao = query.getInt("edicao");
            int idEditora = query.getInt("idEditora");
            int idAreaDireito = query.getInt("idAreaDireito");
            boolean absoleto = query.getBoolean("estaAbsoleto");
            
            idEditoras.add(idEditora);
            idAreasDireito.add(idAreaDireito);                                    
            
            Livro livro = new Livro();
            livro.setISBN(isbn);
            livro.setTitulo(titulo);
            livro.setAnoPublicacao(anoPublicacao);
            livro.setEdicao(edicao);
            livro.setAbsoleto(absoleto);            
            
            resultado.add(livro);            
        }
        
        for (int i = 0; i < resultado.size(); i++) {
            IEditora editora = getEditora(
                idEditoras.get(i)
            );
            
            IAreaDireito areaDireito = getAreaDireito(
                    idAreasDireito.get(i)
            );                        
            
            resultado.get(i).setEditora(editora);
            resultado.get(i).setAreaDireito(areaDireito);
        }
        
        for (var livro : resultado) {
            Iterator<IAutor> autores = getAutoresDoLivro(livro);
            livro.setAutoresLivro(autores);
        }
        
        
        return resultado.iterator();
    }

    @Override
    public Livro getLivro(String ISBN) throws Exception {
        Livro resultado = new Livro();
        
        int idEditora = -1;
        int idAreaDireito = -1;
        
        IBanco banco = Banco.getInstance();
        
        ResultSet query = banco.getLivro(ISBN);
        boolean existeLivro = query.next();
        
        if (! existeLivro)
            throw new Exception("Livro não cadastrado");
        
        
        String isbn = query.getString("isbn");
        String titulo = query.getString("titulo");
        Date anoPublicacao = query.getDate("anoPublicacao");
        int edicao = query.getInt("edicao");
        idEditora = query.getInt("idEditora");
        idAreaDireito = query.getInt("idAreaDireito");
        boolean absoleto = query.getBoolean("estaAbsoleto");
        
        resultado.setISBN(isbn);
        resultado.setTitulo(titulo);
        resultado.setAnoPublicacao(anoPublicacao);
        resultado.setEdicao(edicao);
        resultado.setAbsoleto(absoleto);
        
        IEditora editora = getEditora(idEditora);
        IAreaDireito areaDireito = getAreaDireito(idAreaDireito);        
        Iterator<IAutor> autores = getAutoresDoLivro(resultado);
        
        resultado.setAutoresLivro(autores);
        resultado.setEditora(editora);
        resultado.setAreaDireito(areaDireito);
        
        return resultado;
    }

    @Override
    public Iterator<ILivro> getLivroPorArea(int idArea) throws Exception {
        ArrayList<ILivro> resultado = new ArrayList<ILivro>();
        
        ArrayList<Integer> idEditoras = new ArrayList<Integer>();
        ArrayList<Integer> idAreasDireito = new ArrayList<Integer>();
        
        IBanco banco = Banco.getInstance();
        
        ResultSet query = banco.getLivroPorArea(idArea);
        
        while (query.next()) {
            
            String isbn = query.getString("isbn");
            String titulo = query.getString("titulo");
            Date anoPublicacao = query.getDate("anoPublicacao");
            int edicao = query.getInt("edicao");
            int idEditora = query.getInt("idEditora");            
            boolean absoleto = query.getBoolean("estaAbsoleto");
            
            idEditoras.add(idEditora);
            idAreasDireito.add(idArea);
            
            Livro livro = new Livro();
            livro.setISBN(isbn);
            livro.setTitulo(titulo);
            livro.setAnoPublicacao(anoPublicacao);
            livro.setEdicao(edicao);
            livro.setAbsoleto(absoleto);            
            
            resultado.add(livro);            
        }
        
        for (int i = 0; i < resultado.size(); i++) {
            IEditora editora = getEditora(
                idEditoras.get(i)
            );
            
            IAreaDireito areaDireito = getAreaDireito(
                    idAreasDireito.get(i)
            );                        
            
            resultado.get(i).setEditora(editora);
            resultado.get(i).setAreaDireito(areaDireito);
        }
        
        for (var livro : resultado) {
            Iterator<IAutor> autores = getAutoresDoLivro(livro);
            livro.setAutoresLivro(autores);
        }
        
        
        return resultado.iterator();
    }

    @Override
    public Iterator<ILivro> getLivroPorEditora(int idEditora) throws Exception {
        ArrayList<ILivro> resultado = new ArrayList<ILivro>();
        
        ArrayList<Integer> idEditoras = new ArrayList<Integer>();
        ArrayList<Integer> idAreasDireito = new ArrayList<Integer>();
        
        IBanco banco = Banco.getInstance();
        
        ResultSet query = banco.getLivroPorEditora(idEditora);
        
        while (query.next()) {
            
            String isbn = query.getString("isbn");
            String titulo = query.getString("titulo");
            Date anoPublicacao = query.getDate("anoPublicacao");
            int edicao = query.getInt("edicao");            
            int idAreaDireito = query.getInt("idAreaDireito");
            boolean absoleto = query.getBoolean("estaAbsoleto");
            
            idEditoras.add(idEditora);
            idAreasDireito.add(idAreaDireito);                                    
            
            Livro livro = new Livro();
            livro.setISBN(isbn);
            livro.setTitulo(titulo);
            livro.setAnoPublicacao(anoPublicacao);
            livro.setEdicao(edicao);
            livro.setAbsoleto(absoleto);            
            
            resultado.add(livro);            
        }
        
        for (int i = 0; i < resultado.size(); i++) {
            IEditora editora = getEditora(
                idEditoras.get(i)
            );
            
            IAreaDireito areaDireito = getAreaDireito(
                    idAreasDireito.get(i)
            );                        
            
            resultado.get(i).setEditora(editora);
            resultado.get(i).setAreaDireito(areaDireito);
        }
        
        for (var livro : resultado) {
            Iterator<IAutor> autores = getAutoresDoLivro(livro);
            livro.setAutoresLivro(autores);
        }
        
        
        return resultado.iterator();
    }

    @Override
    public Iterator<ILivro> getLivroPorTitulo(String titulo) throws Exception {
        ArrayList<ILivro> resultado = new ArrayList<ILivro>();
        
        ArrayList<Integer> idEditoras = new ArrayList<Integer>();        
        ArrayList<Integer> idAreasDireito = new ArrayList<Integer>();
        
        IBanco banco = Banco.getInstance();
        
        ResultSet query = banco.getLivroPorTitulo(titulo);
        
        while (query.next()) {
            
            String isbn = query.getString("isbn");            
            Date anoPublicacao = query.getDate("anoPublicacao");
            int edicao = query.getInt("edicao");
            int idEditora = query.getInt("idEditora");
            int idAreaDireito = query.getInt("idAreaDireito");
            boolean absoleto = query.getBoolean("estaAbsoleto");
            
            idEditoras.add(idEditora);
            idAreasDireito.add(idAreaDireito);                                    
            
            Livro livro = new Livro();
            livro.setISBN(isbn);
            livro.setTitulo(titulo);
            livro.setAnoPublicacao(anoPublicacao);
            livro.setEdicao(edicao);
            livro.setAbsoleto(absoleto);            
            
            resultado.add(livro);            
        }
        
        for (int i = 0; i < resultado.size(); i++) {
            IEditora editora = getEditora(
                idEditoras.get(i)
            );
            
            IAreaDireito areaDireito = getAreaDireito(
                    idAreasDireito.get(i)
            );                        
            
            resultado.get(i).setEditora(editora);
            resultado.get(i).setAreaDireito(areaDireito);
        }
        
        for (var livro : resultado) {
            Iterator<IAutor> autores = getAutoresDoLivro(livro);
            livro.setAutoresLivro(autores);
        }
        
        
        return resultado.iterator();
    }

    @Override
    public Iterator<ILivro> getLivroPorAutor(int idAutor) throws Exception {
        ArrayList<ILivro> resultado = new ArrayList<ILivro>();
        
        ArrayList<Integer> idEditoras = new ArrayList<Integer>();        
        ArrayList<Integer> idAreasDireito = new ArrayList<Integer>();
        
        IBanco banco = Banco.getInstance();
        
        ResultSet query = banco.getLivroPorAutor(idAutor);
        
        while (query.next()) {
            
            String isbn = query.getString("isbn");
            String titulo = query.getString("titulo");
            Date anoPublicacao = query.getDate("anoPublicacao");
            int edicao = query.getInt("edicao");
            int idEditora = query.getInt("idEditora");
            int idAreaDireito = query.getInt("idAreaDireito");
            boolean absoleto = query.getBoolean("estaAbsoleto");
            
            idEditoras.add(idEditora);
            idAreasDireito.add(idAreaDireito);                                    
            
            Livro livro = new Livro();
            livro.setISBN(isbn);
            livro.setTitulo(titulo);
            livro.setAnoPublicacao(anoPublicacao);
            livro.setEdicao(edicao);
            livro.setAbsoleto(absoleto);            
            
            resultado.add(livro);            
        }
        
        for (int i = 0; i < resultado.size(); i++) {
            IEditora editora = getEditora(
                idEditoras.get(i)
            );
            
            IAreaDireito areaDireito = getAreaDireito(
                    idAreasDireito.get(i)
            );                        
            
            resultado.get(i).setEditora(editora);
            resultado.get(i).setAreaDireito(areaDireito);
        }
        
        for (var livro : resultado) {
            Iterator<IAutor> autores = getAutoresDoLivro(livro);
            livro.setAutoresLivro(autores);
        }
        
        
        return resultado.iterator();
    }
    
    

    @Override
    public void alterarLivro(String isbnAtual, ILivro novoLivro) throws Exception {
        IBanco banco = Banco.getInstance();
        banco.alterarLivro(isbnAtual, novoLivro);
    }

    @Override
    public void removerLivro(String ISBN) throws Exception {
        IBanco banco = Banco.getInstance();
        banco.removerLivro(ISBN);
    }

    @Override
    public void criarLivro(ILivro livro) throws Exception {
        IBanco banco = Banco.getInstance();
        banco.criarLivro(livro);
    }

    @Override
    public boolean existeLivro(String ISBN) throws Exception {                                
        IBanco banco = Banco.getInstance();        
        ResultSet query = banco.getLivro(ISBN);
        boolean existeLivro = query.next();
        
        return existeLivro;
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
    public Iterator<IColaborador> getTodosColoboradores() throws Exception {
        ArrayList<IColaborador> resultado = new ArrayList<IColaborador>();
        
        IBanco banco = Banco.getInstance();
        
        ResultSet resultadoQuery = banco.getTodosColoboradores();
        
        while (resultadoQuery.next()) {
            String matricula = resultadoQuery.getString("matricula");
            String email = resultadoQuery.getString("email");
            String nome = resultadoQuery.getString("nome");
            String telefone = resultadoQuery.getString("telefone");
            String status = resultadoQuery.getString("status");
            String numeroOAB = resultadoQuery.getString("numeroOAB");
            String tipoColaborador = resultadoQuery.getString("tipoColaborador");
            
            IColaborador colaborador = null;
            
            if (tipoColaborador.equalsIgnoreCase("advogado")) {                
                Advogado advogado = new Advogado();
                advogado.setNumeroOAB(numeroOAB);
                colaborador = advogado;                
            }
            else if (tipoColaborador.equalsIgnoreCase("funcionario"))
                colaborador = new Funcionario();
            else
                colaborador = new Estagiario();
            
            colaborador.setMatricula(matricula);
            colaborador.setEmail(email);
            colaborador.setNome(nome);
            colaborador.setTelefone(telefone);
            
            if (status.equalsIgnoreCase("inativo"))
                colaborador.setEstaAtivo(false);
            else
                colaborador.setEstaAtivo(true);
             
            resultado.add(colaborador);
        }        
        
        return resultado.iterator();
    }

    @Override
    public IColaborador getColaborador(String matricula) throws Exception {
        IColaborador resultado = null;
        IBanco banco = Banco.getInstance();
        
        var resultadoQuery = banco.getTodosColoboradores();
        boolean existeColaborador = resultadoQuery.next();
        
        if (! existeColaborador)
            throw new Exception("Área do direito não cadastrada");
        
        String email = resultadoQuery.getString("email");
        String nome = resultadoQuery.getString("nome");
        String telefone = resultadoQuery.getString("telefone");
        String status = resultadoQuery.getString("status");
        String tipo = resultadoQuery.getString("tipoColaborador");
        
                        
        
        
        
        return resultado;
    }

    @Override
    public void alterarColaborador(IColaborador novoColaborador) throws Exception {
        
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
        ArrayList<IAutor> autores = new ArrayList<IAutor>();
        ArrayList<Integer> autoresId = new ArrayList<Integer>();
        IBanco banco = Banco.getInstance();
        
        ResultSet resultado = banco.getTodosAutoresDoLivro(livro.getISBN());
        
        while(resultado.next()) {
            int idAutor = resultado.getInt("idAutor");                        
            autoresId.add(idAutor);
        }
        
        for (int id : autoresId) {
            IAutor autor = getAutor(id);
            autores.add(autor);
        }
        
        return autores.iterator();
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
    
    
    
    private Date strToDate(String data) throws Exception {
        
        Date date = null;
        SimpleDateFormat dataFormato = new SimpleDateFormat(
                    "yyyy-MM-dd"
        );
        
        date = dataFormato.parse(data);
        
        
        return date;
    }
    
    public Iterator<IAutor> getAutoresDoLivro(String isbn) throws Exception {
        ArrayList<IAutor> autores = new ArrayList<IAutor>();
        ArrayList<Integer> autoresId = new ArrayList<Integer>();
        IBanco banco = Banco.getInstance();
        
        ResultSet resultado = banco.getTodosAutoresDoLivro(isbn);
        
        while(resultado.next()) {
            int idAutor = resultado.getInt("idAutor");
            autoresId.add(idAutor);
        }
        
        for (int id : autoresId) {
            IAutor autor = getAutor(id);
            autores.add(autor);
        }
        
        return autores.iterator();
    }



    
}
