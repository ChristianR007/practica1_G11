/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.session.local;

import javax.ejb.Local;
import com.mycompany.entity.Producto;
/**
 *
 * @author Christian
 */
@Local
public interface ProductoFacadeLocal {
    Producto find(Object id);
    
    void create(Producto producto);
    
    void edit(Producto producto);
    
    void remove(Producto producto);
    
    public void metodo1();
    
    public String metodo2();
    
    public double obtenerPrecio(Producto producto);
    
    public String obtenerNombre(Producto producto);
    
    public Producto cambiarProductos(Producto rec1, Producto rec2);
    
    public void insertar(Producto producto) throws Exception;
    
    public void editar(Producto producto) throws Exception;

    public void eliminar(Producto producto) throws Exception;
}
