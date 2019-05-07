package com.blac.controller;

import com.blac.ejb.EstadoSolicitudFacadeLocal;
import com.blac.ejb.SolicitudInspeccionFacade;
import com.blac.model.EstadoSolicitud;
import com.blac.model.SolicitudInspeccion;
import static com.blac.model.SolicitudInspeccion_.idEstadoSolicitud;
import com.blac.model.Usuario;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

@Named
@RequestScoped
public class MisServiciosController implements Serializable {
    
    private int codigoEstatus;
    private String codigoInspeccion;
    private EstadoSolicitud estadoSolicitud;
    private UploadedFile file;
    
    @Inject
    private SolicitudInspeccion solicitudInspeccion;
    private SolicitudInspeccion sol;
    private List<SolicitudInspeccion> SolicitudInspeccionl;
    
    @EJB
    private com.blac.ejb.SolicitudInspeccionFacade buscarejbFacade;
    private com.blac.ejb.EstadoSolicitudFacade EstadoSolEJBFacade;
    //private SolicitudInspeccion solicitudInspeccion;

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public EstadoSolicitud getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public void setEstadoSolicitud(EstadoSolicitud estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }
    

    public SolicitudInspeccion getSol() {
        return sol;
    }

    public void setSol(SolicitudInspeccion sol) {
        this.sol = sol;
    }
    
    
    
    Usuario us = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
    
    
    public SolicitudInspeccion getSolicitudInspeccion() {
        return solicitudInspeccion;
    }

    public void setSolicitudInspeccion(SolicitudInspeccion solicitudInspeccion) {
        this.solicitudInspeccion = solicitudInspeccion;
    }
         
    

    public String getCodigoInspeccion() {
        return codigoInspeccion;
    }

    public void setCodigoInspeccion(String codigoInspeccion) {
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

    public void upload() {
        if(file != null) {
            System.out.println("Entro al bean");
            try{
            if(file!=null){
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "postgresql");
            PreparedStatement st = conn.prepareStatement("INSERT INTO public.archivo (doc,ninspeccion) VALUES (?,?);");
            st.setBinaryStream(1, file.getInputstream()); 
            st.setString(2, codigoInspeccion);
            st.executeUpdate();
            conn.close();
            FacesMessage message = new FacesMessage("Carga Exitosa");
            FacesContext.getCurrentInstance().addMessage(null, message);
            
            }
        
        }catch(Exception e){
            FacesMessage message = new FacesMessage("Error de Conexion");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
            
            
        }
    }
     
    public void handleFileUpload(FileUploadEvent event) {
        FacesMessage msg = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void Archivo(){
        System.out.println(file);
    }
    
    public List<SolicitudInspeccion> getSolicitudInspeccionl() {
        return SolicitudInspeccionl;
    }

    public void setSolicitudInspeccionl(List<SolicitudInspeccion> SolicitudInspeccionl) {
        this.SolicitudInspeccionl = SolicitudInspeccionl;
    }

    public void registrar(){
        
        solicitudInspeccion.setIdUsuario(us.getCodigo());
        solicitudInspeccion.setIdEstadoSolicitud(estadoSolicitud);
        buscarejbFacade.create(solicitudInspeccion);
        
        SolicitudInspeccionl = buscarejbFacade.findAll();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Servicio Registrado", null));
           
    }
    
    public void cancelar(){
        System.out.println("Archivo");
        //String latitud = "-1.222";
        solicitudInspeccion.setIdUsuario(us.getCodigo());        
        solicitudInspeccion.setIdEstadoSolicitud(estadoSolicitud);
        buscarejbFacade.create(solicitudInspeccion);
        SolicitudInspeccionl = buscarejbFacade.findAll();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Servicio Registrado", null));
           
    }
    
   public void asignar(){
    int idx = this.solicitudInspeccion.getIdSolicitudInspeccion();
    System.out.println(idx);
    //System.out.println(solicitudInspeccion);
    }
    
    
}