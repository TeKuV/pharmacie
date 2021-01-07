package entities;

import entities.Delivery;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-07T07:45:49")
@StaticMetamodel(Deliveryman.class)
public class Deliveryman_ { 

    public static volatile SingularAttribute<Deliveryman, String> manemail;
    public static volatile CollectionAttribute<Deliveryman, Delivery> deliveryCollection;
    public static volatile SingularAttribute<Deliveryman, Integer> manid;
    public static volatile SingularAttribute<Deliveryman, Integer> manphone;
    public static volatile SingularAttribute<Deliveryman, String> manname;

}