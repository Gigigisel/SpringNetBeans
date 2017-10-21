/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ipn.bean;

/**
 *
 * @author Giselle
 */
public class Direccion {
    
    private String calle;
    private String CP;

    public Direccion(String calle, String CP) {
        this.calle = calle;
        this.CP = CP;
    }
    
    public Direccion(){}

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", CP=" + CP + '}';
    }
    
}
