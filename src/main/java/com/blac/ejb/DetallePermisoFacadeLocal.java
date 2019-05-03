/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blac.ejb;

import com.blac.model.DetallePermiso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author BlackScorpion
 */
@Local
public interface DetallePermisoFacadeLocal {

    void create(DetallePermiso detallePermiso);

    void edit(DetallePermiso detallePermiso);

    void remove(DetallePermiso detallePermiso);

    DetallePermiso find(Object id);

    List<DetallePermiso> findAll();

    List<DetallePermiso> findRange(int[] range);

    int count();
    
}
