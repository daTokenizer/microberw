package infrastracture.events.generators;

/**
 * Created by adam on 16/12/2014.
 */
public class SingleImidiateEventGenerator<EVENT> implements IEventGenerator<EVENT>
{
    private EVENT _event = null;


    @Override
    public void addEvent(EVENT event)
    {
        _event = event;
        emmit();
    }

    @Override
    public void emmit()
    {
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
