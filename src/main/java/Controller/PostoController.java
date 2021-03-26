/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modelos.ClassePosto;
import view.cadastroPosto;

/**
 *
 * @author vinic
 */
public class PostoController {

    private final cadastroPosto view;
    private Object helper;

    public PostoController(cadastroPosto view) {
        this.view = view;
    }
    
    public void cadastrarPosto(){
        ClassePosto classePosto = helper.obterModelo();
    }
    
    public void Executado(){
        System.out.println("Inserindo dados no sistema");
        
        this.view.exibeMensagem("Posto cadastrado com sucesso");
    }
}
