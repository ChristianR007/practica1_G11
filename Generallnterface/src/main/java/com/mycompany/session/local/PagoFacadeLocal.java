/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.session.local;

import javax.ejb.Local;
import com.mycompany.entity.Pago;
import java.util.List;
/**
 *
 * @author Christian
 */
@Local
public interface PagoFacadeLocal {
    Pago find(Object id);
    
    void create(Pago pago);
    
    void edit(Pago pago);
    
    void remove(Pago pago);

    long pago3(List<Pago> pagos);

    double pago2(double pago);
    
    double pago1(double cantidad);

    public double pago4(int num1, int num2);
    
}
