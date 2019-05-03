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
@Table(name = "cuentas", catalog = "postgres", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuentas.findAll", query = "SELECT c FROM Cuentas c")
    , @NamedQuery(name = "Cuentas.findByIdCuenta", query = "SELECT c FROM Cuentas c WHERE c.idCuenta = :idCuenta")
    , @NamedQuery(name = "Cuentas.findByIdPermiso", query = "SELECT c FROM Cuentas c WHERE c.idPermiso = :idPermiso")
    , @NamedQuery(name = "Cuentas.findByTotalCuenta", query = "SELECT c FROM Cuentas c WHERE c.totalCuenta = :totalCuenta")
    , @NamedQuery(name = "Cuentas.findByIngresoPermiso", query = "SELECT c FROM Cuentas c WHERE c.ingresoPermiso = :ingresoPermiso")
    , @NamedQuery(name = "Cuentas.findByDetalle", query = "SELECT c FROM Cuentas c WHERE c.detalle = :detalle")
    , @NamedQuery(name = "Cuentas.findByFecha", query = "SELECT c FROM Cuentas c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Cuentas.findByValor", query = "SELECT c FROM Cuentas c WHERE c.valor = :valor")})
public class Cuentas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cuenta", nullable = false)
    private Integer idCuenta;
    @Column(name = "id_permiso")
    private Integer idPermiso;
    @Size(max = 2147483647)
    @Column(name = "total_cuenta", length = 2147483647)
    private String totalCuenta;
    @Column(name = "ingreso_permiso")
    private Integer ingresoPermiso;
    @Size(max = 2147483647)
    @Column(name = "detalle", length = 2147483647)
    private String detalle;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "valor")
    private Integer valor;
    @JoinColumn(name = "id_tipo_cuenta", referencedColumnName = "id_tipo_cuenta")
    @ManyToOne
    private TipoCuenta idTipoCuenta;
    @JoinColumn(name = "id_tipo_documento", referencedColumnName = "id_tipo_documento")
    @ManyToOne
    private TipoDocumento idTipoDocumento;
    @OneToMany(mappedBy = "idCuenta")
    private Collection<DetalleCuentas> detalleCuentasCollection;

    public Cuentas() {
    }

    public Cuentas(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Integer getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(Integer idPermiso) {
        this.idPermiso = idPermiso;
    }

    public String getTotalCuenta() {
        return totalCuenta;
    }

    public void setTotalCuenta(String totalCuenta) {
        this.totalCuenta = totalCuenta;
    }

    public Integer getIngresoPermiso() {
        return ingresoPermiso;
    }

    public void setIngresoPermiso(Integer ingresoPermiso) {
        this.ingresoPermiso = ingresoPermiso;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public TipoCuenta getIdTipoCuenta() {
        return idTipoCuenta;
    }

    public void setIdTipoCuenta(TipoCuenta idTipoCuenta) {
        this.idTipoCuenta = idTipoCuenta;
    }

    public TipoDocumento getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(TipoDocumento idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
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
        hash += (idCuenta != null ? idCuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuentas)) {
            return false;
        }
        Cuentas other = (Cuentas) object;
        if ((this.idCuenta == null && other.idCuenta != null) || (this.idCuenta != null && !this.idCuenta.equals(other.idCuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blac.model.Cuentas[ idCuenta=" + idCuenta + " ]";
    }
    
}
