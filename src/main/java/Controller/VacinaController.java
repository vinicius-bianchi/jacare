/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import view.cadastroVacina;

/**
 *
 * @author vinic
 */
public class VacinaController {
    

    private final cadastroVacina view;
    
    public VacinaController(cadastroVacina view) {
        this.view = view;
    }
    
    public void cadastrarVacina(){
        String CadastrarVacinaInsereNome = view.getCadastrarPostoInsereNome().getText;
        String CadastrarVacinaInsereFabricante = view.getCadastraPostoInsereMunicipio().getText;
        String CadastrarVacinaInsereOrigem = view.getCadastraPostoInsereEstado().getText;
        
        Vacina modelo = new Vacina(0, CadastrarVacinaInsereNome, CadastrarVacinaInsereFabricante, CadastrarVacinaInsereOrigem);
    }
    
     public void Executado(){
        System.out.println("Inserindo dados no sistema");
        
        this.view.exibeMensagem("Vacina cadastrada com sucesso");
    }
    
}

