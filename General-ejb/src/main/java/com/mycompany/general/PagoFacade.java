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
import com.mycompany.entity.Pago;
import com.mycompany.session.local.PagoFacadeLocal;
import java.util.List;

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
    public double pago1(double cantidad) {
        return cantidad * 1.10;
    }

    @Override
    public double pago2(double pago){
        return pago*0.12;
    }

    @Override
    public long pago3(List<Pago> pagos) {
        long total = 0:
        for(Pago p : pagos) {
            total += p.getTotal();
        }
        return total;
    }

    @Override
    public double pago4(int num1, int num2) {
        int suma = num1 + num2;
        suma = suma - 0.05(suma);
        return suma;
    }
}
