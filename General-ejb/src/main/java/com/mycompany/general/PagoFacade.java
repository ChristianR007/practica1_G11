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
import javax.transaction.UserTransaction;
import com.mycompany.general.Pago;
import com.mycompany.general.session.local.PagoFacadeLocal;

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
<<<<<<< HEAD
    public double pago1(double cantidad) {
        return cantidad * 1.10;
=======
    public double pago2(double pago){
        return pago*0.12;
>>>>>>> feature/req9
    }

}
