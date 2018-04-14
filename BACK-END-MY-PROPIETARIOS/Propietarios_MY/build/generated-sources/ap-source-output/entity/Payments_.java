package entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-02T17:20:39")
@StaticMetamodel(Payments.class)
public class Payments_ { 

    public static volatile SingularAttribute<Payments, Long> bookingno;
    public static volatile SingularAttribute<Payments, Date> paymentdate;
    public static volatile SingularAttribute<Payments, BigDecimal> amount;
    public static volatile SingularAttribute<Payments, String> gatewayReference;
    public static volatile SingularAttribute<Payments, Integer> modifyuser;
    public static volatile SingularAttribute<Payments, Short> gatewayResult;
    public static volatile SingularAttribute<Payments, Integer> createuser;
    public static volatile SingularAttribute<Payments, Long> roominglistno;
    public static volatile SingularAttribute<Payments, Long> paymentno;
    public static volatile SingularAttribute<Payments, Integer> createposition;
    public static volatile SingularAttribute<Payments, Short> typeno;
    public static volatile SingularAttribute<Payments, Short> accounted;
    public static volatile SingularAttribute<Payments, Integer> buildingno;
    public static volatile SingularAttribute<Payments, Date> createtimestamp;
    public static volatile SingularAttribute<Payments, String> gatewayAuthcode;
    public static volatile SingularAttribute<Payments, Long> intno2Credcard;
    public static volatile SingularAttribute<Payments, Date> modifytimestamp;
    public static volatile SingularAttribute<Payments, Integer> modifyposition;
    public static volatile SingularAttribute<Payments, Integer> paymentformno;

}