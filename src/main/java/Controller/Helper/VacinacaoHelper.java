/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Modelos.DadosVacinacao;
import view.informaVacina;

/**
 *
 * @author vinic
 */
public class VacinacaoHelper {
    
    private final informaVacina view;

    public VacinacaoHelper(informaVacina view) {
        this.view = view;
    }
    
    public DadosVacinacao obterModelo(){
        String vacina = view.getDadosInsereVacina().getText();
        String dataVacinacao = view.getDadosInsereData().getText();
        String classePosto = view.getDadosIdPosto().getText();        
        DadosVacinacao modelo = new DadosVacinacao(0, vacina, dataVacinacao, classePosto);        
        return modelo;
    }
    
    public void setModelo(DadosVacinacao modelo){
       String vacina = modelo.getVacina();
       String dataVacinacao = modelo.getDataVacinacao();
       String classePosto = modelo.getClassePosto();
       
       view.getDadosInsereVacina().setText(vacina);
       view.getDadosInsereData().setText(dataVacinacao);
       view.getDadosIdPosto().setText(classePosto);
   }
   
   public void resetTela(){
       view.getDadosInsereVacina().setText("");
       view.getDadosInsereData().setText("");
       view.getDadosIdPosto().setText("");
       
   }
}


   
   