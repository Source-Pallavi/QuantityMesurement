package web.BridageLabz.QuantityMesurment;

public class ComparingVolumes
{
    private final double value;
    private final VolumeSmallestUNIT unit;
    private final VolumeSmallestUNIT smallestUNIT=null;

    public ComparingVolumes(VolumeSmallestUNIT unit, double value)
    {
        this.unit =unit;
        this.value=value;
    }

    enum VolumeSmallestUNIT {
        MILI_LITERS(0.001),GALLONS(4.54609),LITERS(1.00);

        private final double value;
        VolumeSmallestUNIT(double value)
        {
            this.value=value;
        }

        public static double convert(ComparingVolumes.VolumeSmallestUNIT unit)
        {
            double variable= unit.value;
            System.out.println("a"+variable);
            return variable;
        }

    }

    public static double add(ComparingVolumes value1, ComparingVolumes value2) {
        double a=VolumeSmallestUNIT.convert(value1.unit);
        System.out.println("value of a "+ a);
        double b=VolumeSmallestUNIT.convert(value2.unit);
        System.out.println("value of b "+b );
        System.out.println(+a+" "+b+ "sum "+(a+b));
        System.out.println(((a*value1.value)+(b*value2.value)));
        return ((a*value1.value)+(b*value2.value));
    }

    public boolean compare(ComparingVolumes that)
    {
        double a=VolumeSmallestUNIT.convert(this.unit);
        System.out.println("a value   "+ a);
        double b=VolumeSmallestUNIT.convert(that.unit);
        System.out.println("b valuee   "+ b);
        return(a*this.value)==(b*that.value);
    }
}
