package entities;

import entities.Providers;
import entities.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-07T07:45:49")
@StaticMetamodel(Bonds.class)
public class Bonds_ { 

    public static volatile SingularAttribute<Bonds, Integer> bondid;
    public static volatile SingularAttribute<Bonds, Date> bondcreatedat;
    public static volatile SingularAttribute<Bonds, Providers> providerid;
    public static volatile SingularAttribute<Bonds, Users> userid;

}