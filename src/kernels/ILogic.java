package kernels;

/**
 * Created by adam on 16/12/2014.
 */
public interface ILogic<DATA,RESULT>
{
    public RESULT apply(DATA[] data);
}
