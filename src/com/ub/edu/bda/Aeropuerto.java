/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.edu.bda;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author windows
 */
@Entity
@Table(name = "aeropuerto")
public class Aeropuerto {
    @Id @GeneratedValue
    @Column(name = "idAeropuerto") 
    private String idAeropuerto;
    @Column(name = "nombre") 
    private String nombre;
    @Column(name = "ciudad") 
    private String ciudad;
    @Column(name = "codigo_internacional") 
    private String codigo_internacional;
    @Column(name = "coste_handling") 
    private float coste_handling;

    public Aeropuerto() {
    }

    public String getIdAeropuerto() {
        return idAeropuerto;
    }

    public void setIdAeropuerto(String idAeropuerto) {
        this.idAeropuerto = idAeropuerto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigo_internacional() {
        return codigo_internacional;
    }

    public void setCodigo_internacional(String codigo_internacional) {
        this.codigo_internacional = codigo_internacional;
    }

    public float getCoste_handling() {
        return coste_handling;
    }

    public void setCoste_handling(float coste_handling) {
        this.coste_handling = coste_handling;
    }
    
    
    
}

