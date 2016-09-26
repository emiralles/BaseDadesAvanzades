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
@Table(name = "avion")
public class Avion {
    
    @Id @GeneratedValue
    @Column(name = "idPiloto")
    private String matricula;    
    
    public Avion(){
      super();
    }
    
    public String getMatricula(){
        return matricula;
    } 

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }    
    
}
