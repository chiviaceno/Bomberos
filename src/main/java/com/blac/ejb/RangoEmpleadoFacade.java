/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blac.ejb;

import com.blac.model.RangoEmpleado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author BlackScorpion
 */
@Stateless
public class RangoEmpleadoFacade extends AbstractFacade<RangoEmpleado> {

    @PersistenceContext(unitName = "mavenPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RangoEmpleadoFacade() {
        super(RangoEmpleado.class);
    }
    
}
