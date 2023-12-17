/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;


public class Emprestimo implements IEmprestimo {
    
    private IExemplar exemplar = null;
    private IColaborador colaborador = null;
    private double multa = 0;
    private Date dataEmpresitmo = null;
    private Date dataDevolucao = null;
    
    public Emprestimo() {
    }
    
    public Emprestimo(IExemplar exemplar, IColaborador colaborador) {
        this.exemplar = exemplar;
        this.colaborador = colaborador;
    }
        

    @Override
    public IExemplar getExemplar() {
        return this.exemplar;
    }

    @Override
    public IColaborador getColaborador() {
        return this.colaborador;
    }

    @Override
    public double getMulta() {
        return this.multa;
    }

    @Override
    public Date getDataEmprestimo() {
        return this.dataEmpresitmo;
    }

    @Override
    public Date getDataDevolucao() {
        return this.dataDevolucao;
    }

    @Override
    public void setExemplar(IExemplar exemplar) {
        this.exemplar = exemplar;
    }

    @Override
    public void setColaborador(IColaborador colaborador) {
        this.colaborador = colaborador;
    }

    @Override
    public void setMulta(double multa) {
        this.multa = multa;
    }

    @Override
    public void setDataEmprestimo(Date data) {
        this.dataEmpresitmo = data;
    }

    @Override
    public void setDataDevolucao(Date data) {
        this.dataDevolucao = data;
    }
    
    
    
}
