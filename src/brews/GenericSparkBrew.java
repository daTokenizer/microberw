package brews;

import kernels.ILogic;

/**
 * Created by adam on 22/12/2014.
 */
public class GenericSparkBrew<IN,OUT> extends GenericBrew<IN, OUT>
{

    private String _brewName = "undefined brew";
    private int _numThreads = 1;


    public GenericSparkBrew(OUT _result, ILogic<IN, OUT> _logic)
    {
        super(_result, _logic);
    }

    @Override
    public void addEvent(OUT out)
    {

    }

    @Override
    public void emmit()
    {

    }
}
