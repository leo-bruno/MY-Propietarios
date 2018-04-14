package entity;

import entity.Bookings;
import entity.BookingsObjectsPK;
import entity.Categories;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-02T17:20:39")
@StaticMetamodel(BookingsObjects.class)
public class BookingsObjects_ { 

    public static volatile SingularAttribute<BookingsObjects, Date> timefrom;
    public static volatile SingularAttribute<BookingsObjects, Long> objectreservno2;
    public static volatile SingularAttribute<BookingsObjects, String> objectno;
    public static volatile SingularAttribute<BookingsObjects, Date> timeto;
    public static volatile SingularAttribute<BookingsObjects, Integer> modifyuser;
    public static volatile SingularAttribute<BookingsObjects, Long> objectreservno;
    public static volatile SingularAttribute<BookingsObjects, BookingsObjectsPK> bookingsObjectsPK;
    public static volatile SingularAttribute<BookingsObjects, Integer> createuser;
    public static volatile SingularAttribute<BookingsObjects, Long> roominglistno;
    public static volatile SingularAttribute<BookingsObjects, Integer> createposition;
    public static volatile SingularAttribute<BookingsObjects, Long> changeno;
    public static volatile SingularAttribute<BookingsObjects, Integer> virtualno;
    public static volatile SingularAttribute<BookingsObjects, Integer> buildingno;
    public static volatile SingularAttribute<BookingsObjects, Long> roominglistnoprov;
    public static volatile SingularAttribute<BookingsObjects, Date> dateto;
    public static volatile SingularAttribute<BookingsObjects, Date> createtimestamp;
    public static volatile SingularAttribute<BookingsObjects, Short> intervalfrom;
    public static volatile SingularAttribute<BookingsObjects, Short> intervalto;
    public static volatile SingularAttribute<BookingsObjects, Date> datefrom;
    public static volatile SingularAttribute<BookingsObjects, Categories> categories;
    public static volatile SingularAttribute<BookingsObjects, Date> modifytimestamp;
    public static volatile SingularAttribute<BookingsObjects, Bookings> bookings;
    public static volatile SingularAttribute<BookingsObjects, Integer> modifyposition;

}