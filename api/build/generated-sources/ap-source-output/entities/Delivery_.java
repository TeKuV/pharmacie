package entities;

import entities.Buy;
import entities.Deliveryman;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-07T07:45:49")
@StaticMetamodel(Delivery.class)
public class Delivery_ { 

    public static volatile SingularAttribute<Delivery, Integer> deliveryid;
    public static volatile SingularAttribute<Delivery, Deliveryman> manid;
    public static volatile SingularAttribute<Delivery, Integer> qtityproduct;
    public static volatile SingularAttribute<Delivery, Buy> buyid;

}