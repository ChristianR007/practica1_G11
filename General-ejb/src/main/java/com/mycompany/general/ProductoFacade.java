/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.general;

import com.mycompany.entity.Producto;
import com.mycompany.session.local.ProductoFacadeLocal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJBContext;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

/**
 *
 * @author martin
 */
@Stateless
public class ProductoFacade  extends AbstractFacade<Producto> 
        implements ProductoFacadeLocal {
    
    @PersistenceContext(unitName = "BD_PU")
     private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    @Resource
    private EJBContext ejbContext;

    public ProductoFacade() {
        super(Producto.class);
    }

    @Override
    public void metodo1() {
        //LOGICA
    }

    @Override
    public String metodo2() {
        String mensaje = "";
        //LOGICA
        return mensaje;
    }

    @Override
    public double obtenerPrecio(Producto producto) {
        double price = 99.0;
        //LOGICA
        return price;
    }

    @Override
    public String obtenerNombre(Producto producto) {
        String name = "Nombrecito";
        //LOGICA
        return name;
    }

    @Override
    public Producto cambiarProductos(Producto p1, Producto p2) {
        Producto producto = new Producto();
        producto.setId(0);
        producto.setNombre();
        producto.setPrecio();
        return  producto;
    }
    
    @Override
    public void insertar(Producto producto) throws  Exception {
        UserTransaction userTransaction = ejbContext.getUserTransaction();
        userTransaction.begin();
        this.create(producto);
        userTransaction.commit(); 
    }
    
    @Override
    public void editar(Producto producto) throws Exception {
        UserTransaction userTransaction = ejbContext.getUserTransaction();
        userTransaction.begin();
        this.edit(producto);
        userTransaction.commit();
    }

    @Override
    public void eliminar(Producto producto) throws Exception {
        UserTransaction userTransaction = ejbContext.getUserTransaction();
        userTransaction.begin();
        this.remove(producto);
        userTransaction.commit();
    }
}
