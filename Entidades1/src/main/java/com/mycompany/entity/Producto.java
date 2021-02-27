/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;
import javax.persistence.Entity;
/**
 *
 * @author willi
 */
@Entity
public class Producto {
    private int Id;
    private String Nombre;
    private double Precio;
    
    public int getId(){
        return Id;
    }
    
    public void setId(int Id){
        this.Id = Id;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(){
        this.Nombre = Nombre;
    }
    
    public double getPrecio(){
        return Precio;
    }
    
    public void setPrecio(){
        this.Precio = Precio;
    }
}
