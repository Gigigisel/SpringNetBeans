/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ipn.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Giselle
 */
public class Administrador {
    @Autowired
    private Direccion direccion;
    private int  idAd;
    private String nombre;

    public Direccion getDireccion() {
        return direccion;
    }

    public int getIdAd() {
        return idAd;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setIdAd(int idAd) {
        this.idAd = idAd;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    public Administrador(Direccion direccion, int idAd, String nombre) {
        this.direccion = direccion;
        this.idAd = idAd;
        this.nombre = nombre;
    }

    
    public Administrador(){}

    @Override
    public String toString() {
        return "Administrador{" + "direccion=" + direccion + ", idAd=" + idAd + ", nombre=" + nombre + '}';
    }

    
    
}
