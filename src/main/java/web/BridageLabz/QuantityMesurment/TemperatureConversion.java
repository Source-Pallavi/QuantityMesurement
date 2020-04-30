package web.BridageLabz.QuantityMesurment;

public class TemperatureConversion
{

    private final Temperature temperature;
    private final double degree;

    public TemperatureConversion(Temperature temperature, double degree)
    {
        this.temperature=temperature;
        this.degree=degree;
    }

    public boolean compare(TemperatureConversion that)
    {
        double degree =convert(that);
        System.out.println(degree+" "+that.degree);
        return that.degree==degree;
    }

    private double convert(TemperatureConversion that)
    {
        if (that.temperature==Temperature.FAHRENHEIT)
           return  (((that.degree)-32)*(5/9));
        else
            return  ((that.degree*(5/9))+32);
    }
}
enum Temperature
{
    FAHRENHEIT,CELSIUS;
}