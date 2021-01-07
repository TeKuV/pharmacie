package entities;

import entities.Delivery;
import entities.Products;
import entities.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-07T07:45:49")
@StaticMetamodel(Buy.class)
public class Buy_ { 

    public static volatile SingularAttribute<Buy, Integer> buytotal;
    public static volatile CollectionAttribute<Buy, Delivery> deliveryCollection;
    public static volatile CollectionAttribute<Buy, Products> productsCollection;
    public static volatile SingularAttribute<Buy, Integer> buyid;
    public static volatile SingularAttribute<Buy, Users> userid;

}