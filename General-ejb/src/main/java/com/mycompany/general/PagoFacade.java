/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.general;

import javax.annotation.Resource;
import javax.ejb.EJBContext;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.mycompany.entity.Pago;
import com.mycompany.session.local.PagoFacadeLocal;

/**
 *
 * @author martin
 */
@Stateless
public class PagoFacade  extends AbstractFacade<Pago> 
        implements PagoFacadeLocal {
    
    @PersistenceContext(unitName = "BD_PU")
     private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    @Resource
    private EJBContext ejbContext;

    public PagoFacade() {
        super(Producto.class);
    }

    @Override
    public void pago5(double n, Pago pago){
        pago.setTotal((int) ((double)pago.getTotal()+(n*2)));
    }
}
