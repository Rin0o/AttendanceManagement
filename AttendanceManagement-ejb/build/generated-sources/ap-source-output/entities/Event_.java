package entities;

import entities.Attendant;
import entities.EventManager;
import entities.Subject;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-13T15:52:54")
@StaticMetamodel(Event.class)
public class Event_ { 

    public static volatile SingularAttribute<Event, Date> date;
    public static volatile ListAttribute<Event, Attendant> attendants;
    public static volatile SingularAttribute<Event, Integer> week;
    public static volatile SingularAttribute<Event, EventManager> manager;
    public static volatile SingularAttribute<Event, Integer> hora;
    public static volatile SingularAttribute<Event, Subject> subject;
    public static volatile SingularAttribute<Event, String> name;
    public static volatile SingularAttribute<Event, Integer> id;
    public static volatile SingularAttribute<Event, String> room;
    public static volatile SingularAttribute<Event, Boolean> status;

}