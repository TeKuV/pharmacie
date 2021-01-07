package entities;

import entities.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-07T07:45:49")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, String> country;
    public static volatile SingularAttribute<Address, String> town;
    public static volatile SingularAttribute<Address, String> description;
    public static volatile CollectionAttribute<Address, Users> usersCollection;
    public static volatile SingularAttribute<Address, Integer> addressid;
    public static volatile SingularAttribute<Address, String> quarter;

}