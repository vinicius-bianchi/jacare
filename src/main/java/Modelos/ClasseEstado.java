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
public class ClasseEstado {
    
    private int idEstado;
    public String nomeEstado;

    public ClasseEstado(int idEstado, String nomeEstado) {
        this.idEstado = idEstado;
        this.nomeEstado = nomeEstado;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }
    
    

}