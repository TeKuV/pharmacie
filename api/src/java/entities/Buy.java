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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Monsieur_Fall
 */
@Entity
@Table(name = "buy")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Buy.findAll", query = "SELECT b FROM Buy b"),
    @NamedQuery(name = "Buy.findByBuyid", query = "SELECT b FROM Buy b WHERE b.buyid = :buyid"),
    @NamedQuery(name = "Buy.findByBuytotal", query = "SELECT b FROM Buy b WHERE b.buytotal = :buytotal")})
public class Buy implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "buyid")
    private Integer buyid;
    @Column(name = "buytotal")
    private Integer buytotal;
    @JoinTable(name = "buyedproducts", joinColumns = {
        @JoinColumn(name = "buyid", referencedColumnName = "buyid")}, inverseJoinColumns = {
        @JoinColumn(name = "productid", referencedColumnName = "productid")})
    @ManyToMany
    private Collection<Products> productsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "buyid")
    private Collection<Delivery> deliveryCollection;
    @JoinColumn(name = "userid", referencedColumnName = "userid")
    @ManyToOne(optional = false)
    private Users userid;

    public Buy() {
    }

    public Buy(Integer buyid) {
        this.buyid = buyid;
    }

    public Integer getBuyid() {
        return buyid;
    }

    public void setBuyid(Integer buyid) {
        this.buyid = buyid;
    }

    public Integer getBuytotal() {
        return buytotal;
    }

    public void setBuytotal(Integer buytotal) {
        this.buytotal = buytotal;
    }

    @XmlTransient
    public Collection<Products> getProductsCollection() {
        return productsCollection;
    }

    public void setProductsCollection(Collection<Products> productsCollection) {
        this.productsCollection = productsCollection;
    }

    @XmlTransient
    public Collection<Delivery> getDeliveryCollection() {
        return deliveryCollection;
    }

    public void setDeliveryCollection(Collection<Delivery> deliveryCollection) {
        this.deliveryCollection = deliveryCollection;
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
        hash += (buyid != null ? buyid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Buy)) {
            return false;
        }
        Buy other = (Buy) object;
        if ((this.buyid == null && other.buyid != null) || (this.buyid != null && !this.buyid.equals(other.buyid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Buy[ buyid=" + buyid + " ]";
    }
    
}
