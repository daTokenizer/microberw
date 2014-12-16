package brews;

import kernels.ILogic;

import javax.xml.transform.stream.StreamSource;

public abstract class GenericBrew
{
  private StreamSource[] _sources;

  private StreamSender[] _targets;

  private ILogic _logic;

  public void run() {
    // resolve sources

    // pull/receive data from different sources

    // resolve logic

    // apply logic to data

    // resolve targets

    // send/put data to targets

  }


  public StreamSource[] getSources()
  {
    return _sources;
  }

  public void setSources(StreamSource[] _sources)
  {
    this._sources = _sources;
  }

  public StreamTarget[] getTargets()
  {
    return _targets;
  }

  public void setTargets(StreamTarget[] _targets)
  {
    this._targets = _targets;
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
