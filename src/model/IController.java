/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.Iterator;


public interface IController {
    
    //LOGIN
    public String getEmail() throws Exception;
    public String getHashSenha() throws Exception;
    
    //CRUD autor
    public Iterator<IAutor> getTodosAutores() throws Exception;
    public IAutor getAutor(int id) throws Exception;
    public void alterarAutor(IAutor novoAutor) throws Exception;
    public void removerAutor(int idAutor) throws Exception;
    public void criarAutor(IAutor autor) throws Exception;
    public boolean existeAutor(int idAutor) throws Exception;
    
    //CRUD editora
    public Iterator<IEditora> getTodasEditoras() throws Exception;
    public IEditora getEditora(int id) throws Exception;
    public void alterarEditora(IEditora novaEditora) throws Exception;
    public void removerEditora(int idEditora) throws Exception;
    public void criarEditora(IEditora editora) throws Exception;
    public boolean existeEditora(int idEditora) throws Exception;
    
    //CRUD areaDireito
    public Iterator<IAreaDireito> getTodasAreasDireito() throws Exception;
    public IAreaDireito getAreaDireito(int id) throws Exception;
    public void alterarAreaDireito(IAreaDireito novaAreaDireito) throws Exception;
    public void removerAreaDireito(int idAreaDireito) throws Exception;
    public void criarAreaDireito(IAreaDireito areaDireito) throws Exception;
    public boolean existeAreaDireito(int idAreaDireito) throws Exception;
    
    //CRUD livro
    public Iterator<ILivro> getTodosLivros() throws Exception;
    public Livro getLivro(String ISBN) throws Exception;
    public void alterarLivro(ILivro novoLivro) throws Exception;
    public void removerLivro(String ISBN) throws Exception;
    public void criarLivro(ILivro livro) throws Exception;
    public boolean existeLivro(String ISBN) throws Exception;
    
    //CRUD exemplar
    public Iterator<IExemplar> getTodosExemplares() throws Exception;
    public IExemplar getExemplar(int id) throws Exception;
    public void alterarExemplar(IExemplar novoExempar) throws Exception;
    public void removerExemplar(int id) throws Exception;
    public void criarExemplar(IExemplar exemplar) throws Exception;
    public boolean existeExemplar(int id) throws Exception;
    
    //CRUD colaborador
    public Iterator<Colaborador> getTodosColoboradores() throws Exception;
    public Colaborador getColaborador(String matricula) throws Exception;
    public void alterarColaborador(IColaborador novoColaborador) throws Exception;
    public void removerColaborador(String matricula) throws Exception;
    public void criarColaborador(IColaborador colaborador) throws Exception;
    public boolean existeColaborador(int id) throws Exception;
    
    //RELACINAMENTOS N-N AUTOR_LIVRO
    public Iterator<IAutor> getAutoresDoLivro(ILivro livro) throws Exception;
    public void setAutoresDoLivro(ILivro livro, Iterator<IAutor> autores) throws Exception;
    
    
    //RELACIONAMENTOS N-N RESERVA
    public void fazerReserva(IReserva reserva) throws Exception;
    
    //RELACIONAMENTO N-N EMPRESTIMO
    public void fazerEmprestimo(IEmprestimo emprestimo) throws Exception;
    public void devolverEmprestimo(IEmprestimo emprestimo) throws Exception;
    public void getEmprestimosEmAtrado() throws Exception;
    
}










