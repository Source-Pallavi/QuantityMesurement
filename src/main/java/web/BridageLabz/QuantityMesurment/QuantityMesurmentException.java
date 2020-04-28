package web.BridageLabz.QuantityMesurment;

public class QuantityMesurmentException extends Exception
{
    enum ExceptionType{
        TYPE_MISMATCH;
    }
    ExceptionType type;

    public QuantityMesurmentException(ExceptionType type)
    {
        this.type = type;
    }
}
