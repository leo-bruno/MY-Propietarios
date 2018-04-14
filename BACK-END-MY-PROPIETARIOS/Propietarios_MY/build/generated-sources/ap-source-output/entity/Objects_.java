package entity;

import entity.Buildings;
import entity.ObjectsPK;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-02T17:20:39")
@StaticMetamodel(Objects.class)
public class Objects_ { 

    public static volatile SingularAttribute<Objects, BigDecimal> amount;
    public static volatile SingularAttribute<Objects, String> comment3;
    public static volatile SingularAttribute<Objects, String> comment2;
    public static volatile SingularAttribute<Objects, String> comment1;
    public static volatile SingularAttribute<Objects, Integer> modifyuser;
    public static volatile SingularAttribute<Objects, Integer> numobjects;
    public static volatile SingularAttribute<Objects, Integer> floorLevel;
    public static volatile SingularAttribute<Objects, Integer> debititem;
    public static volatile SingularAttribute<Objects, Short> clean;
    public static volatile SingularAttribute<Objects, Integer> createuser;
    public static volatile SingularAttribute<Objects, Short> minibar;
    public static volatile SingularAttribute<Objects, Integer> createposition;
    public static volatile SingularAttribute<Objects, String> tpvRoomId;
    public static volatile SingularAttribute<Objects, Short> damaged;
    public static volatile SingularAttribute<Objects, Buildings> buildings;
    public static volatile SingularAttribute<Objects, Date> createtimestamp;
    public static volatile SingularAttribute<Objects, String> name;
    public static volatile SingularAttribute<Objects, Integer> categoryno;
    public static volatile SingularAttribute<Objects, Short> extrabed;
    public static volatile SingularAttribute<Objects, ObjectsPK> objectsPK;
    public static volatile SingularAttribute<Objects, String> motherObjectno;
    public static volatile SingularAttribute<Objects, Date> modifytimestamp;
    public static volatile SingularAttribute<Objects, Integer> modifyposition;
    public static volatile SingularAttribute<Objects, Integer> subcategoryno;

}