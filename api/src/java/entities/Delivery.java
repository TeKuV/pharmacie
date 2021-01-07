/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Monsieur_Fall
 */
@Entity
@Table(name = "delivery")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Delivery.findAll", query = "SELECT d FROM Delivery d"),
    @NamedQuery(name = "Delivery.findByDeliveryid", query = "SELECT d FROM Delivery d WHERE d.deliveryid = :deliveryid"),
    @NamedQuery(name = "Delivery.findByQtityproduct", query = "SELECT d FROM Delivery d WHERE d.qtityproduct = :qtityproduct")})
public class Delivery implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "deliveryid")
    private Integer deliveryid;
    @Column(name = "qtityproduct")
    private Integer qtityproduct;
    @JoinColumn(name = "buyid", referencedColumnName = "buyid")
    @ManyToOne(optional = false)
    private Buy buyid;
    @JoinColumn(name = "manid", referencedColumnName = "manid")
    @ManyToOne(optional = false)
    private Deliveryman manid;

    public Delivery() {
    }

    public Delivery(Integer deliveryid) {
        this.deliveryid = deliveryid;
    }

    public Integer getDeliveryid() {
        return deliveryid;
    }

    public void setDeliveryid(Integer deliveryid) {
        this.deliveryid = deliveryid;
    }

    public Integer getQtityproduct() {
        return qtityproduct;
    }

    public void setQtityproduct(Integer qtityproduct) {
        this.qtityproduct = qtityproduct;
    }

    public Buy getBuyid() {
        return buyid;
    }

    public void setBuyid(Buy buyid) {
        this.buyid = buyid;
    }

    public Deliveryman getManid() {
        return manid;
    }

    public void setManid(Deliveryman manid) {
        this.manid = manid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deliveryid != null ? deliveryid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Delivery)) {
            return false;
        }
        Delivery other = (Delivery) object;
        if ((this.deliveryid == null && other.deliveryid != null) || (this.deliveryid != null && !this.deliveryid.equals(other.deliveryid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Delivery[ deliveryid=" + deliveryid + " ]";
    }
    
}
