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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author BlackScorpion
 */
@Entity
@Table(name = "solicitud_inspeccion", catalog = "postgres", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SolicitudInspeccion.findAll", query = "SELECT s FROM SolicitudInspeccion s")
    , @NamedQuery(name = "SolicitudInspeccion.findByIdSolicitudInspeccion", query = "SELECT s FROM SolicitudInspeccion s WHERE s.idSolicitudInspeccion = :idSolicitudInspeccion")
    , @NamedQuery(name = "SolicitudInspeccion.findByFechaSolicitud", query = "SELECT s FROM SolicitudInspeccion s WHERE s.fechaSolicitud = :fechaSolicitud")
    , @NamedQuery(name = "SolicitudInspeccion.findByIdUsuario", query = "SELECT s FROM SolicitudInspeccion s WHERE s.idUsuario = :idUsuario")
    , @NamedQuery(name = "SolicitudInspeccion.findByLatitud", query = "SELECT s FROM SolicitudInspeccion s WHERE s.latitud = :latitud")
    , @NamedQuery(name = "SolicitudInspeccion.findByLongitud", query = "SELECT s FROM SolicitudInspeccion s WHERE s.longitud = :longitud")})
public class SolicitudInspeccion implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_solicitud_inspeccion", nullable = false)
    private Integer idSolicitudInspeccion;
    
    @Column(name = "fecha_solicitud")
    @Temporal(TemporalType.DATE)
    private Date fechaSolicitud;
    
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Size(max = 2147483647)
    
    @Column(name = "latitud", length = 2147483647)
    private String latitud;
    
    @Size(max = 2147483647)
    @Column(name = "longitud", length = 2147483647)
    private String longitud;
    
    @OneToMany(mappedBy = "idSolicitudInspeccion")
    private Collection<DetalleInspeccion> detalleInspeccionCollection;
    
    @JoinColumn(name = "id_estado_solicitud", referencedColumnName = "id_estado_solicitud")
    @ManyToOne
    private EstadoSolicitud idEstadoSolicitud;
    
    
    @JoinColumn(name = "id_servicio", referencedColumnName = "id_servicio")
    @ManyToOne
    private Servicio idServicio;

    public SolicitudInspeccion() {
    }

    public SolicitudInspeccion(Integer idSolicitudInspeccion) {
        this.idSolicitudInspeccion = idSolicitudInspeccion;
    }

    public Integer getIdSolicitudInspeccion() {
        return idSolicitudInspeccion;
    }

    public void setIdSolicitudInspeccion(Integer idSolicitudInspeccion) {
        this.idSolicitudInspeccion = idSolicitudInspeccion;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    @XmlTransient
    public Collection<DetalleInspeccion> getDetalleInspeccionCollection() {
        return detalleInspeccionCollection;
    }

    public void setDetalleInspeccionCollection(Collection<DetalleInspeccion> detalleInspeccionCollection) {
        this.detalleInspeccionCollection = detalleInspeccionCollection;
    }

    public EstadoSolicitud getIdEstadoSolicitud() {
        return idEstadoSolicitud;
    }

    public void setIdEstadoSolicitud(EstadoSolicitud idEstadoSolicitud) {
        this.idEstadoSolicitud = idEstadoSolicitud;
    }

    public Servicio getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Servicio idServicio) {
        this.idServicio = idServicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSolicitudInspeccion != null ? idSolicitudInspeccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitudInspeccion)) {
            return false;
        }
        SolicitudInspeccion other = (SolicitudInspeccion) object;
        if ((this.idSolicitudInspeccion == null && other.idSolicitudInspeccion != null) || (this.idSolicitudInspeccion != null && !this.idSolicitudInspeccion.equals(other.idSolicitudInspeccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blac.model.SolicitudInspeccion[ idSolicitudInspeccion=" + idSolicitudInspeccion + " ]";
    }

    public void getIdEstadoSolicitud(int estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
