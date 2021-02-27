
package usac.edu.gt.wfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Productos {
    private String nombreApp;
    
    @EJB
    private ProductoFacadeLocal productofcl;
    
    @PostConstruct
    public void init(){
        nombreApp = "Productos";
    }
    
    @PreDestroy
    public void destroy(){
        
    }
    
    public String getNombreApp(){
        return nombreApp;
    }
    public void setNombreApp(String nombreApp){
        this.nombreApp = nombreApp;
    }
}
