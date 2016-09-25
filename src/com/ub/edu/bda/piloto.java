

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.edu.bda;


/**
 *
 * @author enrique
 * clase derivada de objecto relacional de base de datos.
 * objeto relacional piloto
 */

/**A cada objeto se le ha de crear su respectiva clase y usar las anotaciones para poder ligarlo a hibernate
 * 
 */
import javax.persistence.*;

@Entity
@Table(name = "piloto")
public class piloto {
   
   public piloto(){
   
   }
   
   @Id @GeneratedValue
   @Column(name = "id")
   private int id;
   
   @Column(name = "nombre")
   private String nombre;
   
   @Column(name = "apellidos")
   private String apellidos;
   
   @Column(name = "horasVuelo")
   private int NumeroHorasVuelo;

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNumeroHorasVuelo(int NumeroHorasVuelo) {
        this.NumeroHorasVuelo = NumeroHorasVuelo;
    }
   
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getNumeroHorasVuelo() {
        return NumeroHorasVuelo;
    }
}
