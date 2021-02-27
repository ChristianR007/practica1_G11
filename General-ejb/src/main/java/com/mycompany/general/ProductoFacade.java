/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usac.edu.gt.session;

import javax.annotation.Resource;
import javax.ejb.EJBContext;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import usac.edu.gt.entity.Rectangulo;
import usac.edu.gt.session.local.RectanguloFacadeLocal;

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
    public void insertar(Producto producto) throws Exception {
        UserTransaction userTransaction = ejbContext.getUserTransaction();
         userTransaction.begin();
        this.create(producto);
        userTransaction.commit(); 

    }
}
