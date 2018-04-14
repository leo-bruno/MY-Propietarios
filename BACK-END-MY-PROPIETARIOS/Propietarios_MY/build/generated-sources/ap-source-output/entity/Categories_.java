package entity;

import entity.BookingsObjects;
import entity.CategoriesPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-02T17:20:39")
@StaticMetamodel(Categories.class)
public class Categories_ { 

    public static volatile CollectionAttribute<Categories, BookingsObjects> bookingsObjectsCollection;
    public static volatile SingularAttribute<Categories, String> color;
    public static volatile SingularAttribute<Categories, Short> divisiontype;
    public static volatile SingularAttribute<Categories, Integer> modifyuser;
    public static volatile SingularAttribute<Categories, Short> numobjects;
    public static volatile SingularAttribute<Categories, Integer> debititem;
    public static volatile SingularAttribute<Categories, Integer> childrenno;
    public static volatile SingularAttribute<Categories, Integer> availabilitygrp;
    public static volatile SingularAttribute<Categories, Integer> createposition;
    public static volatile SingularAttribute<Categories, Short> includeCleaning;
    public static volatile SingularAttribute<Categories, Date> createtimestamp;
    public static volatile SingularAttribute<Categories, CategoriesPK> categoriesPK;
    public static volatile SingularAttribute<Categories, Date> modifytimestamp;
    public static volatile SingularAttribute<Categories, Short> notincludeavail;
    public static volatile SingularAttribute<Categories, Short> excludeFromAvail;
    public static volatile SingularAttribute<Categories, Short> donotclean;
    public static volatile SingularAttribute<Categories, Integer> createuser;
    public static volatile SingularAttribute<Categories, Integer> paxno;
    public static volatile SingularAttribute<Categories, Short> objectreservation;
    public static volatile SingularAttribute<Categories, Short> excludeOnlineUpdates;
    public static volatile SingularAttribute<Categories, String> codename;
    public static volatile SingularAttribute<Categories, String> name;
    public static volatile SingularAttribute<Categories, Short> interval;
    public static volatile SingularAttribute<Categories, Integer> modifyposition;
    public static volatile SingularAttribute<Categories, Short> excludeManagerReports;

}