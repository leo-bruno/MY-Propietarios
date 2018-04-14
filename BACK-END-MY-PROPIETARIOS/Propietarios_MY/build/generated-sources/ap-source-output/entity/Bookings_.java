package entity;

import entity.BookingsObjects;
import entity.BookingsObjectstype;
import entity.Buildings;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-02T17:20:39")
@StaticMetamodel(Bookings.class)
public class Bookings_ { 

    public static volatile CollectionAttribute<Bookings, BookingsObjects> bookingsObjectsCollection;
    public static volatile SingularAttribute<Bookings, Long> policedatano;
    public static volatile SingularAttribute<Bookings, Integer> modifyuser;
    public static volatile SingularAttribute<Bookings, Short> fullcredit;
    public static volatile CollectionAttribute<Bookings, BookingsObjectstype> bookingsObjectstypeCollection;
    public static volatile SingularAttribute<Bookings, Short> debitConjunct;
    public static volatile SingularAttribute<Bookings, Short> creditdepartm;
    public static volatile SingularAttribute<Bookings, Short> operatortype;
    public static volatile SingularAttribute<Bookings, Integer> paymentno;
    public static volatile SingularAttribute<Bookings, Integer> createposition;
    public static volatile SingularAttribute<Bookings, Short> chargeinit;
    public static volatile SingularAttribute<Bookings, Short> webChannel;
    public static volatile SingularAttribute<Bookings, String> clientname;
    public static volatile SingularAttribute<Bookings, Short> quota;
    public static volatile SingularAttribute<Bookings, Date> createtimestamp;
    public static volatile SingularAttribute<Bookings, Short> antifullcredit;
    public static volatile SingularAttribute<Bookings, Date> modifytimestamp;
    public static volatile SingularAttribute<Bookings, Integer> operatorbranch;
    public static volatile SingularAttribute<Bookings, Long> bookingno;
    public static volatile SingularAttribute<Bookings, Integer> bookingtype;
    public static volatile SingularAttribute<Bookings, Short> ratetype;
    public static volatile SingularAttribute<Bookings, Date> datedeparture;
    public static volatile SingularAttribute<Bookings, String> comments;
    public static volatile SingularAttribute<Bookings, Integer> operatorno;
    public static volatile SingularAttribute<Bookings, Date> lastdatecharged;
    public static volatile SingularAttribute<Bookings, Long> clientno;
    public static volatile SingularAttribute<Bookings, Short> debitType;
    public static volatile SingularAttribute<Bookings, Short> wellcomecard;
    public static volatile SingularAttribute<Bookings, Integer> createuser;
    public static volatile SingularAttribute<Bookings, Date> datearrival;
    public static volatile SingularAttribute<Bookings, Integer> rateno;
    public static volatile SingularAttribute<Bookings, Buildings> buildingno;
    public static volatile SingularAttribute<Bookings, Short> vatIncluded;
    public static volatile SingularAttribute<Bookings, BigDecimal> creditamount;
    public static volatile SingularAttribute<Bookings, String> clientnameclear;
    public static volatile SingularAttribute<Bookings, Integer> modifyposition;
    public static volatile SingularAttribute<Bookings, Short> status;

}