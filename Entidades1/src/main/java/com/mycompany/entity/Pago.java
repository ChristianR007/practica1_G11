/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author bitochepe
 */
@Entity
public class Pago {
    
    private LinkedList<Producto> ListaProductos;
    private int total;
    @Id
    private int correlativo;

    public int getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }

    public LinkedList<Producto> getListaProductos() {
        return ListaProductos;
    }

    public void setListaProductos(LinkedList<Producto> ListaProductos) {
        this.ListaProductos = ListaProductos;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
