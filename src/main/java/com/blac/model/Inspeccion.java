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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author BlackScorpion
 */
@Entity
@Table(name = "inspeccion", catalog = "postgres", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inspeccion.findAll", query = "SELECT i FROM Inspeccion i")
    , @NamedQuery(name = "Inspeccion.findByIdInspeccion", query = "SELECT i FROM Inspeccion i WHERE i.idInspeccion = :idInspeccion")
    , @NamedQuery(name = "Inspeccion.findByIdEmpleado", query = "SELECT i FROM Inspeccion i WHERE i.idEmpleado = :idEmpleado")
    , @NamedQuery(name = "Inspeccion.findByRequisitoUno", query = "SELECT i FROM Inspeccion i WHERE i.requisitoUno = :requisitoUno")
    , @NamedQuery(name = "Inspeccion.findByRequisitoDos", query = "SELECT i FROM Inspeccion i WHERE i.requisitoDos = :requisitoDos")
    , @NamedQuery(name = "Inspeccion.findByRequisitoTres", query = "SELECT i FROM Inspeccion i WHERE i.requisitoTres = :requisitoTres")
    , @NamedQuery(name = "Inspeccion.findByRequisitoCuatro", query = "SELECT i FROM Inspeccion i WHERE i.requisitoCuatro = :requisitoCuatro")
    , @NamedQuery(name = "Inspeccion.findByRequisitoCinco", query = "SELECT i FROM Inspeccion i WHERE i.requisitoCinco = :requisitoCinco")
    , @NamedQuery(name = "Inspeccion.findByRequisitoSeis", query = "SELECT i FROM Inspeccion i WHERE i.requisitoSeis = :requisitoSeis")
    , @NamedQuery(name = "Inspeccion.findByRequisitoSiete", query = "SELECT i FROM Inspeccion i WHERE i.requisitoSiete = :requisitoSiete")
    , @NamedQuery(name = "Inspeccion.findByRequisitoOcho", query = "SELECT i FROM Inspeccion i WHERE i.requisitoOcho = :requisitoOcho")
    , @NamedQuery(name = "Inspeccion.findByRequisitoNueve", query = "SELECT i FROM Inspeccion i WHERE i.requisitoNueve = :requisitoNueve")
    , @NamedQuery(name = "Inspeccion.findByRequisitoDiez", query = "SELECT i FROM Inspeccion i WHERE i.requisitoDiez = :requisitoDiez")
    , @NamedQuery(name = "Inspeccion.findByRequisitoOnce", query = "SELECT i FROM Inspeccion i WHERE i.requisitoOnce = :requisitoOnce")
    , @NamedQuery(name = "Inspeccion.findByRequisitoDoce", query = "SELECT i FROM Inspeccion i WHERE i.requisitoDoce = :requisitoDoce")
    , @NamedQuery(name = "Inspeccion.findByObservaciones", query = "SELECT i FROM Inspeccion i WHERE i.observaciones = :observaciones")
    , @NamedQuery(name = "Inspeccion.findByNSolicitud", query = "SELECT i FROM Inspeccion i WHERE i.nSolicitud = :nSolicitud")})
public class Inspeccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_inspeccion", nullable = false)
    private Integer idInspeccion;
    @Column(name = "id_empleado")
    private Integer idEmpleado;
    @Column(name = "requisito_uno")
    private Integer requisitoUno;
    @Column(name = "requisito_dos")
    private Integer requisitoDos;
    @Column(name = "requisito_tres")
    private Integer requisitoTres;
    @Column(name = "requisito_cuatro")
    private Integer requisitoCuatro;
    @Column(name = "requisito_cinco")
    private Integer requisitoCinco;
    @Column(name = "requisito_seis")
    private Integer requisitoSeis;
    @Column(name = "requisito_siete")
    private Integer requisitoSiete;
    @Column(name = "requisito_ocho")
    private Integer requisitoOcho;
    @Column(name = "requisito_nueve")
    private Integer requisitoNueve;
    @Column(name = "requisito_diez")
    private Integer requisitoDiez;
    @Column(name = "requisito_once")
    private Integer requisitoOnce;
    @Column(name = "requisito_doce")
    private Integer requisitoDoce;
    @Size(max = 2147483647)
    @Column(name = "observaciones", length = 2147483647)
    private String observaciones;
    @Column(name = "n_solicitud")
    private Integer nSolicitud;
    @OneToMany(mappedBy = "idInspeccion")
    private Collection<DetalleInspeccion> detalleInspeccionCollection;
    @JoinColumn(name = "id_requisito_diez", referencedColumnName = "id_requisito_inspeccion")
    @ManyToOne
    private RequisitosInspeccion idRequisitoDiez;
    @JoinColumn(name = "id_requisito_uno", referencedColumnName = "id_requisito_inspeccion")
    @ManyToOne
    private RequisitosInspeccion idRequisitoUno;
    @JoinColumn(name = "id_requisito_once", referencedColumnName = "id_requisito_inspeccion")
    @ManyToOne
    private RequisitosInspeccion idRequisitoOnce;
    @JoinColumn(name = "id_requisito_nueve", referencedColumnName = "id_requisito_inspeccion")
    @ManyToOne
    private RequisitosInspeccion idRequisitoNueve;
    @JoinColumn(name = "id_requisito_doce", referencedColumnName = "id_requisito_inspeccion")
    @ManyToOne
    private RequisitosInspeccion idRequisitoDoce;
    @JoinColumn(name = "id_requisito_dos", referencedColumnName = "id_requisito_inspeccion")
    @ManyToOne
    private RequisitosInspeccion idRequisitoDos;
    @JoinColumn(name = "id_requisito_tres", referencedColumnName = "id_requisito_inspeccion")
    @ManyToOne
    private RequisitosInspeccion idRequisitoTres;
    @JoinColumn(name = "id_requisito_cuatro", referencedColumnName = "id_requisito_inspeccion")
    @ManyToOne
    private RequisitosInspeccion idRequisitoCuatro;
    @JoinColumn(name = "id_requisito_cinco", referencedColumnName = "id_requisito_inspeccion")
    @ManyToOne
    private RequisitosInspeccion idRequisitoCinco;
    @JoinColumn(name = "id_requisito_seis", referencedColumnName = "id_requisito_inspeccion")
    @ManyToOne
    private RequisitosInspeccion idRequisitoSeis;
    @JoinColumn(name = "id_requisito_siete", referencedColumnName = "id_requisito_inspeccion")
    @ManyToOne
    private RequisitosInspeccion idRequisitoSiete;
    @JoinColumn(name = "id_requisito_ocho", referencedColumnName = "id_requisito_inspeccion")
    @ManyToOne
    private RequisitosInspeccion idRequisitoOcho;

    public Inspeccion() {
    }

    public Inspeccion(Integer idInspeccion) {
        this.idInspeccion = idInspeccion;
    }

    public Integer getIdInspeccion() {
        return idInspeccion;
    }

    public void setIdInspeccion(Integer idInspeccion) {
        this.idInspeccion = idInspeccion;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getRequisitoUno() {
        return requisitoUno;
    }

    public void setRequisitoUno(Integer requisitoUno) {
        this.requisitoUno = requisitoUno;
    }

    public Integer getRequisitoDos() {
        return requisitoDos;
    }

    public void setRequisitoDos(Integer requisitoDos) {
        this.requisitoDos = requisitoDos;
    }

    public Integer getRequisitoTres() {
        return requisitoTres;
    }

    public void setRequisitoTres(Integer requisitoTres) {
        this.requisitoTres = requisitoTres;
    }

    public Integer getRequisitoCuatro() {
        return requisitoCuatro;
    }

    public void setRequisitoCuatro(Integer requisitoCuatro) {
        this.requisitoCuatro = requisitoCuatro;
    }

    public Integer getRequisitoCinco() {
        return requisitoCinco;
    }

    public void setRequisitoCinco(Integer requisitoCinco) {
        this.requisitoCinco = requisitoCinco;
    }

    public Integer getRequisitoSeis() {
        return requisitoSeis;
    }

    public void setRequisitoSeis(Integer requisitoSeis) {
        this.requisitoSeis = requisitoSeis;
    }

    public Integer getRequisitoSiete() {
        return requisitoSiete;
    }

    public void setRequisitoSiete(Integer requisitoSiete) {
        this.requisitoSiete = requisitoSiete;
    }

    public Integer getRequisitoOcho() {
        return requisitoOcho;
    }

    public void setRequisitoOcho(Integer requisitoOcho) {
        this.requisitoOcho = requisitoOcho;
    }

    public Integer getRequisitoNueve() {
        return requisitoNueve;
    }

    public void setRequisitoNueve(Integer requisitoNueve) {
        this.requisitoNueve = requisitoNueve;
    }

    public Integer getRequisitoDiez() {
        return requisitoDiez;
    }

    public void setRequisitoDiez(Integer requisitoDiez) {
        this.requisitoDiez = requisitoDiez;
    }

    public Integer getRequisitoOnce() {
        return requisitoOnce;
    }

    public void setRequisitoOnce(Integer requisitoOnce) {
        this.requisitoOnce = requisitoOnce;
    }

    public Integer getRequisitoDoce() {
        return requisitoDoce;
    }

    public void setRequisitoDoce(Integer requisitoDoce) {
        this.requisitoDoce = requisitoDoce;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getNSolicitud() {
        return nSolicitud;
    }

    public void setNSolicitud(Integer nSolicitud) {
        this.nSolicitud = nSolicitud;
    }

    @XmlTransient
    public Collection<DetalleInspeccion> getDetalleInspeccionCollection() {
        return detalleInspeccionCollection;
    }

    public void setDetalleInspeccionCollection(Collection<DetalleInspeccion> detalleInspeccionCollection) {
        this.detalleInspeccionCollection = detalleInspeccionCollection;
    }

    public RequisitosInspeccion getIdRequisitoDiez() {
        return idRequisitoDiez;
    }

    public void setIdRequisitoDiez(RequisitosInspeccion idRequisitoDiez) {
        this.idRequisitoDiez = idRequisitoDiez;
    }

    public RequisitosInspeccion getIdRequisitoUno() {
        return idRequisitoUno;
    }

    public void setIdRequisitoUno(RequisitosInspeccion idRequisitoUno) {
        this.idRequisitoUno = idRequisitoUno;
    }

    public RequisitosInspeccion getIdRequisitoOnce() {
        return idRequisitoOnce;
    }

    public void setIdRequisitoOnce(RequisitosInspeccion idRequisitoOnce) {
        this.idRequisitoOnce = idRequisitoOnce;
    }

    public RequisitosInspeccion getIdRequisitoNueve() {
        return idRequisitoNueve;
    }

    public void setIdRequisitoNueve(RequisitosInspeccion idRequisitoNueve) {
        this.idRequisitoNueve = idRequisitoNueve;
    }

    public RequisitosInspeccion getIdRequisitoDoce() {
        return idRequisitoDoce;
    }

    public void setIdRequisitoDoce(RequisitosInspeccion idRequisitoDoce) {
        this.idRequisitoDoce = idRequisitoDoce;
    }

    public RequisitosInspeccion getIdRequisitoDos() {
        return idRequisitoDos;
    }

    public void setIdRequisitoDos(RequisitosInspeccion idRequisitoDos) {
        this.idRequisitoDos = idRequisitoDos;
    }

    public RequisitosInspeccion getIdRequisitoTres() {
        return idRequisitoTres;
    }

    public void setIdRequisitoTres(RequisitosInspeccion idRequisitoTres) {
        this.idRequisitoTres = idRequisitoTres;
    }

    public RequisitosInspeccion getIdRequisitoCuatro() {
        return idRequisitoCuatro;
    }

    public void setIdRequisitoCuatro(RequisitosInspeccion idRequisitoCuatro) {
        this.idRequisitoCuatro = idRequisitoCuatro;
    }

    public RequisitosInspeccion getIdRequisitoCinco() {
        return idRequisitoCinco;
    }

    public void setIdRequisitoCinco(RequisitosInspeccion idRequisitoCinco) {
        this.idRequisitoCinco = idRequisitoCinco;
    }

    public RequisitosInspeccion getIdRequisitoSeis() {
        return idRequisitoSeis;
    }

    public void setIdRequisitoSeis(RequisitosInspeccion idRequisitoSeis) {
        this.idRequisitoSeis = idRequisitoSeis;
    }

    public RequisitosInspeccion getIdRequisitoSiete() {
        return idRequisitoSiete;
    }

    public void setIdRequisitoSiete(RequisitosInspeccion idRequisitoSiete) {
        this.idRequisitoSiete = idRequisitoSiete;
    }

    public RequisitosInspeccion getIdRequisitoOcho() {
        return idRequisitoOcho;
    }

    public void setIdRequisitoOcho(RequisitosInspeccion idRequisitoOcho) {
        this.idRequisitoOcho = idRequisitoOcho;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInspeccion != null ? idInspeccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inspeccion)) {
            return false;
        }
        Inspeccion other = (Inspeccion) object;
        if ((this.idInspeccion == null && other.idInspeccion != null) || (this.idInspeccion != null && !this.idInspeccion.equals(other.idInspeccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blac.model.Inspeccion[ idInspeccion=" + idInspeccion + " ]";
    }
    
}
