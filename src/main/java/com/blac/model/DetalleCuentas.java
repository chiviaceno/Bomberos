/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blac.model;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author BlackScorpion
 */
@Entity
@Table(name = "detalle_cuentas", catalog = "postgres", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleCuentas.findAll", query = "SELECT d FROM DetalleCuentas d")
    , @NamedQuery(name = "DetalleCuentas.findByIdDetalleCuentas", query = "SELECT d FROM DetalleCuentas d WHERE d.idDetalleCuentas = :idDetalleCuentas")
    , @NamedQuery(name = "DetalleCuentas.findByTotalCuenta", query = "SELECT d FROM DetalleCuentas d WHERE d.totalCuenta = :totalCuenta")
    , @NamedQuery(name = "DetalleCuentas.findByTotalEgreso", query = "SELECT d FROM DetalleCuentas d WHERE d.totalEgreso = :totalEgreso")
    , @NamedQuery(name = "DetalleCuentas.findByValorTotal", query = "SELECT d FROM DetalleCuentas d WHERE d.valorTotal = :valorTotal")})
public class DetalleCuentas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detalle_cuentas", nullable = false)
    private Integer idDetalleCuentas;
    @Size(max = 2147483647)
    @Column(name = "total_cuenta", length = 2147483647)
    private String totalCuenta;
    @Size(max = 2147483647)
    @Column(name = "total_egreso", length = 2147483647)
    private String totalEgreso;
    @Size(max = 2147483647)
    @Column(name = "valor_total", length = 2147483647)
    private String valorTotal;
    @JoinColumn(name = "id_cuenta", referencedColumnName = "id_cuenta")
    @ManyToOne
    private Cuentas idCuenta;
    @JoinColumn(name = "id_empleado", referencedColumnName = "id_empleado")
    @ManyToOne
    private Empleado idEmpleado;

    public DetalleCuentas() {
    }

    public DetalleCuentas(Integer idDetalleCuentas) {
        this.idDetalleCuentas = idDetalleCuentas;
    }

    public Integer getIdDetalleCuentas() {
        return idDetalleCuentas;
    }

    public void setIdDetalleCuentas(Integer idDetalleCuentas) {
        this.idDetalleCuentas = idDetalleCuentas;
    }

    public String getTotalCuenta() {
        return totalCuenta;
    }

    public void setTotalCuenta(String totalCuenta) {
        this.totalCuenta = totalCuenta;
    }

    public String getTotalEgreso() {
        return totalEgreso;
    }

    public void setTotalEgreso(String totalEgreso) {
        this.totalEgreso = totalEgreso;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cuentas getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Cuentas idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleCuentas != null ? idDetalleCuentas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleCuentas)) {
            return false;
        }
        DetalleCuentas other = (DetalleCuentas) object;
        if ((this.idDetalleCuentas == null && other.idDetalleCuentas != null) || (this.idDetalleCuentas != null && !this.idDetalleCuentas.equals(other.idDetalleCuentas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blac.model.DetalleCuentas[ idDetalleCuentas=" + idDetalleCuentas + " ]";
    }
    
}
