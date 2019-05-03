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
@Table(name = "requisitos_inspeccion", catalog = "postgres", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RequisitosInspeccion.findAll", query = "SELECT r FROM RequisitosInspeccion r")
    , @NamedQuery(name = "RequisitosInspeccion.findByIdRequisitoInspeccion", query = "SELECT r FROM RequisitosInspeccion r WHERE r.idRequisitoInspeccion = :idRequisitoInspeccion")
    , @NamedQuery(name = "RequisitosInspeccion.findByNombreRequisitosInspeccion", query = "SELECT r FROM RequisitosInspeccion r WHERE r.nombreRequisitosInspeccion = :nombreRequisitosInspeccion")
    , @NamedQuery(name = "RequisitosInspeccion.findByDetalleRequisitosInspeccion", query = "SELECT r FROM RequisitosInspeccion r WHERE r.detalleRequisitosInspeccion = :detalleRequisitosInspeccion")})
public class RequisitosInspeccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_requisito_inspeccion", nullable = false)
    private Integer idRequisitoInspeccion;
    @Size(max = 2147483647)
    @Column(name = "nombre_requisitos_inspeccion", length = 2147483647)
    private String nombreRequisitosInspeccion;
    @Size(max = 2147483647)
    @Column(name = "detalle_requisitos_inspeccion", length = 2147483647)
    private String detalleRequisitosInspeccion;
    @OneToMany(mappedBy = "idRequisitoDiez")
    private Collection<Inspeccion> inspeccionCollection;
    @OneToMany(mappedBy = "idRequisitoUno")
    private Collection<Inspeccion> inspeccionCollection1;
    @OneToMany(mappedBy = "idRequisitoOnce")
    private Collection<Inspeccion> inspeccionCollection2;
    @OneToMany(mappedBy = "idRequisitoNueve")
    private Collection<Inspeccion> inspeccionCollection3;
    @OneToMany(mappedBy = "idRequisitoDoce")
    private Collection<Inspeccion> inspeccionCollection4;
    @OneToMany(mappedBy = "idRequisitoDos")
    private Collection<Inspeccion> inspeccionCollection5;
    @OneToMany(mappedBy = "idRequisitoTres")
    private Collection<Inspeccion> inspeccionCollection6;
    @OneToMany(mappedBy = "idRequisitoCuatro")
    private Collection<Inspeccion> inspeccionCollection7;
    @OneToMany(mappedBy = "idRequisitoCinco")
    private Collection<Inspeccion> inspeccionCollection8;
    @OneToMany(mappedBy = "idRequisitoSeis")
    private Collection<Inspeccion> inspeccionCollection9;
    @OneToMany(mappedBy = "idRequisitoSiete")
    private Collection<Inspeccion> inspeccionCollection10;
    @OneToMany(mappedBy = "idRequisitoOcho")
    private Collection<Inspeccion> inspeccionCollection11;

    public RequisitosInspeccion() {
    }

    public RequisitosInspeccion(Integer idRequisitoInspeccion) {
        this.idRequisitoInspeccion = idRequisitoInspeccion;
    }

    public Integer getIdRequisitoInspeccion() {
        return idRequisitoInspeccion;
    }

    public void setIdRequisitoInspeccion(Integer idRequisitoInspeccion) {
        this.idRequisitoInspeccion = idRequisitoInspeccion;
    }

    public String getNombreRequisitosInspeccion() {
        return nombreRequisitosInspeccion;
    }

    public void setNombreRequisitosInspeccion(String nombreRequisitosInspeccion) {
        this.nombreRequisitosInspeccion = nombreRequisitosInspeccion;
    }

    public String getDetalleRequisitosInspeccion() {
        return detalleRequisitosInspeccion;
    }

    public void setDetalleRequisitosInspeccion(String detalleRequisitosInspeccion) {
        this.detalleRequisitosInspeccion = detalleRequisitosInspeccion;
    }

    @XmlTransient
    public Collection<Inspeccion> getInspeccionCollection() {
        return inspeccionCollection;
    }

    public void setInspeccionCollection(Collection<Inspeccion> inspeccionCollection) {
        this.inspeccionCollection = inspeccionCollection;
    }

    @XmlTransient
    public Collection<Inspeccion> getInspeccionCollection1() {
        return inspeccionCollection1;
    }

    public void setInspeccionCollection1(Collection<Inspeccion> inspeccionCollection1) {
        this.inspeccionCollection1 = inspeccionCollection1;
    }

    @XmlTransient
    public Collection<Inspeccion> getInspeccionCollection2() {
        return inspeccionCollection2;
    }

    public void setInspeccionCollection2(Collection<Inspeccion> inspeccionCollection2) {
        this.inspeccionCollection2 = inspeccionCollection2;
    }

    @XmlTransient
    public Collection<Inspeccion> getInspeccionCollection3() {
        return inspeccionCollection3;
    }

    public void setInspeccionCollection3(Collection<Inspeccion> inspeccionCollection3) {
        this.inspeccionCollection3 = inspeccionCollection3;
    }

    @XmlTransient
    public Collection<Inspeccion> getInspeccionCollection4() {
        return inspeccionCollection4;
    }

    public void setInspeccionCollection4(Collection<Inspeccion> inspeccionCollection4) {
        this.inspeccionCollection4 = inspeccionCollection4;
    }

    @XmlTransient
    public Collection<Inspeccion> getInspeccionCollection5() {
        return inspeccionCollection5;
    }

    public void setInspeccionCollection5(Collection<Inspeccion> inspeccionCollection5) {
        this.inspeccionCollection5 = inspeccionCollection5;
    }

    @XmlTransient
    public Collection<Inspeccion> getInspeccionCollection6() {
        return inspeccionCollection6;
    }

    public void setInspeccionCollection6(Collection<Inspeccion> inspeccionCollection6) {
        this.inspeccionCollection6 = inspeccionCollection6;
    }

    @XmlTransient
    public Collection<Inspeccion> getInspeccionCollection7() {
        return inspeccionCollection7;
    }

    public void setInspeccionCollection7(Collection<Inspeccion> inspeccionCollection7) {
        this.inspeccionCollection7 = inspeccionCollection7;
    }

    @XmlTransient
    public Collection<Inspeccion> getInspeccionCollection8() {
        return inspeccionCollection8;
    }

    public void setInspeccionCollection8(Collection<Inspeccion> inspeccionCollection8) {
        this.inspeccionCollection8 = inspeccionCollection8;
    }

    @XmlTransient
    public Collection<Inspeccion> getInspeccionCollection9() {
        return inspeccionCollection9;
    }

    public void setInspeccionCollection9(Collection<Inspeccion> inspeccionCollection9) {
        this.inspeccionCollection9 = inspeccionCollection9;
    }

    @XmlTransient
    public Collection<Inspeccion> getInspeccionCollection10() {
        return inspeccionCollection10;
    }

    public void setInspeccionCollection10(Collection<Inspeccion> inspeccionCollection10) {
        this.inspeccionCollection10 = inspeccionCollection10;
    }

    @XmlTransient
    public Collection<Inspeccion> getInspeccionCollection11() {
        return inspeccionCollection11;
    }

    public void setInspeccionCollection11(Collection<Inspeccion> inspeccionCollection11) {
        this.inspeccionCollection11 = inspeccionCollection11;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRequisitoInspeccion != null ? idRequisitoInspeccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RequisitosInspeccion)) {
            return false;
        }
        RequisitosInspeccion other = (RequisitosInspeccion) object;
        if ((this.idRequisitoInspeccion == null && other.idRequisitoInspeccion != null) || (this.idRequisitoInspeccion != null && !this.idRequisitoInspeccion.equals(other.idRequisitoInspeccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + nombreRequisitosInspeccion + "";
    }
    
}
