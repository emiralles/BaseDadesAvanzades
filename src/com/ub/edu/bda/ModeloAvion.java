/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.edu.bda;

/**
 *
 * @author windows
 */
import javax.persistence.*;

@Entity
@Table(name = "modelo_avion")
public class ModeloAvion {
    
    @Id @GeneratedValue
    @Column(name = "id_modelo")
    private String id_modelo;
    
    @Column(name = "nombre")    
    private String nombre;
    
    @Column(name = "descripcion") 
    private String descripcion;
    
    @Column(name = "plazas") 
    private int plazas;
    
    @Column(name = "peso") 
    private float peso;

    public ModeloAvion() {
    }

    public String getId_modelo() {
        return id_modelo;
    }

    public void setId_Modelo(String id_Modelo) {
        this.id_modelo = id_modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    
}
