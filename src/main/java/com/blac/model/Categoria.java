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
@Table(name = "categoria", catalog = "postgres", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM Categoria c")
    , @NamedQuery(name = "Categoria.findByIdCacerio", query = "SELECT c FROM Categoria c WHERE c.idCacerio = :idCacerio")
    , @NamedQuery(name = "Categoria.findByCacerio", query = "SELECT c FROM Categoria c WHERE c.cacerio = :cacerio")})
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cacerio", nullable = false)
    private Integer idCacerio;
    @Size(max = 255)
    @Column(name = "cacerio", length = 255)
    private String cacerio;

    public Categoria() {
    }

    public Categoria(Integer idCacerio) {
        this.idCacerio = idCacerio;
    }

    public Integer getIdCacerio() {
        return idCacerio;
    }

    public void setIdCacerio(Integer idCacerio) {
        this.idCacerio = idCacerio;
    }

    public String getCacerio() {
        return cacerio;
    }

    public void setCacerio(String cacerio) {
        this.cacerio = cacerio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCacerio != null ? idCacerio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoria)) {
            return false;
        }
        Categoria other = (Categoria) object;
        if ((this.idCacerio == null && other.idCacerio != null) || (this.idCacerio != null && !this.idCacerio.equals(other.idCacerio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.blac.model.Categoria[ idCacerio=" + idCacerio + " ]";
    }
    
}
