package com.blac.controller;

import com.blac.ejb.UsuarioFacadeLocal;
import com.blac.model.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class RegistroController implements Serializable {
    
    @EJB
    private com.blac.ejb.UsuarioFacade usuarioEJB2;
    
    private Usuario usuario;

@PostConstruct
public void init(){

    usuario = new Usuario();
}    

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void registra(){
    try{
       // usuario.setNombres(getNombres());
        usuario.setTipo("Usuario");
        usuarioEJB2.create(usuario);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario Registrado", null));
        
    
    }catch(Exception e){
    
    }
    
    
    }
}
