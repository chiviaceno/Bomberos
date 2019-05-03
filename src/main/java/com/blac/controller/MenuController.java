/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blac.controller;

import com.blac.ejb.MenuFacadeLocal;
import com.blac.model.Menu;
import com.blac.model.Usuario;
import java.io.Serializable;
import javax.ejb.EJB;
import java.util.List;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

/**
 *
 * @author BlackScorpion
 */
@Named
@SessionScoped
public class MenuController implements Serializable {

    @EJB
    private MenuFacadeLocal EJBMenu;
    private List<Menu> lista;
    private MenuModel model;

    @PostConstruct
    public void init() {
        this.listarMenus();
        model = new DefaultMenuModel();
        this.establecerPermisos();
    }

    public void listarMenus() {
        try {
            lista = EJBMenu.findAll();
        } catch (Exception e) {

        }

    }

    public void establecerPermisos() {
        Usuario us = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
        if ("Administrador".equals(us.getTipo())) {
            System.out.println("Menu Administrador");
            

//            DefaultSubMenu homeSubmenu = new DefaultSubMenu("Inicio");
//            DefaultMenuItem iteminicio = new DefaultMenuItem("Ir");
//            iteminicio.setUrl("../home/Principal.xhtml");
//            iteminicio.setIcon("ui-icon-home");
//            homeSubmenu.addElement(iteminicio);
//            model.addElement(homeSubmenu);
//
//            DefaultSubMenu primerSubmenu = new DefaultSubMenu("Cuentas");
//            DefaultMenuItem itemsprimer = new DefaultMenuItem("Listado");
//            itemsprimer.setUrl("../cuentas/List.xhtml");
//            itemsprimer.setIcon("pi pi-home");
//            primerSubmenu.addElement(itemsprimer);
//            model.addElement(primerSubmenu);

        } else if ("Inspector".equals(us.getTipo())) {

            System.out.println("Menu Administrador");

            DefaultSubMenu homeSubmenu = new DefaultSubMenu("Inicio");
            DefaultMenuItem iteminicio = new DefaultMenuItem("Ir");
            iteminicio.setUrl("../home/Principal.xhtml");
            iteminicio.setIcon("ui-icon-home");
            homeSubmenu.addElement(iteminicio);
            model.addElement(homeSubmenu);

            DefaultSubMenu primerSubmenu = new DefaultSubMenu("Inspecciones");
            DefaultMenuItem itemsprimer = new DefaultMenuItem("Listado");
            itemsprimer.setUrl("../solicitudInspeccion/List.xhtml");
            itemsprimer.setIcon("pi pi-home");
            primerSubmenu.addElement(itemsprimer);
            model.addElement(primerSubmenu);

        } else if ("Contador".equals(us.getTipo())) {
            System.out.println("Contador");
        } else if ("Usuario".equals(us.getTipo())) {
            DefaultSubMenu homeSubmenu = new DefaultSubMenu("Inicio");
            DefaultMenuItem iteminicio = new DefaultMenuItem("Ir");
            iteminicio.setUrl("../home/Principal.xhtml");
            iteminicio.setIcon("ui-icon-home");
            homeSubmenu.addElement(iteminicio);
            model.addElement(homeSubmenu);

            DefaultSubMenu primerSubmenu = new DefaultSubMenu("Mis Servicios");

            DefaultMenuItem itemsprimer = new DefaultMenuItem("Listado");
            itemsprimer.setUrl("../misServicios/List.xhtml");
            itemsprimer.setIcon("pi pi-home");
            primerSubmenu.addElement(itemsprimer);

            DefaultMenuItem itemsprimer1 = new DefaultMenuItem("Solicitar");
            itemsprimer1.setUrl("../misServicios/solicitar.xhtml");
            itemsprimer1.setIcon("pi pi-home");
            primerSubmenu.addElement(itemsprimer1);

            model.addElement(primerSubmenu);

            DefaultSubMenu segundoSubmenu = new DefaultSubMenu("Mi Perfil de Usuario");
            DefaultMenuItem itemssegundo = new DefaultMenuItem("Modificar");
            itemssegundo.setUrl("../misServicios/List.xhtml");
            itemssegundo.setIcon("pi pi-home");
            segundoSubmenu.addElement(itemssegundo);
            model.addElement(segundoSubmenu);

        } else {
            System.out.println("Usuario No Validado");
        }

    }

    public MenuModel getModel() {
        return model;
    }

    public void setModel(MenuModel model) {
        this.model = model;
    }

    public void cerrarSesion() {

        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }

}
