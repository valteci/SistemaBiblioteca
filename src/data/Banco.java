/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.IAreaDireito;
import model.IAutor;
import model.IColaborador;
import model.IEditora;
import model.IEmprestimo;
import model.IExemplar;
import model.ILivro;
import model.IReserva;


public class Banco implements IBanco {
    
    String usuario = "";
    String senha = "";
    String nomeDatabase = "";
    
    private static java.sql.Connection conexao = null;
    private static java.sql.Statement comando = null;
    
    private static Banco instance = null;
    
    
    private Banco() { }
    
    private Banco(String usuario, String senha, String nomeDatabase) throws Exception {
        this.usuario = usuario;
        this.senha = senha;
        this.nomeDatabase = nomeDatabase;
        
        conexao = DriverManager.getConnection(
                getUrl(),
                usuario,
                senha
        );
        
        comando = conexao.createStatement();
    }

    @Override
    public String getUsuario() {
        return this.usuario;
    }

    @Override
    public String getSenha() {
        return this.senha;
    }

    @Override
    public String getNomeDatabase() {
        return this.nomeDatabase;
    }

    @Override
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public void setNomeDatabase(String nomeDb) {
        this.nomeDatabase = nomeDb;
    }

    
    public static IBanco getInstance() throws Exception {
        if (instance == null)
            instance = new Banco();
        
        return instance;
    }

    
    public static IBanco getInstance(String usuario, String senha, String nomeDb) throws Exception {
        if (instance == null)
            instance = new Banco(usuario, senha, nomeDb);
        
        return instance;
    }

    @Override
    public ResultSet getTodosAutores() throws Exception {
        return comando.executeQuery("select * from autor;");
    }

    @Override
    public ResultSet getAutor(int id) throws Exception {
        return comando.executeQuery(
                String.format(
                        "select * from autor where idAutor = '%d';",
                        id
                )
            );
    }

    @Override
    public void alterarAutor(IAutor novoAutor) throws Exception {
        
        String nomeAutor = novoAutor.getNome();
        int idAutor = novoAutor.getId();
        
        comando.execute(
            String.format(
                    "update autor set nome = '%s' where idAutor = %d;",
                    nomeAutor,
                    idAutor
            )
        );
    }

    @Override
    public void removerAutor(int idAutor) throws Exception {
        comando.execute(
            String.format(
                    "delete from autor where idAutor = %d",
                    idAutor
            )
        );
    }

    @Override
    public void criarAutor(IAutor autor) throws Exception {
        
        String nomeAutor = autor.getNome();
        
        comando.execute(
            String.format(
                    "insert into autor (nome) values ('%s')",
                    nomeAutor
            )
        );
    }

    @Override
    public ResultSet getTodasEditoras() throws Exception {
        return comando.executeQuery("select * from editora;");
    }

    @Override
    public ResultSet getEditora(int id) throws Exception {
        return comando.executeQuery(String.format(
                "select * from editora where idEditora = %d;",
                id
            )
        );
    }

    @Override
    public void alterarEditora(IEditora novaEditora) throws Exception {
        String novoNome = novaEditora.getNome();
        String novaLocalizacao = novaEditora.getLocal();
        int id = novaEditora.getId();
        
        comando.execute(String.format(
                "update editora set nome='%s', localizacao='%s' where" + 
                "idEditora = %d;",
                novoNome,
                novaLocalizacao,
                id
            )                
        );
    }

    @Override
    public void removerEditora(int idEditora) throws Exception {
        comando.execute(String.format(
                "delete from editora where idEditora = %d;",
                idEditora
            )
        );
    }

    @Override
    public void criarEditora(IEditora editora) throws Exception {
        
        String nome = editora.getNome();
        String localizacao = editora.getLocal();
        
        comando.execute(String.format(
                "insert into editora (nome, localizacao) values " + 
                "('%s', '%s');",
                nome,
                localizacao
            )
        );
    }

    @Override
    public ResultSet getTodasAreasDireito() throws Exception {
        return comando.executeQuery("select * from areaDireito;");
    }

    @Override
    public ResultSet getAreaDireito(int id) throws Exception {
        return comando.executeQuery(String.format(
                "select * from areaDireito where idAreaDireito = %d;",
                id
            )
        );
    }

    @Override
    public void alterarAreaDireito(IAreaDireito novaAreaDireito) throws Exception {
        
        String nome = novaAreaDireito.getNome();
        int id = novaAreaDireito.getId();
        
        comando.execute(String.format(
                "update areaDireito set nome='%s' where idAreaDireito = %d;",
                nome,
                id
            )
        );
    }

    @Override
    public void removerAreaDireito(int idAreaDireito) throws Exception {
        comando.execute(String.format(
                "delete from areaDireito where idAreaDireito = %d;",
                idAreaDireito
            )
        );
    }

    @Override
    public void criarAreaDireito(IAreaDireito areaDireito) throws Exception {
        
        String nome = areaDireito.getNome();
        
        comando.execute(String.format(
                "insert into areaDireito (nome) values ('%s');",
                nome
            )
        );
    }

    @Override
    public ResultSet getTodosLivros() throws Exception {
        return comando.executeQuery("select * from livro;");
    }

    @Override
    public ResultSet getLivro(String ISBN) throws Exception {
        return comando.executeQuery(String.format(
                "select * from livro where isbn='%s';",
                ISBN
            )
        );
    }

    @Override
    public void alterarLivro(String isbnAtual, ILivro novoLivro) throws Exception {
        
        String novoIsbn = novoLivro.getISBN();
        String novoTitulo = novoLivro.getTitulo();
        String novoAnoPublicacao = novoLivro.getAnoPublicacao().toString();
        int novaEdicao = novoLivro.getEdicao();
        int novaEditora = novoLivro.getEditora().getId();
        int novaAreaDireito = novoLivro.getAreaDireito().getId();        
        String estaAbsoleto = "false";
        
        if (novoLivro.estaAbsoleto())
            estaAbsoleto = "true";
        
        comando.execute(String.format(
                "update livro set isbn='%s', titulo='%s', " + 
                "anoPublicacao='%s', edicao=%d, idEditora=%d, " + 
                "idAreaDireito=%d, estaAbsoleto=%s where isbn='%s';",
                novoIsbn,
                novoTitulo,
                novoAnoPublicacao,
                novaEdicao,
                novaEditora,
                novaAreaDireito,
                estaAbsoleto,
                isbnAtual
            )
        );
    }

    @Override
    public void removerLivro(String ISBN) throws Exception {
        comando.execute(String.format(
                "delete from livro where isbn='%s';",
                ISBN
            )
        );
    }

    @Override
    public void criarLivro(ILivro livro) throws Exception {
        
        String isbn = livro.getISBN();
        String titulo = livro.getTitulo();
        String anoPublicacao = livro.getAnoPublicacao().toString();
        int edicao = livro.getEdicao();
        int editora = livro.getEditora().getId();
        int areaDireito = livro.getAreaDireito().getId();        
        String estaAbsoleto = "false";
        
        if (livro.estaAbsoleto())
            estaAbsoleto = "true";
        
        comando.execute(String.format(
                "insert into livro (isbn, titulo, anoPublicacao, " + 
                "edicao, idEditora, idAreaDireito, estaAbsoleto) values " + 
                "('%s', '%s', '%s', %d, %d, %d, %s);",
                isbn,
                titulo,
                anoPublicacao,
                edicao,
                editora,
                areaDireito,
                estaAbsoleto
            )
        );
    }

    @Override
    public ResultSet getTodosExemplares() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ResultSet getExemplar(int id) throws Exception {
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
    public ResultSet getTodosColoboradores() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ResultSet getColaborador(String matricula) throws Exception {
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
    public ResultSet getTodosEmprestimos() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ResultSet getEmprestimosEmAtraso() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alterarEmprestimo(IEmprestimo novoEmprestimo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removerEmprestimo(IEmprestimo emprestimo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void criarEmprestimo(IEmprestimo emprestimo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ResultSet getTodasReservas() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alterarReserva(IReserva novaReserva) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removerReserva(IReserva reserva) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void criarReservar(IReserva reserva) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getEmail() throws Exception {
        var resultado = comando.executeQuery("select nomeUsuario from login;");
        resultado.next();
        String email = resultado.getString("nomeUsuario");
        
        return email;                
    }

    @Override
    public String getHashSenha() throws Exception {
        var resultado = comando.executeQuery("select hashSenha from login;");
        resultado.next();        
        String hashSenha = resultado.getString("hashSenha");
        
        return hashSenha;
    }

    @Override
    public void iniciarConexao() throws Exception {
        conexao = DriverManager.getConnection(
                getUrl(),
                usuario,
                senha
        );
        
        comando = conexao.createStatement();
    }
    
    
    
    private String getUrl() {
        return "jdbc:postgresql://localhost:5432/" + nomeDatabase;
    }
    
    private ResultSet executarSelect(String sql) throws Exception {
        
        ResultSet resultadoConsulta;        
        resultadoConsulta = comando.executeQuery(sql);
        
        return resultadoConsulta;
    }
    
    private void executarUpdate(String sql) throws Exception {
        
        comando.execute(sql);
    }
    
    private void executarDelete(String sql) {
        
    }
    
    private void executarCreate(String sql) {
        
    }
    
}
