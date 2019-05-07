/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blac.controller;

import com.blac.model.SolicitudInspeccion;
import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author BlackScorpion
 */
@Named
@RequestScoped
public class ArchivarController implements Serializable{
    
    @Inject
    private MisServiciosController misServiciosController;
    private SolicitudInspeccion sol;
    
    @PostConstruct
    public void init(){
    this.sol = (SolicitudInspeccion) misServiciosController.getSolicitudInspeccionl();
    }

    public SolicitudInspeccion getSolicitudInspeccion() {
        //System.out.println(getSolicitudInspeccion());
        return sol;
        
        
    }
    

    public void setSolicitudInspeccion(SolicitudInspeccion solicitudInspeccion) {
        this.sol.getIdSolicitudInspeccion();
        System.out.println(sol.getIdSolicitudInspeccion());
    }
    
    
    
    
}
