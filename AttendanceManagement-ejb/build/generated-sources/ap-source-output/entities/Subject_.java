package entities;

import entities.Attendant;
import entities.Event;
import entities.EventManager;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-13T15:52:54")
@StaticMetamodel(Subject.class)
public class Subject_ { 

    public static volatile ListAttribute<Subject, Attendant> attendants;
    public static volatile SingularAttribute<Subject, String> name;
    public static volatile SingularAttribute<Subject, Integer> id;
    public static volatile ListAttribute<Subject, EventManager> managers;
    public static volatile ListAttribute<Subject, Event> events;

}