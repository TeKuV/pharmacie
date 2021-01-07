/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
 * @author Monsieur_Fall
 */
@Entity
@Table(name = "users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findByUserid", query = "SELECT u FROM Users u WHERE u.userid = :userid"),
    @NamedQuery(name = "Users.findByUsername", query = "SELECT u FROM Users u WHERE u.username = :username"),
    @NamedQuery(name = "Users.findByUserpassword", query = "SELECT u FROM Users u WHERE u.userpassword = :userpassword"),
    @NamedQuery(name = "Users.findByUseremail", query = "SELECT u FROM Users u WHERE u.useremail = :useremail"),
    @NamedQuery(name = "Users.findByUserphone", query = "SELECT u FROM Users u WHERE u.userphone = :userphone"),
    @NamedQuery(name = "Users.findByUsergender", query = "SELECT u FROM Users u WHERE u.usergender = :usergender"),
    @NamedQuery(name = "Users.findByUserbirthday", query = "SELECT u FROM Users u WHERE u.userbirthday = :userbirthday"),
    @NamedQuery(name = "Users.findByUserstatus", query = "SELECT u FROM Users u WHERE u.userstatus = :userstatus"),
    @NamedQuery(name = "Users.findByIsadmin", query = "SELECT u FROM Users u WHERE u.isadmin = :isadmin"),
    @NamedQuery(name = "Users.findByIscashier", query = "SELECT u FROM Users u WHERE u.iscashier = :iscashier"),
    @NamedQuery(name = "Users.findByIsclient", query = "SELECT u FROM Users u WHERE u.isclient = :isclient")})
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "userid")
    private Integer userid;
    @Size(max = 254)
    @Column(name = "username")
    private String username;
    @Size(max = 254)
    @Column(name = "userpassword")
    private String userpassword;
    @Size(max = 254)
    @Column(name = "useremail")
    private String useremail;
    @Column(name = "userphone")
    private Integer userphone;
    @Size(max = 254)
    @Column(name = "usergender")
    private String usergender;
    @Column(name = "userbirthday")
    @Temporal(TemporalType.DATE)
    private Date userbirthday;
    @Column(name = "userstatus")
    private Integer userstatus;
    @Column(name = "isadmin")
    private Integer isadmin;
    @Column(name = "iscashier")
    private Integer iscashier;
    @Column(name = "isclient")
    private Integer isclient;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userid")
    private Collection<Buy> buyCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userid")
    private Collection<Bonds> bondsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userid")
    private Collection<Sales> salesCollection;
    @JoinColumn(name = "addressid", referencedColumnName = "addressid")
    @ManyToOne
    private Address addressid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userid")
    private Collection<Products> productsCollection;

    public Users() {
    }

    public Users(Integer userid) {
        this.userid = userid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public Integer getUserphone() {
        return userphone;
    }

    public void setUserphone(Integer userphone) {
        this.userphone = userphone;
    }

    public String getUsergender() {
        return usergender;
    }

    public void setUsergender(String usergender) {
        this.usergender = usergender;
    }

    public Date getUserbirthday() {
        return userbirthday;
    }

    public void setUserbirthday(Date userbirthday) {
        this.userbirthday = userbirthday;
    }

    public Integer getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(Integer userstatus) {
        this.userstatus = userstatus;
    }

    public Integer getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Integer isadmin) {
        this.isadmin = isadmin;
    }

    public Integer getIscashier() {
        return iscashier;
    }

    public void setIscashier(Integer iscashier) {
        this.iscashier = iscashier;
    }

    public Integer getIsclient() {
        return isclient;
    }

    public void setIsclient(Integer isclient) {
        this.isclient = isclient;
    }

    @XmlTransient
    public Collection<Buy> getBuyCollection() {
        return buyCollection;
    }

    public void setBuyCollection(Collection<Buy> buyCollection) {
        this.buyCollection = buyCollection;
    }

    @XmlTransient
    public Collection<Bonds> getBondsCollection() {
        return bondsCollection;
    }

    public void setBondsCollection(Collection<Bonds> bondsCollection) {
        this.bondsCollection = bondsCollection;
    }

    @XmlTransient
    public Collection<Sales> getSalesCollection() {
        return salesCollection;
    }

    public void setSalesCollection(Collection<Sales> salesCollection) {
        this.salesCollection = salesCollection;
    }

    public Address getAddressid() {
        return addressid;
    }

    public void setAddressid(Address addressid) {
        this.addressid = addressid;
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
        hash += (userid != null ? userid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.userid == null && other.userid != null) || (this.userid != null && !this.userid.equals(other.userid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Users[ userid=" + userid + " ]";
    }
    
}
