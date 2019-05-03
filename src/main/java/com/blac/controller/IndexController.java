
package com.blac.controller;

import com.blac.model.Usuario;
import java.io.Serializable;
import static java.time.Clock.system;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class IndexController implements Serializable{
    
    @EJB
    private com.blac.ejb.UsuarioFacade EJBUsuario;
    
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
    
    public String iniciarSesion(){
    Usuario us;
    String redireccion = null;
        try{
        us = EJBUsuario.iniciarSesion(usuario);//System.out.println("entro al try!");
        if(us != null){
                // almacenar session jsf
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
                 
                if("Administrador".equals(us.getTipo())){
                redireccion = "/doViews/Administrador/indexAdministrator?faces-redirect=true";
                }
                else if ("Inspector".equals(us.getTipo())){
                redireccion = "/doViews/Inspector/indexInspector?faces-redirect=true";
                }
                else if ("Contador".equals(us.getTipo())){
                redireccion = "/doViews/Contador/indexAccountant?faces-redirect=true";
                }
                else if ("Usuario".equals(us.getTipo())){
                redireccion = "/doViews/Usuarios/registrarUsuario?faces-redirect=true";
                }
                
            }else{
                 //System.out.println("Usuario Incorrecto");
                 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Usuario Incorrecto", null));
            }
            
        }catch(Exception e){
          //  System.out.println("excepcion");
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error Verificar con el Administrador", null));
             
            
        }
        //System.out.println("fuera");
        return redireccion;
    }
}
