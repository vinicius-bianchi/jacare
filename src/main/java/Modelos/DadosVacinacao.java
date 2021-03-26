/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.Date;

/**
 *
 * @author ViniciusBianchi
 */
public class DadosVacinacao {
    
    public int idDadosVacicanao;
    public Vacina vacina;
    public Date dataVacinacao;
    public ClassePosto classePosto;

    public DadosVacinacao(int idDadosVacicanao, Vacina vacina, Date dataVacinacao, ClassePosto classePosto) {
        this.idDadosVacicanao = idDadosVacicanao;
        this.vacina = vacina;
        this.dataVacinacao = dataVacinacao;
        this.classePosto = classePosto;
    }

    public int getIdDadosVacicanao() {
        return idDadosVacicanao;
    }

    public void setIdDadosVacicanao(int idDadosVacicanao) {
        this.idDadosVacicanao = idDadosVacicanao;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }

    public Date getDataVacinacao() {
        return dataVacinacao;
    }

    public void setDataVacinacao(Date dataVacinacao) {
        this.dataVacinacao = dataVacinacao;
    }

    public ClassePosto getClassePosto() {
        return classePosto;
    }

    public void setClassePosto(ClassePosto classePosto) {
        this.classePosto = classePosto;
    }

    
    
}
