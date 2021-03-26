/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.VacinacaoHelper;
import view.informaVacina;

/**
 *
 * @author vinic
 */
public class VacinacaoController {

    private final informaVacina view;
    private VacinacaoHelper helper;

    public VacinacaoController(informaVacina view) {
        this.view = view;
        this.helper = new VacinacaoHelper(view);
    }
    
    public void cadastrarAplicacao(){
        DadosVacinacao dadosVacinacao = helper.obterModelo();
    }
    
    public void Executado(){
        System.out.println("Inserindo dados no sistema");
        
        this.view.exibeMensagem("Aplicação lançada com sucesso");
    }
}
