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
@Table(name = "rango_empleado", catalog = "postgres", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RangoEmpleado.findAll", query = "SELECT r FROM RangoEmpleado r")
    , @NamedQuery(name = "RangoEmpleado.findByIdRangoEmpleado", query = "SELECT r FROM RangoEmpleado r WHERE r.idRangoEmpleado = :idRangoEmpleado")
    , @NamedQuery(name = "RangoEmpleado.findByRangoEmpleado", query = "SELECT r FROM RangoEmpleado r WHERE r.rangoEmpleado = :rangoEmpleado")})
public class RangoEmpleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_rango_empleado", nullable = false)
    private Integer idRangoEmpleado;
    @Size(max = 2147483647)
    @Column(name = "rango_empleado", length = 2147483647)
    private String rangoEmpleado;
    @OneToMany(mappedBy = "idRangoEmpleado")
    private Collection<Empleado> empleadoCollection;

    public RangoEmpleado() {
    }

    public RangoEmpleado(Integer idRangoEmpleado) {
        this.idRangoEmpleado = idRangoEmpleado;
    }

    public Integer getIdRangoEmpleado() {
        return idRangoEmpleado;
    }

    public void setIdRangoEmpleado(Integer idRangoEmpleado) {
        this.idRangoEmpleado = idRangoEmpleado;
    }

    public String getRangoEmpleado() {
        return rangoEmpleado;
    }

    public void setRangoEmpleado(String rangoEmpleado) {
        this.rangoEmpleado = rangoEmpleado;
    }

    @XmlTransient
    public Collection<Empleado> getEmpleadoCollection() {
        return empleadoCollection;
    }

    public void setEmpleadoCollection(Collection<Empleado> empleadoCollection) {
        this.empleadoCollection = empleadoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRangoEmpleado != null ? idRangoEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RangoEmpleado)) {
            return false;
        }
        RangoEmpleado other = (RangoEmpleado) object;
        if ((this.idRangoEmpleado == null && other.idRangoEmpleado != null) || (this.idRangoEmpleado != null && !this.idRangoEmpleado.equals(other.idRangoEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blac.model.RangoEmpleado[ idRangoEmpleado=" + idRangoEmpleado + " ]";
    }
    
}
