/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Modelos.Usuario;
import view.login;

/**
 *
 * @author vinic
 */
public class LoginHelper {
    
    private final login view;

    public LoginHelper(login view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
                
        String nome = view.getInsereUsuario().getText();
        String senha = view.getInsereSenha().getText();        
        Usuario modelo = new Usuario(0, nome, senha);
        return modelo;
    }
    
   public void setModelo(Usuario modelo){
       String nome = modelo.getNome();
       String senha = modelo.getSenha();
       view.getInsereUsuario().setText(nome);
       view.getInsereSenha().setText(senha);
   }
   
   public void resetTela(){
       view.getInsereUsuario().setText("");
       view.getInsereSenha().setText("");
       
   }
}
