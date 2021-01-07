package entities;

import entities.Products;
import entities.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-07T07:45:49")
@StaticMetamodel(Sales.class)
public class Sales_ { 

    public static volatile SingularAttribute<Sales, Integer> saleid;
    public static volatile CollectionAttribute<Sales, Products> productsCollection;
    public static volatile SingularAttribute<Sales, Integer> saletotal;
    public static volatile SingularAttribute<Sales, Users> userid;

}