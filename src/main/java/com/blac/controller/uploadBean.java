/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blac.controller;

import com.blac.model.SolicitudInspeccion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author BlackScorpion
 */
@Named(value = "uploadBean")
@ManagedBean
@SessionScoped
public class uploadBean {
private UploadedFile file;
@EJB
private com.blac.ejb.SolicitudInspeccionFacade ARejbFacade;
private SolicitudInspeccion selected;

    public SolicitudInspeccion getSelected() {
        return selected;
    }

    public void setSelected(SolicitudInspeccion selected) {
        this.selected = selected;
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }
     
    public uploadBean() {
        System.out.println("Entro al bean");
        /*
        try{
            if(file!=null){
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "postgresql");
            PreparedStatement st = conn.prepareStatement("INSERT INTO public.archivo (doc) VALUES (?);");
            st.setBinaryStream(1, file.getInputstream());
            st.executeUpdate();
            conn.close();
            FacesMessage message = new FacesMessage("Carga Exitosa");
            FacesContext.getCurrentInstance().addMessage(null, message);
            
            }
        
        }catch(Exception e){
            FacesMessage message = new FacesMessage("Error de Conexion");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    
*/
    }
    
    public void File(){
    
    }
    
    public void Upload(){
    
    }
    
    
}
