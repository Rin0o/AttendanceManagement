package entities;

import entities.Event;
import entities.Subject;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-13T15:52:54")
@StaticMetamodel(EventManager.class)
public class EventManager_ extends User_ {

    public static volatile ListAttribute<EventManager, Subject> subjects;
    public static volatile ListAttribute<EventManager, Event> events;

}