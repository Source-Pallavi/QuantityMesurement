package web.BridageLabz.QuantityMesurment;

public class QuantityMesurement
{
    private final double value;
    private final UnitConversion unit;
    private final UnitConversion smallestUNIT=null;

    public QuantityMesurement(UnitConversion unit, double value)
    {
        this.unit =unit;
        this.value=value;
    }

    enum UnitConversion {
        MILI_LITERS(0.001),GALLONS(4.54609),LITERS(1.00),KILO_GRAMS(1.00),
        GRAMS(0.001),TONNS(1000.0);

        private final double value;
        UnitConversion(double value)
        {
            this.value=value;
        }

        public static double convert(UnitConversion unit)
        {
            double variable= unit.value;
            System.out.println("a"+variable);
            return variable;
        }

    }

    public static double add(QuantityMesurement value1, QuantityMesurement value2) {
        double a= UnitConversion.convert(value1.unit);
        System.out.println("value of a "+ a);
        double b= UnitConversion.convert(value2.unit);
        System.out.println("---------------------"+((a*value1.value)+(b*value2.value)));
        return ((a*value1.value)+(b*value2.value));
    }

    public boolean compare(QuantityMesurement that)
    {
        double a= UnitConversion.convert(this.unit);
        System.out.println("a value   "+ a);
        double b= UnitConversion.convert(that.unit);
        System.out.println("b valuee   "+ b);
        System.out.println("---------------------"+((a*this.value)+"+"+(b*that.value)));

        return(a*this.value)==(b*that.value);
    }
}
