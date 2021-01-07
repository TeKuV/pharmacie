/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Monsieur_Fall
 */
@Entity
@Table(name = "bonds")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bonds.findAll", query = "SELECT b FROM Bonds b"),
    @NamedQuery(name = "Bonds.findByBondid", query = "SELECT b FROM Bonds b WHERE b.bondid = :bondid"),
    @NamedQuery(name = "Bonds.findByBondcreatedat", query = "SELECT b FROM Bonds b WHERE b.bondcreatedat = :bondcreatedat")})
public class Bonds implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bondid")
    private Integer bondid;
    @Column(name = "bondcreatedat")
    @Temporal(TemporalType.DATE)
    private Date bondcreatedat;
    @JoinColumn(name = "providerid", referencedColumnName = "providerid")
    @ManyToOne(optional = false)
    private Providers providerid;
    @JoinColumn(name = "userid", referencedColumnName = "userid")
    @ManyToOne(optional = false)
    private Users userid;

    public Bonds() {
    }

    public Bonds(Integer bondid) {
        this.bondid = bondid;
    }

    public Integer getBondid() {
        return bondid;
    }

    public void setBondid(Integer bondid) {
        this.bondid = bondid;
    }

    public Date getBondcreatedat() {
        return bondcreatedat;
    }

    public void setBondcreatedat(Date bondcreatedat) {
        this.bondcreatedat = bondcreatedat;
    }

    public Providers getProviderid() {
        return providerid;
    }

    public void setProviderid(Providers providerid) {
        this.providerid = providerid;
    }

    public Users getUserid() {
        return userid;
    }

    public void setUserid(Users userid) {
        this.userid = userid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bondid != null ? bondid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bonds)) {
            return false;
        }
        Bonds other = (Bonds) object;
        if ((this.bondid == null && other.bondid != null) || (this.bondid != null && !this.bondid.equals(other.bondid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Bonds[ bondid=" + bondid + " ]";
    }
    
}
