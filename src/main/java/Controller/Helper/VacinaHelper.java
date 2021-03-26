/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Modelos.Vacina;
import view.cadastroVacina;

/**
 *
 * @author vinic
 */
public class VacinaHelper {
    private final cadastroVacina view;
    public VacinaHelper(cadastroVacina view){
        this.view = view;
    }
    
    public Vacina obterModelo(){
        String CadastraVacinaInsereNome = view.getCadastraVacinaInsereNome().getText();
        String CadastraVacinaInsereFabricante = view.getCadastraVacinaInsereFabricante().getText();
        String CadastraVacinaInsereOrigem = view.getCadastraVacinaInsereOrigem().getText();
        Vacina modelo = new vacina(0, CadastraVacinaInsereNome, CadastraVacinaInsereFabricante, CadastraVacinaInsereOrigem);
        return modelo;
    }
    
    public void setModelo(Vacina modelo){
        String CadastraVacinaInsereNome = modelo.getCadastravacinaInsereNome();
        String CadastraVacinaInsereFabricante = modelo.getCadastraVacinaInsereFabricante();
        String CadastraVacinaInsereOrigem = modelo.getCadastraVacinaInsereOrigem();
        
        view.getCadastraVacinaInsereNome().setText(CadastraVacinaInsereNome);
        view.getCadastraVacinaInsereFabricante().setText(CadastraVacinaInsereFabricante);
        view.getCadastraVacinaInsereOrigem().setText(CadastraVacinaInsereOrigem);
    }
    
    public void resetTela(){
        view.getCadastraVacinaInsereNome().setText("");
        view.getCadastraVacinaInsereFabricante().setText("");
        view.getCadastraVacinaInsereOrigem().setText("");
    }


}

