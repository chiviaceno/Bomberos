/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blac.ejb;

import com.blac.model.TipoServicio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author BlackScorpion
 */
@Local
public interface TipoServicioFacadeLocal {

    void create(TipoServicio tipoServicio);

    void edit(TipoServicio tipoServicio);

    void remove(TipoServicio tipoServicio);

    TipoServicio find(Object id);

    List<TipoServicio> findAll();

    List<TipoServicio> findRange(int[] range);

    int count();
    
}
