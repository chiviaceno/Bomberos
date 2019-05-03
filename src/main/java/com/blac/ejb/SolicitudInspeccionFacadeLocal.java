/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blac.ejb;

import com.blac.model.SolicitudInspeccion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author BlackScorpion
 */
@Local
public interface SolicitudInspeccionFacadeLocal {

    void create(SolicitudInspeccion solicitudInspeccion);

    void edit(SolicitudInspeccion solicitudInspeccion);

    void remove(SolicitudInspeccion solicitudInspeccion);

    SolicitudInspeccion find(Object id);

    List<SolicitudInspeccion> findAll();

    List<SolicitudInspeccion> findRange(int[] range);

    int count();
    
    List<SolicitudInspeccion> BuscarSolicitudInspeccion(int codigoUsuario) throws Exception;
}
