/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blac.ejb;

import com.blac.model.EstadoInspeccion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author BlackScorpion
 */
@Local
public interface EstadoInspeccionFacadeLocal {

    void create(EstadoInspeccion estadoInspeccion);

    void edit(EstadoInspeccion estadoInspeccion);

    void remove(EstadoInspeccion estadoInspeccion);

    EstadoInspeccion find(Object id);

    List<EstadoInspeccion> findAll();

    List<EstadoInspeccion> findRange(int[] range);

    int count();
    
}
