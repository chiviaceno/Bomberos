/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blac.controller;

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
    private String nombres;
    private String apellidos;
    private String clave;
    private String email;
    private String telefono;
    private String direccion;
    private Usuario usuario;
    
    @EJB
    private com.blac.ejb.UsuarioFacade usuarioperfilEJB2;
    
   
    
    @PostConstruct
public void init(){

    usuario = new Usuario();
} 
    public MiPerfilController() {
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    public void actualizar(){
        System.out.println("Nombre:"+usuario.getNombres());
        //String latitud = "-1.222";
        //usuario.setNombres(getNombres());
        //System.out.println(getNombres());
        //usuario.setApellidos(getApellidos());
       // usuario.setClave(getClave());
        //usuario.setEmail(getEmail());
        //usuario.setTelefono(getTelefono());
        //usuario.setDireccion(getDireccion());
        //usuarioPerfilEJB.edit(usuario);
        
        try {
            System.out.println("1");
        
        Connection conexion=DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "postgresql");
        Statement comando=conexion.createStatement();
        //comando.executeUpdate("insert into public.cacerio(cacerio) values ('1235678')");
        comando.executeUpdate("update public.usuario set tipo='Administrador' where codigo= 4");
        
        conexion.close();
          //if (cantidad==1){
          //    System.out.println("Actualizo correctamente");
         // }
         // else
         // {
         //     System.out.println("Problemas");          
         // }
        //conexion.close();   
        }catch(SQLException ex){
            System.out.println("Error de conexion");
        }
         
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario Actualizado", null));
          
    }
    
    
    
}
