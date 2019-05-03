/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blac.ejb;

import com.blac.model.Inspeccion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author BlackScorpion
 */
@Local
public interface InspeccionFacadeLocal {

    void create(Inspeccion inspeccion);

    void edit(Inspeccion inspeccion);

    void remove(Inspeccion inspeccion);

    Inspeccion find(Object id);

    List<Inspeccion> findAll();

    List<Inspeccion> findRange(int[] range);

    int count();
    
}
