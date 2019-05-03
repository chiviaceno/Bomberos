/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blac.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author BlackScorpion
 */
@Entity
@Table(name = "detalle_permiso", catalog = "postgres", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetallePermiso.findAll", query = "SELECT d FROM DetallePermiso d")
    , @NamedQuery(name = "DetallePermiso.findByIdDetallePermiso", query = "SELECT d FROM DetallePermiso d WHERE d.idDetallePermiso = :idDetallePermiso")
    , @NamedQuery(name = "DetallePermiso.findByFechaExpiracion", query = "SELECT d FROM DetallePermiso d WHERE d.fechaExpiracion = :fechaExpiracion")})
public class DetallePermiso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detalle_permiso", nullable = false)
    private Integer idDetallePermiso;
    @Column(name = "fecha_expiracion")
    @Temporal(TemporalType.DATE)
    private Date fechaExpiracion;
    @JoinColumn(name = "id_detalle_inspeccion", referencedColumnName = "id_detalle_inspeccion")
    @ManyToOne
    private DetalleInspeccion idDetalleInspeccion;
    @JoinColumn(name = "id_permiso", referencedColumnName = "id_permiso")
    @ManyToOne
    private Permisos idPermiso;

    public DetallePermiso() {
    }

    public DetallePermiso(Integer idDetallePermiso) {
        this.idDetallePermiso = idDetallePermiso;
    }

    public Integer getIdDetallePermiso() {
        return idDetallePermiso;
    }

    public void setIdDetallePermiso(Integer idDetallePermiso) {
        this.idDetallePermiso = idDetallePermiso;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public DetalleInspeccion getIdDetalleInspeccion() {
        return idDetalleInspeccion;
    }

    public void setIdDetalleInspeccion(DetalleInspeccion idDetalleInspeccion) {
        this.idDetalleInspeccion = idDetalleInspeccion;
    }

    public Permisos getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(Permisos idPermiso) {
        this.idPermiso = idPermiso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetallePermiso != null ? idDetallePermiso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallePermiso)) {
            return false;
        }
        DetallePermiso other = (DetallePermiso) object;
        if ((this.idDetallePermiso == null && other.idDetallePermiso != null) || (this.idDetallePermiso != null && !this.idDetallePermiso.equals(other.idDetallePermiso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blac.model.DetallePermiso[ idDetallePermiso=" + idDetallePermiso + " ]";
    }
    
}
