package entities;

import entities.Buy;
import entities.Categories;
import entities.Providers;
import entities.Sales;
import entities.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-07T07:45:49")
@StaticMetamodel(Products.class)
public class Products_ { 

    public static volatile CollectionAttribute<Products, Sales> salesCollection;
    public static volatile SingularAttribute<Products, Integer> productid;
    public static volatile SingularAttribute<Products, Integer> productstock;
    public static volatile SingularAttribute<Products, Providers> providerid;
    public static volatile SingularAttribute<Products, String> productname;
    public static volatile CollectionAttribute<Products, Buy> buyCollection;
    public static volatile SingularAttribute<Products, Users> userid;
    public static volatile SingularAttribute<Products, Categories> categoryid;

}