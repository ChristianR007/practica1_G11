/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.session.local;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
/**
 *
 * @author Christian
 */
@Named
@RequestScoped
public class controlador {
    private String nombreControlador;
    
    @EJB
    private ProductoFacadeLocal productofcl;
    
    @PostConstruct
    public void init(){
        nombreControlador = "Productos";
    }
    
    @PreDestroy
    public void destroy(){
        
    }
    
    public String getNombreApp(){
        return nombreControlador;
    }
    public void setNombreApp(String nombreApp){
        this.nombreControlador = nombreApp;
    }
}
