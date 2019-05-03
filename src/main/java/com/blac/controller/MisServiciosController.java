package com.blac.controller;

import com.blac.ejb.EstadoSolicitudFacadeLocal;
import com.blac.ejb.SolicitudInspeccionFacade;
import com.blac.model.EstadoSolicitud;
import com.blac.model.SolicitudInspeccion;
import static com.blac.model.SolicitudInspeccion_.idEstadoSolicitud;
import com.blac.model.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class MisServiciosController implements Serializable {
    
    private int codigoEstatus;
    private int codigoInspeccion;
    private EstadoSolicitud estadoSolicitud;

    public EstadoSolicitud getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public void setEstadoSolicitud(EstadoSolicitud estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }
    @Inject
    private SolicitudInspeccion solicitudInspeccion;
    
    private List<SolicitudInspeccion> SolicitudInspeccionl;
    @EJB
    private com.blac.ejb.SolicitudInspeccionFacade buscarejbFacade;
    private com.blac.ejb.EstadoSolicitudFacade EstadoSolEJBFacade;
    
    Usuario us = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
    
    
    public SolicitudInspeccion getSolicitudInspeccion() {
        return solicitudInspeccion;
    }

    public void setSolicitudInspeccion(SolicitudInspeccion solicitudInspeccion) {
        this.solicitudInspeccion = solicitudInspeccion;
    }
         
    

    public int getCodigoInspeccion() {
        return codigoInspeccion;
    }

    public void setCodigoInspeccion(int codigoInspeccion) {
        this.codigoInspeccion = codigoInspeccion;
    }
    
    

    public int getCodigoEstatus() {
        return codigoEstatus;
    }

    public void setCodigoEstatus(int codigoEstatus) {
        this.codigoEstatus = codigoEstatus;
    }
   
    

    public void init(){
    
    }
    
    public void buscarSolicitudInspeccion(){
         int codigoUsuario = us.getCodigo();
         int codigoEstatus2 = codigoEstatus;
         
    try{
    SolicitudInspeccionl = buscarejbFacade.BuscarSolicitudInspeccion(codigoUsuario);
    System.out.println(codigoUsuario);
    }catch(Exception e){
    throw e;
    }
    }

    public List<SolicitudInspeccion> getSolicitudInspeccionl() {
        return SolicitudInspeccionl;
    }

    public void setSolicitudInspeccionl(List<SolicitudInspeccion> SolicitudInspeccionl) {
        this.SolicitudInspeccionl = SolicitudInspeccionl;
    }

    public void registrar(){
        //String latitud = "-1.222";
        solicitudInspeccion.setIdUsuario(us.getCodigo());        
        solicitudInspeccion.setIdEstadoSolicitud(estadoSolicitud);
        buscarejbFacade.create(solicitudInspeccion);
        SolicitudInspeccionl = buscarejbFacade.findAll();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Servicio Registrado", null));
           
    }
    /*
    public void leer(SolicitudInspeccion solicitudseleccion){
        }
*/
}