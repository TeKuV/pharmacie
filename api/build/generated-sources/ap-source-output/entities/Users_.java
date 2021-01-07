package entities;

import entities.Address;
import entities.Bonds;
import entities.Buy;
import entities.Products;
import entities.Sales;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-07T07:45:49")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, Integer> userstatus;
    public static volatile SingularAttribute<Users, Integer> userphone;
    public static volatile SingularAttribute<Users, Integer> userid;
    public static volatile SingularAttribute<Users, String> userpassword;
    public static volatile SingularAttribute<Users, Integer> isclient;
    public static volatile SingularAttribute<Users, Address> addressid;
    public static volatile CollectionAttribute<Users, Bonds> bondsCollection;
    public static volatile CollectionAttribute<Users, Sales> salesCollection;
    public static volatile SingularAttribute<Users, Integer> isadmin;
    public static volatile SingularAttribute<Users, Integer> iscashier;
    public static volatile SingularAttribute<Users, Date> userbirthday;
    public static volatile CollectionAttribute<Users, Products> productsCollection;
    public static volatile SingularAttribute<Users, String> usergender;
    public static volatile CollectionAttribute<Users, Buy> buyCollection;
    public static volatile SingularAttribute<Users, String> username;
    public static volatile SingularAttribute<Users, String> useremail;

}