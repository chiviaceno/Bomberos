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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author BlackScorpion
 */
@Entity
@Table(name = "empleado", catalog = "postgres", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e")
    , @NamedQuery(name = "Empleado.findByIdEmpleado", query = "SELECT e FROM Empleado e WHERE e.idEmpleado = :idEmpleado")
    , @NamedQuery(name = "Empleado.findByIdUsuario", query = "SELECT e FROM Empleado e WHERE e.idUsuario = :idUsuario")
    , @NamedQuery(name = "Empleado.findByEstadoEmpleado", query = "SELECT e FROM Empleado e WHERE e.estadoEmpleado = :estadoEmpleado")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_empleado", nullable = false)
    private Integer idEmpleado;
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Column(name = "estado_empleado")
    private Integer estadoEmpleado;
    @JoinColumn(name = "id_rango_empleado", referencedColumnName = "id_rango_empleado")
    @ManyToOne
    private RangoEmpleado idRangoEmpleado;
    @JoinColumn(name = "id_rol_empleado", referencedColumnName = "id_rol_empleado")
    @ManyToOne
    private RolEmpleado idRolEmpleado;
    @OneToMany(mappedBy = "idEmpleado")
    private Collection<DetalleCuentas> detalleCuentasCollection;

    public Empleado() {
    }

    public Empleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(Integer estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

    public RangoEmpleado getIdRangoEmpleado() {
        return idRangoEmpleado;
    }

    public void setIdRangoEmpleado(RangoEmpleado idRangoEmpleado) {
        this.idRangoEmpleado = idRangoEmpleado;
    }

    public RolEmpleado getIdRolEmpleado() {
        return idRolEmpleado;
    }

    public void setIdRolEmpleado(RolEmpleado idRolEmpleado) {
        this.idRolEmpleado = idRolEmpleado;
    }

    @XmlTransient
    public Collection<DetalleCuentas> getDetalleCuentasCollection() {
        return detalleCuentasCollection;
    }

    public void setDetalleCuentasCollection(Collection<DetalleCuentas> detalleCuentasCollection) {
        this.detalleCuentasCollection = detalleCuentasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleado != null ? idEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.idEmpleado == null && other.idEmpleado != null) || (this.idEmpleado != null && !this.idEmpleado.equals(other.idEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blac.model.Empleado[ idEmpleado=" + idEmpleado + " ]";
    }
    
}
