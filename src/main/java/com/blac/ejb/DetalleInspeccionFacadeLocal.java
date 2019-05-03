/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blac.ejb;

import com.blac.model.DetalleInspeccion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author BlackScorpion
 */
@Local
public interface DetalleInspeccionFacadeLocal {

    void create(DetalleInspeccion detalleInspeccion);

    void edit(DetalleInspeccion detalleInspeccion);

    void remove(DetalleInspeccion detalleInspeccion);

    DetalleInspeccion find(Object id);

    List<DetalleInspeccion> findAll();

    List<DetalleInspeccion> findRange(int[] range);

    int count();
    
}
