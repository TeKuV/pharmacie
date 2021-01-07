/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
 * @author Monsieur_Fall
 */
@Entity
@Table(name = "deliveryman")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Deliveryman.findAll", query = "SELECT d FROM Deliveryman d"),
    @NamedQuery(name = "Deliveryman.findByManid", query = "SELECT d FROM Deliveryman d WHERE d.manid = :manid"),
    @NamedQuery(name = "Deliveryman.findByManname", query = "SELECT d FROM Deliveryman d WHERE d.manname = :manname"),
    @NamedQuery(name = "Deliveryman.findByManphone", query = "SELECT d FROM Deliveryman d WHERE d.manphone = :manphone"),
    @NamedQuery(name = "Deliveryman.findByManemail", query = "SELECT d FROM Deliveryman d WHERE d.manemail = :manemail")})
public class Deliveryman implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "manid")
    private Integer manid;
    @Size(max = 254)
    @Column(name = "manname")
    private String manname;
    @Column(name = "manphone")
    private Integer manphone;
    @Size(max = 254)
    @Column(name = "manemail")
    private String manemail;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "manid")
    private Collection<Delivery> deliveryCollection;

    public Deliveryman() {
    }

    public Deliveryman(Integer manid) {
        this.manid = manid;
    }

    public Integer getManid() {
        return manid;
    }

    public void setManid(Integer manid) {
        this.manid = manid;
    }

    public String getManname() {
        return manname;
    }

    public void setManname(String manname) {
        this.manname = manname;
    }

    public Integer getManphone() {
        return manphone;
    }

    public void setManphone(Integer manphone) {
        this.manphone = manphone;
    }

    public String getManemail() {
        return manemail;
    }

    public void setManemail(String manemail) {
        this.manemail = manemail;
    }

    @XmlTransient
    public Collection<Delivery> getDeliveryCollection() {
        return deliveryCollection;
    }

    public void setDeliveryCollection(Collection<Delivery> deliveryCollection) {
        this.deliveryCollection = deliveryCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (manid != null ? manid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deliveryman)) {
            return false;
        }
        Deliveryman other = (Deliveryman) object;
        if ((this.manid == null && other.manid != null) || (this.manid != null && !this.manid.equals(other.manid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Deliveryman[ manid=" + manid + " ]";
    }
    
}
