/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blac.model;

import java.io.Serializable;
import java.util.Collection;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author BlackScorpion
 */
@Entity
@Table(name = "estado_inspeccion", catalog = "postgres", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoInspeccion.findAll", query = "SELECT e FROM EstadoInspeccion e")
    , @NamedQuery(name = "EstadoInspeccion.findByIdEstadoInspeccion", query = "SELECT e FROM EstadoInspeccion e WHERE e.idEstadoInspeccion = :idEstadoInspeccion")
    , @NamedQuery(name = "EstadoInspeccion.findByNombreEstadoInspeccion", query = "SELECT e FROM EstadoInspeccion e WHERE e.nombreEstadoInspeccion = :nombreEstadoInspeccion")})
public class EstadoInspeccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estado_inspeccion", nullable = false)
    private Integer idEstadoInspeccion;
    @Size(max = 2147483647)
    @Column(name = "nombre_estado_inspeccion", length = 2147483647)
    private String nombreEstadoInspeccion;
    @OneToMany(mappedBy = "idEstadoInspeccion")
    private Collection<DetalleInspeccion> detalleInspeccionCollection;

    public EstadoInspeccion() {
    }

    public EstadoInspeccion(Integer idEstadoInspeccion) {
        this.idEstadoInspeccion = idEstadoInspeccion;
    }

    public Integer getIdEstadoInspeccion() {
        return idEstadoInspeccion;
    }

    public void setIdEstadoInspeccion(Integer idEstadoInspeccion) {
        this.idEstadoInspeccion = idEstadoInspeccion;
    }

    public String getNombreEstadoInspeccion() {
        return nombreEstadoInspeccion;
    }

    public void setNombreEstadoInspeccion(String nombreEstadoInspeccion) {
        this.nombreEstadoInspeccion = nombreEstadoInspeccion;
    }

    @XmlTransient
    public Collection<DetalleInspeccion> getDetalleInspeccionCollection() {
        return detalleInspeccionCollection;
    }

    public void setDetalleInspeccionCollection(Collection<DetalleInspeccion> detalleInspeccionCollection) {
        this.detalleInspeccionCollection = detalleInspeccionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstadoInspeccion != null ? idEstadoInspeccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoInspeccion)) {
            return false;
        }
        EstadoInspeccion other = (EstadoInspeccion) object;
        if ((this.idEstadoInspeccion == null && other.idEstadoInspeccion != null) || (this.idEstadoInspeccion != null && !this.idEstadoInspeccion.equals(other.idEstadoInspeccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blac.model.EstadoInspeccion[ idEstadoInspeccion=" + idEstadoInspeccion + " ]";
    }
    
}
