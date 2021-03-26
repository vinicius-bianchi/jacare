/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Modelos.Usuario;
import view.login;

/**
 *
 * @author vinic
 */
public class LoginController {

    private final login view;
    private LoginHelper helper;

    public LoginController(login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    
    public void entradaSistema(){
        Usuario usuario = helper.obterModelo();
        
    }
    
    
    public void Executado(){
        System.out.println("Aguarde, buscando dados");
        
        this.view.exibeMensagem("Executado com sucesso");
    }
    
    
}
