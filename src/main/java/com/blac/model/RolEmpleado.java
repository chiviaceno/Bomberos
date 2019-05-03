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
@Table(name = "rol_empleado", catalog = "postgres", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RolEmpleado.findAll", query = "SELECT r FROM RolEmpleado r")
    , @NamedQuery(name = "RolEmpleado.findByIdRolEmpleado", query = "SELECT r FROM RolEmpleado r WHERE r.idRolEmpleado = :idRolEmpleado")
    , @NamedQuery(name = "RolEmpleado.findByRolEmpleado", query = "SELECT r FROM RolEmpleado r WHERE r.rolEmpleado = :rolEmpleado")})
public class RolEmpleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_rol_empleado", nullable = false)
    private Integer idRolEmpleado;
    @Size(max = 2147483647)
    @Column(name = "rol_empleado", length = 2147483647)
    private String rolEmpleado;
    @OneToMany(mappedBy = "idRolEmpleado")
    private Collection<Empleado> empleadoCollection;

    public RolEmpleado() {
    }

    public RolEmpleado(Integer idRolEmpleado) {
        this.idRolEmpleado = idRolEmpleado;
    }

    public Integer getIdRolEmpleado() {
        return idRolEmpleado;
    }

    public void setIdRolEmpleado(Integer idRolEmpleado) {
        this.idRolEmpleado = idRolEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
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
        hash += (idRolEmpleado != null ? idRolEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolEmpleado)) {
            return false;
        }
        RolEmpleado other = (RolEmpleado) object;
        if ((this.idRolEmpleado == null && other.idRolEmpleado != null) || (this.idRolEmpleado != null && !this.idRolEmpleado.equals(other.idRolEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blac.model.RolEmpleado[ idRolEmpleado=" + idRolEmpleado + " ]";
    }
    
}
