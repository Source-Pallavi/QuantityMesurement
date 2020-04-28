package web.BridageLabz.QuantityMesurment;

public class QuantityMesurement
{
    private final double value;
    private final UnitConversion unit;
    public QuantityMesurement(UnitConversion unit, double value)
    {
        this.unit =unit;
        this.value=value;
    }

    enum UnitConversion {
        MILI_LITERS(0.001),GALLONS(4.54609),LITERS(1.00),KILO_GRAMS(1.00),
        GRAMS(0.001), TONES(1000.0),
        CENTIMETER(0.393701), FEET(12), INCH(1), YARD(0.0277778);

        private final double value;
        UnitConversion(double value)
        {
            this.value=value;
        }

        public static double convert(UnitConversion unit)
        {
            double variable= unit.value;
            return variable;
        }


    }

    public static double add(QuantityMesurement value1, QuantityMesurement value2) {
        double a= UnitConversion.convert(value1.unit);
        double b= UnitConversion.convert(value2.unit);
        return ((a*value1.value)+(b*value2.value));
    }

    public boolean compare(QuantityMesurement that)
    {
        double a= UnitConversion.convert(this.unit);
        double b= UnitConversion.convert(that.unit);
        return(a*this.value)==(b*that.value);
    }
  enum TEMPRETURE_CONVERSION
    {Freheit,Celcius;}
    TEMPRETURE_CONVERSION variable;


}
