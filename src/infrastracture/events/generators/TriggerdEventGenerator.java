package infrastracture.events.generators;

import java.util.Vector;
import java.util.function.BooleanSupplier;

/**
 * Created by adam on 16/12/2014.
 */
public class TriggerdEventGenerator<EVENT,TRIGGER extends Trigger> implements IEventGenerator<EVENT>
{
    private EVENT _event = null;

    private TRIGGER _trigger = null;

    @Override
    public void addEvent(EVENT event)
    {
        _event = event;
        emmit();
    }

    @Override
    public void emmit()
    {
        if ((_trigger != null) && (_trigger.isTrue()))
        _outboundPipe.sendInsertEvent(_event);
    }

    public StreamSender getOutboundPipe()
    {
        return _outboundPipe;
    }

    public void setOutboundPipe(StreamSender _outboundPipe)
    {
        this._outboundPipe = _outboundPipe;
    }

    private StreamSender _outboundPipe;
}
