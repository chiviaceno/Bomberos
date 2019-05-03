/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blac.ejb;

import com.blac.model.SolicitudInspeccion;
import com.blac.model.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author BlackScorpion
 */
@Stateless
public class SolicitudInspeccionFacade extends AbstractFacade<SolicitudInspeccion> {

    @PersistenceContext(unitName = "mavenPU")
    private EntityManager em;
    
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SolicitudInspeccionFacade() {
        super(SolicitudInspeccion.class);
    }
    
    public List<SolicitudInspeccion> BuscarSolicitudInspeccion(int codigoUsuario){
    List<SolicitudInspeccion> lista = null;
    String consulta;
    
    Usuario us = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
    int codigoUsuario2 = us.getCodigo();
        try{
            
            consulta = "FROM SolicitudInspeccion s WHERE s.idUsuario = ?1";
            Query query = em.createQuery(consulta);
            query.setParameter(1, codigoUsuario2);
        
            lista =query.getResultList();       
        
    
        }catch(Exception e){    
            throw e;
        }
        return lista;    
    
    }
}
