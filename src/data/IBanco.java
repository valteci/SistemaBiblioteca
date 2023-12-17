/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package data;

import java.sql.ResultSet;
import java.util.ArrayList;
import model.IAdvogado;
import model.IAreaDireito;
import model.IAutor;
import model.IColaborador;
import model.IEditora;
import model.IEmprestimo;
import model.IExemplar;
import model.ILivro;
import model.IReserva;


public interface IBanco {
    public String getUsuario();
    public String getSenha();
    public String getNomeDatabase();
    
    public void setUsuario(String usuario);
    public void setSenha(String senha);
    public void setNomeDatabase(String nomeDb);
    
    public IBanco getInstance() throws Exception;
    public IBanco getInstance(String usuario, String senha, String nomeDb) throws Exception;
    
    //CRUD autor
    public ArrayList<IAutor> getTodosAutores() throws Exception;
    public IAutor getAutor(int id) throws Exception;
    public void alterarAutor(IAutor novoAutor) throws Exception;
    public void removerAutor(int idAutor) throws Exception;
    public void criarAutor(IAutor autor) throws Exception;
    
    //CRUD editora
    public ArrayList<IEditora> getTodasEditoras() throws Exception;
    public IEditora getEditora(int id) throws Exception;
    public void alterarEditora(IEditora novaEditora) throws Exception;
    public void removerEditora(int idEditora) throws Exception;
    public void criarEditora(IEditora editora) throws Exception;
    
    //CRUD area_direito
    public ArrayList<IAreaDireito> getTodasAreasDireito() throws Exception;
    public IAreaDireito getAreaDireito(int id) throws Exception;
    public void alterarAreaDireito(IAreaDireito novaAreaDireito) throws Exception;
    public void removerAreaDireito(int idAreaDireito) throws Exception;
    public void criarAreaDireito(IAreaDireito areaDireito) throws Exception;
    
    //CRUD livro
    public ArrayList<ILivro> getTodosLivros() throws Exception;
    public ILivro getLivro(String ISBN) throws Exception;
    public void alterarLivro(ILivro novoLivro) throws Exception;
    public void removerLivro(String ISBN) throws Exception;
    public void criarLivro(ILivro livro) throws Exception;
    
    //CRUD exemplar
    public ArrayList<IExemplar> getTodosExemplares() throws Exception;
    public IExemplar getExemplar(int id) throws Exception;
    public void alterarExemplar(IExemplar novoExempar) throws Exception;
    public void removerExemplar(int id) throws Exception;
    public void criarExemplar(IExemplar exemplar) throws Exception;
    
    //CRUD colaborador
    public ArrayList<IColaborador> getTodosColoboradores() throws Exception;
    public IColaborador getColaborador(String matricula) throws Exception;
    public void alterarColaborador(IColaborador novoColaborador) throws Exception;
    public void removerColaborador(String matricula) throws Exception;
    public void criarColaborador(IColaborador colaborador) throws Exception;
        
    //CRUD relacionamento EMPRÉSTIMO
    public ArrayList<IEmprestimo> getTodosEmprestimos() throws Exception;
    public ArrayList<IEmprestimo> getEmprestimosEmAtraso() throws Exception;
    public void alterarEmprestimo(IEmprestimo novoEmprestimo) throws Exception;
    public void removerEmprestimo(IEmprestimo emprestimo) throws Exception;
    public void criarEmprestimo(IEmprestimo emprestimo) throws Exception;
    
    //CRUD relacionamento reserva
    public ArrayList<IReserva> getTodasReservas() throws Exception;    
    public void alterarReserva(IReserva novaReserva) throws Exception;
    public void removerReserva(IReserva reserva) throws Exception;
    public void criarReservar(IReserva reserva) throws Exception;
    
    //login
    public String getEmail() throws Exception;
    public String getHashSenha() throws Exception;
}





