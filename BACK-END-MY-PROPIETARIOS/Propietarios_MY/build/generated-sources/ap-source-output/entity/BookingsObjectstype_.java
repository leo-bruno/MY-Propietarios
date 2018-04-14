package entity;

import entity.Bookings;
import entity.BookingsObjectstypePK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-02T17:20:39")
@StaticMetamodel(BookingsObjectstype.class)
public class BookingsObjectstype_ { 

    public static volatile SingularAttribute<BookingsObjectstype, BookingsObjectstypePK> bookingsObjectstypePK;
    public static volatile SingularAttribute<BookingsObjectstype, Integer> quantity;
    public static volatile SingularAttribute<BookingsObjectstype, Integer> modifyuser;
    public static volatile SingularAttribute<BookingsObjectstype, Integer> createuser;
    public static volatile SingularAttribute<BookingsObjectstype, Integer> createposition;
    public static volatile SingularAttribute<BookingsObjectstype, Integer> virtualno;
    public static volatile SingularAttribute<BookingsObjectstype, Short> operatordebit;
    public static volatile SingularAttribute<BookingsObjectstype, Integer> categoryno;
    public static volatile SingularAttribute<BookingsObjectstype, Date> createtimestamp;
    public static volatile SingularAttribute<BookingsObjectstype, Date> modifytimestamp;
    public static volatile SingularAttribute<BookingsObjectstype, Bookings> bookings;
    public static volatile SingularAttribute<BookingsObjectstype, Integer> modifyposition;
    public static volatile SingularAttribute<BookingsObjectstype, Integer> subcategoryno;

}