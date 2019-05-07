/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blac.controller;

import com.blac.ejb.UsuarioFacade;
import com.blac.model.Usuario;
import com.blac.ejb.UsuarioFacadeLocal;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


@Named
@ViewScoped
public class MiPerfilController implements Serializable {
   
    private Usuario usuario;

       
    @EJB
    private com.blac.ejb.UsuarioFacade usuarioperfilEJB2;

    public UsuarioFacade getUsuarioperfilEJB2() {
        return usuarioperfilEJB2;
    }

    public void setUsuarioperfilEJB2(UsuarioFacade usuarioperfilEJB2) {
        this.usuarioperfilEJB2 = usuarioperfilEJB2;
    }
    
   
    
    @PostConstruct
public void init(){
 Usuario us = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
      
    usuarioperfilEJB2.find(us.getCodigo());
} 
    public MiPerfilController() {
    }

    
    
    public void actualizar(){
        System.out.println("101");
        //usuario.setNombres(nombres);
        //usuarioperfilEJB2.edit(usuarioperfilEJB2);        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario Actualizado", null));
          
    
    
    }
    
    
}
