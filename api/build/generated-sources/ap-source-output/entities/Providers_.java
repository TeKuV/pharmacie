package entities;

import entities.Bonds;
import entities.Products;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-07T07:45:49")
@StaticMetamodel(Providers.class)
public class Providers_ { 

    public static volatile CollectionAttribute<Providers, Bonds> bondsCollection;
    public static volatile SingularAttribute<Providers, String> provideremail;
    public static volatile CollectionAttribute<Providers, Products> productsCollection;
    public static volatile SingularAttribute<Providers, Integer> providerid;
    public static volatile SingularAttribute<Providers, String> providername;
    public static volatile SingularAttribute<Providers, Integer> providerphone;

}