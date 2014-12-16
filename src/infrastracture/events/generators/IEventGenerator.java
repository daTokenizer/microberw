package infrastracture.events.generators;

import java.util.Objects;

/**
 * Created by adam on 16/12/2014.
 */
public interface IEventGenerator<EVENT>
{
    public void addEvent(EVENT event);

    public void emmit();
}
