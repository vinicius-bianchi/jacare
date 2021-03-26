/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author ViniciusBianchi
 */
public class Vacina {
    
    public int idVacina;
    public String CadastravacinaInsereNome;
    public String CadastraVacinaInsereFabricante;
    public String CadastraVacinaInsereOrigem;

    public Vacina(int idVacina, String CadastravacinaInsereNome, String CadastraVacinaInsereFabricante, String CadastraVacinaInsereOrigem) {
        this.idVacina = idVacina;
        this.CadastravacinaInsereNome = CadastravacinaInsereNome;
        this.CadastraVacinaInsereFabricante = CadastraVacinaInsereFabricante;
        this.CadastraVacinaInsereOrigem = CadastraVacinaInsereOrigem;
    }

    public int getIdVacina() {
        return idVacina;
    }

    public void setIdVacina(int idVacina) {
        this.idVacina = idVacina;
    }

    public String getCadastravacinaInsereNome() {
        return CadastravacinaInsereNome;
    }

    public void setCadastravacinaInsereNome(String CadastravacinaInsereNome) {
        this.CadastravacinaInsereNome = CadastravacinaInsereNome;
    }

    public String getCadastraVacinaInsereFabricante() {
        return CadastraVacinaInsereFabricante;
    }

    public void setCadastraVacinaInsereFabricante(String CadastraVacinaInsereFabricante) {
        this.CadastraVacinaInsereFabricante = CadastraVacinaInsereFabricante;
    }

    public String getCadastraVacinaInsereOrigem() {
        return CadastraVacinaInsereOrigem;
    }

    public void setCadastraVacinaInsereOrigem(String CadastraVacinaInsereOrigem) {
        this.CadastraVacinaInsereOrigem = CadastraVacinaInsereOrigem;
    }
    
    
    
}
