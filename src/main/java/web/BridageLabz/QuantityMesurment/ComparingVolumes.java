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
        MILI_LITERS(1.00),GALLONS(4546.09),LITERS(1000.00);

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

    public boolean compare(ComparingVolumes that)
    {
        double a=VolumeSmallestUNIT.convert(this.unit);
        System.out.println("a value   "+ a);
        double b=VolumeSmallestUNIT.convert(that.unit);
        System.out.println("b valuee   "+ b);
        return(a*this.value)==(b*that.value);
    }
}
