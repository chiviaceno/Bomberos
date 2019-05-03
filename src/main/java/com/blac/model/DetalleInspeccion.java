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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author BlackScorpion
 */
@Entity
@Table(name = "detalle_inspeccion", catalog = "postgres", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleInspeccion.findAll", query = "SELECT d FROM DetalleInspeccion d")
    , @NamedQuery(name = "DetalleInspeccion.findByIdDetalleInspeccion", query = "SELECT d FROM DetalleInspeccion d WHERE d.idDetalleInspeccion = :idDetalleInspeccion")
    , @NamedQuery(name = "DetalleInspeccion.findByFechaInspeccion", query = "SELECT d FROM DetalleInspeccion d WHERE d.fechaInspeccion = :fechaInspeccion")})
public class DetalleInspeccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detalle_inspeccion", nullable = false)
    private Integer idDetalleInspeccion;
    @Column(name = "fecha_inspeccion")
    @Temporal(TemporalType.DATE)
    private Date fechaInspeccion;
    @JoinColumn(name = "id_estado_inspeccion", referencedColumnName = "id_estado_inspeccion")
    @ManyToOne
    private EstadoInspeccion idEstadoInspeccion;
    @JoinColumn(name = "id_inspeccion", referencedColumnName = "id_inspeccion")
    @ManyToOne
    private Inspeccion idInspeccion;
    @JoinColumn(name = "id_solicitud_inspeccion", referencedColumnName = "id_solicitud_inspeccion")
    @ManyToOne
    private SolicitudInspeccion idSolicitudInspeccion;
    @OneToMany(mappedBy = "idDetalleInspeccion")
    private Collection<DetallePermiso> detallePermisoCollection;

    public DetalleInspeccion() {
    }

    public DetalleInspeccion(Integer idDetalleInspeccion) {
        this.idDetalleInspeccion = idDetalleInspeccion;
    }

    public Integer getIdDetalleInspeccion() {
        return idDetalleInspeccion;
    }

    public void setIdDetalleInspeccion(Integer idDetalleInspeccion) {
        this.idDetalleInspeccion = idDetalleInspeccion;
    }

    public Date getFechaInspeccion() {
        return fechaInspeccion;
    }

    public void setFechaInspeccion(Date fechaInspeccion) {
        this.fechaInspeccion = fechaInspeccion;
    }

    public EstadoInspeccion getIdEstadoInspeccion() {
        return idEstadoInspeccion;
    }

    public void setIdEstadoInspeccion(EstadoInspeccion idEstadoInspeccion) {
        this.idEstadoInspeccion = idEstadoInspeccion;
    }

    public Inspeccion getIdInspeccion() {
        return idInspeccion;
    }

    public void setIdInspeccion(Inspeccion idInspeccion) {
        this.idInspeccion = idInspeccion;
    }

    public SolicitudInspeccion getIdSolicitudInspeccion() {
        return idSolicitudInspeccion;
    }

    public void setIdSolicitudInspeccion(SolicitudInspeccion idSolicitudInspeccion) {
        this.idSolicitudInspeccion = idSolicitudInspeccion;
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
        hash += (idDetalleInspeccion != null ? idDetalleInspeccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleInspeccion)) {
            return false;
        }
        DetalleInspeccion other = (DetalleInspeccion) object;
        if ((this.idDetalleInspeccion == null && other.idDetalleInspeccion != null) || (this.idDetalleInspeccion != null && !this.idDetalleInspeccion.equals(other.idDetalleInspeccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blac.model.DetalleInspeccion[ idDetalleInspeccion=" + idDetalleInspeccion + " ]";
    }
    
}
