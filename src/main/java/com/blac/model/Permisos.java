/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blac.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author BlackScorpion
 */
@Entity
@Table(name = "permisos", catalog = "postgres", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Permisos.findAll", query = "SELECT p FROM Permisos p")
    , @NamedQuery(name = "Permisos.findByIdPermiso", query = "SELECT p FROM Permisos p WHERE p.idPermiso = :idPermiso")
    , @NamedQuery(name = "Permisos.findByNumeroPermiso", query = "SELECT p FROM Permisos p WHERE p.numeroPermiso = :numeroPermiso")
    , @NamedQuery(name = "Permisos.findByResponsable", query = "SELECT p FROM Permisos p WHERE p.responsable = :responsable")
    , @NamedQuery(name = "Permisos.findByFechaEmision", query = "SELECT p FROM Permisos p WHERE p.fechaEmision = :fechaEmision")})
public class Permisos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_permiso", nullable = false)
    private Integer idPermiso;
    @Column(name = "numero_permiso")
    private Integer numeroPermiso;
    @Size(max = 2147483647)
    @Column(name = "responsable", length = 2147483647)
    private String responsable;
    @Column(name = "fecha_emision")
    @Temporal(TemporalType.DATE)
    private Date fechaEmision;
    @OneToMany(mappedBy = "idPermiso")
    private Collection<DetallePermiso> detallePermisoCollection;

    public Permisos() {
    }

    public Permisos(Integer idPermiso) {
        this.idPermiso = idPermiso;
    }

    public Integer getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(Integer idPermiso) {
        this.idPermiso = idPermiso;
    }

    public Integer getNumeroPermiso() {
        return numeroPermiso;
    }

    public void setNumeroPermiso(Integer numeroPermiso) {
        this.numeroPermiso = numeroPermiso;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    @XmlTransient
    public Collection<DetallePermiso> getDetallePermisoCollection() {
        return detallePermisoCollection;
    }

    public void setDetallePermisoCollection(Collection<DetallePermiso> detallePermisoCollection) {
        this.detallePermisoCollection = detallePermisoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPermiso != null ? idPermiso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permisos)) {
            return false;
        }
        Permisos other = (Permisos) object;
        if ((this.idPermiso == null && other.idPermiso != null) || (this.idPermiso != null && !this.idPermiso.equals(other.idPermiso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blac.model.Permisos[ idPermiso=" + idPermiso + " ]";
    }
    
}
