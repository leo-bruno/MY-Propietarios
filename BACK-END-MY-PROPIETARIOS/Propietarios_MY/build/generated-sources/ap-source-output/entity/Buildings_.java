package entity;

import entity.Bookings;
import entity.Objects;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-02T17:20:39")
@StaticMetamodel(Buildings.class)
public class Buildings_ { 

    public static volatile SingularAttribute<Buildings, Date> dateyieldcheck;
    public static volatile SingularAttribute<Buildings, Integer> modifyuser;
    public static volatile SingularAttribute<Buildings, String> faxno2;
    public static volatile SingularAttribute<Buildings, Date> creditDateFrom;
    public static volatile SingularAttribute<Buildings, String> directory;
    public static volatile SingularAttribute<Buildings, String> faxno1;
    public static volatile SingularAttribute<Buildings, Date> dayclose;
    public static volatile SingularAttribute<Buildings, Date> datecleaningcheck;
    public static volatile CollectionAttribute<Buildings, Bookings> bookingsCollection;
    public static volatile SingularAttribute<Buildings, String> phoneno2;
    public static volatile SingularAttribute<Buildings, Integer> createposition;
    public static volatile SingularAttribute<Buildings, String> phoneno1;
    public static volatile SingularAttribute<Buildings, String> email2;
    public static volatile SingularAttribute<Buildings, String> email1;
    public static volatile CollectionAttribute<Buildings, Objects> objectsCollection;
    public static volatile SingularAttribute<Buildings, Date> createtimestamp;
    public static volatile SingularAttribute<Buildings, String> policeuser;
    public static volatile SingularAttribute<Buildings, String> address5;
    public static volatile SingularAttribute<Buildings, String> address4;
    public static volatile SingularAttribute<Buildings, String> webpage;
    public static volatile SingularAttribute<Buildings, Short> policesequencenum;
    public static volatile SingularAttribute<Buildings, Date> modifytimestamp;
    public static volatile SingularAttribute<Buildings, String> comment3;
    public static volatile SingularAttribute<Buildings, String> address3;
    public static volatile SingularAttribute<Buildings, String> comment2;
    public static volatile SingularAttribute<Buildings, String> address2;
    public static volatile SingularAttribute<Buildings, String> comment1;
    public static volatile SingularAttribute<Buildings, String> address1;
    public static volatile SingularAttribute<Buildings, Short> donotclean;
    public static volatile SingularAttribute<Buildings, Integer> accountingVatSequence;
    public static volatile SingularAttribute<Buildings, Integer> createuser;
    public static volatile SingularAttribute<Buildings, String> policeidentifier2;
    public static volatile SingularAttribute<Buildings, String> zipcode;
    public static volatile SingularAttribute<Buildings, Integer> buildingno;
    public static volatile SingularAttribute<Buildings, String> policeweb;
    public static volatile SingularAttribute<Buildings, String> name;
    public static volatile SingularAttribute<Buildings, Integer> policeDataType;
    public static volatile SingularAttribute<Buildings, String> expCiId;
    public static volatile SingularAttribute<Buildings, String> category;
    public static volatile SingularAttribute<Buildings, Date> controlyield;
    public static volatile SingularAttribute<Buildings, Integer> modifyposition;
    public static volatile SingularAttribute<Buildings, String> policeidentifier;
    public static volatile SingularAttribute<Buildings, String> policepassword;

}