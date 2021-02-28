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
        if(cantidad > 0) {
            return cantidad * 1.10;
        }
        return 0;
    }

    @Override
    public double pago2(double pago){
        double iva = pago*0.12;
        double total = pago+iva;
        DoLogger.log().info("Precio: " + pago);
        DoLogger.log().info("Iva: " + iva);
        DoLogger.log().info("Total: " + total);
        return iva;
    }

    @Override
    public long pago3(List<Pago> pagos) {
        long total = 0:
        for(Pago p : pagos) {
            total += p.getTotal();
        }
        DoLogger().log().info("Suma: " + total);
        return total;
    }

    @Override
    public double pago4(int num1, int num2, int num3) {
        int suma = num1 + num2 + num3;
        suma = suma - 0.05(suma);
        return suma;
    }
    @Override
    public void pago5(double n, Pago pago){
        DoLogger.log().info("Numero: " + n);
        DoLogger.log().info("Pago: " + pago.getCorrelativo());
        pago.setTotal((int) ((double)pago.getTotal()+(n*2)));
    }
}
