package com.blac.controller;

import com.blac.model.RequisitosInspeccion;
import com.blac.controller.util.JsfUtil;
import com.blac.controller.util.JsfUtil.PersistAction;
import com.blac.ejb.RequisitosInspeccionFacade;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("requisitosInspeccionController")
@SessionScoped
public class RequisitosInspeccionController implements Serializable {

    @EJB
    private com.blac.ejb.RequisitosInspeccionFacade ejbFacade;
    private List<RequisitosInspeccion> items = null;
    private RequisitosInspeccion selected;

    public RequisitosInspeccionController() {
    }

    public RequisitosInspeccion getSelected() {
        return selected;
    }

    public void setSelected(RequisitosInspeccion selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private RequisitosInspeccionFacade getFacade() {
        return ejbFacade;
    }

    public RequisitosInspeccion prepareCreate() {
        selected = new RequisitosInspeccion();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("RequisitosInspeccionCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("RequisitosInspeccionUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("RequisitosInspeccionDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<RequisitosInspeccion> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public RequisitosInspeccion getRequisitosInspeccion(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<RequisitosInspeccion> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<RequisitosInspeccion> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = RequisitosInspeccion.class)
    public static class RequisitosInspeccionControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            RequisitosInspeccionController controller = (RequisitosInspeccionController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "requisitosInspeccionController");
            return controller.getRequisitosInspeccion(getKey(value));
        }

        java.lang.Integer getKey(String value) {
            java.lang.Integer key;
            key = Integer.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Integer value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof RequisitosInspeccion) {
                RequisitosInspeccion o = (RequisitosInspeccion) object;
                return getStringKey(o.getIdRequisitoInspeccion());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), RequisitosInspeccion.class.getName()});
                return null;
            }
        }

    }

}
