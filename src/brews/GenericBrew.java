package brews;

import kernels.ILogic;
import infrastracture.events.generators.IEventGenerator;

public abstract class GenericBrew<IN,OUT> implements IEventGenerator<OUT>
{

  private OUT

  private ILogic<IN,OUT>   _logic;

  public void brew(IN[] events) {
    // apply logic to data

    return _eventGenerator.generate(_logic.apply(events));
  }

  public OUT generate(){
    return
  }

  public ILogic getLogic()
  {
    return _logic;
  }

  public void setLogic(ILogic _logic)
  {
    this._logic = _logic;
  }
}
