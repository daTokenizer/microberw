package brews;

import kernels.ILogic;
import infrastracture.events.generators.IEventGenerator;

public abstract class GenericBrew<IN,OUT> implements IEventGenerator<OUT>
{

  private OUT _result;
  private ILogic<IN,OUT>  _logic;


  public GenericBrew(OUT _result, ILogic<IN, OUT> _logic)
  {
    this._result = _result;
    this._logic = _logic;
  }



  public void brew(IN[] events) {
    // apply logic to data
    _result = _logic.apply(events);
  }

  public OUT generate()
  {
    return _result;
  }

  // Getters and setters

  public ILogic getLogic()
  {
    return _logic;
  }

  public void setLogic(ILogic _logic)
  {
    this._logic = _logic;
  }

  public static String getBrewName()
  {
    return _brewName;
  }

  public static void setBrewName(String _brewName)
  {
    GenericBrew._brewName = _brewName;
  }

  public static int getNumThreads()
  {
    return _numThreads;
  }

  public static void setNumThreads(int _numThreads)
  {
    GenericBrew._numThreads = _numThreads;
  }


}
