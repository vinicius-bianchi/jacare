/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Modelos.ClasseMunicipio;
import Modelos.ClassePosto;
import view.cadastroPosto;

/**
 *
 * @author vinic
 */
public class PostoHelper {
    private final cadastroPosto view;
    public PostoHelper(cadastroPosto view){
        this.view = view;
    }
    
    public ClassePosto obterModelo(){
        String nomePosto = view.getCadastraPostoInsereNome().getText();
        String classeMunicipio = view.getCadastraPostoInsereMunicipio().getText();
        ClassePosto modelo = new ClassePosto(0, nomePosto, classeMunicipio);
        return modelo;
        
    }
    
    public void setModelo (ClassePosto modelo){
        String nomePosto = modelo.getNomePosto();
        ClasseMunicipio classeMunicipio = modelo.getClasseMunicio();
        view.getCadastraPostoInsereNome().setText(nomePosto);
        view.getCadastraPostoInsereMunicipio().settext(classeMunicipio);
    }
    
    public void resetTela(){
        view.getCadastraPostoInsereNome().setText("");
        view.getCadastraPostoInsereMunicipio().setText("");
    }
}
