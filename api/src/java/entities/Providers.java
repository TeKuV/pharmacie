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
@Table(name = "providers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Providers.findAll", query = "SELECT p FROM Providers p"),
    @NamedQuery(name = "Providers.findByProviderid", query = "SELECT p FROM Providers p WHERE p.providerid = :providerid"),
    @NamedQuery(name = "Providers.findByProvidername", query = "SELECT p FROM Providers p WHERE p.providername = :providername"),
    @NamedQuery(name = "Providers.findByProviderphone", query = "SELECT p FROM Providers p WHERE p.providerphone = :providerphone"),
    @NamedQuery(name = "Providers.findByProvideremail", query = "SELECT p FROM Providers p WHERE p.provideremail = :provideremail")})
public class Providers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "providerid")
    private Integer providerid;
    @Size(max = 254)
    @Column(name = "providername")
    private String providername;
    @Column(name = "providerphone")
    private Integer providerphone;
    @Size(max = 254)
    @Column(name = "provideremail")
    private String provideremail;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "providerid")
    private Collection<Bonds> bondsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "providerid")
    private Collection<Products> productsCollection;

    public Providers() {
    }

    public Providers(Integer providerid) {
        this.providerid = providerid;
    }

    public Integer getProviderid() {
        return providerid;
    }

    public void setProviderid(Integer providerid) {
        this.providerid = providerid;
    }

    public String getProvidername() {
        return providername;
    }

    public void setProvidername(String providername) {
        this.providername = providername;
    }

    public Integer getProviderphone() {
        return providerphone;
    }

    public void setProviderphone(Integer providerphone) {
        this.providerphone = providerphone;
    }

    public String getProvideremail() {
        return provideremail;
    }

    public void setProvideremail(String provideremail) {
        this.provideremail = provideremail;
    }

    @XmlTransient
    public Collection<Bonds> getBondsCollection() {
        return bondsCollection;
    }

    public void setBondsCollection(Collection<Bonds> bondsCollection) {
        this.bondsCollection = bondsCollection;
    }

    @XmlTransient
    public Collection<Products> getProductsCollection() {
        return productsCollection;
    }

    public void setProductsCollection(Collection<Products> productsCollection) {
        this.productsCollection = productsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (providerid != null ? providerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Providers)) {
            return false;
        }
        Providers other = (Providers) object;
        if ((this.providerid == null && other.providerid != null) || (this.providerid != null && !this.providerid.equals(other.providerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Providers[ providerid=" + providerid + " ]";
    }
    
}
