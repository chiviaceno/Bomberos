/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blac.ejb;

import com.blac.model.DetalleCuentas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author BlackScorpion
 */
@Local
public interface DetalleCuentasFacadeLocal {

    void create(DetalleCuentas detalleCuentas);

    void edit(DetalleCuentas detalleCuentas);

    void remove(DetalleCuentas detalleCuentas);

    DetalleCuentas find(Object id);

    List<DetalleCuentas> findAll();

    List<DetalleCuentas> findRange(int[] range);

    int count();
    
}
