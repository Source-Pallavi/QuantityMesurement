package web.BridageLabz.QuantityMesurment;

public class SmallestUnit {
    private final double value;
    private final SmallestUNIT unit;
    private final SmallestUNIT smallestUNIT=null;

    public SmallestUnit(SmallestUNIT unit, double value)
    {
        this.unit =unit;
        this.value=value;
    }

    public static double add(SmallestUnit value1, SmallestUnit value2) {
        double a=SmallestUNIT.convert(value1.unit);
        double b=SmallestUNIT.convert(value2.unit);
        return (a+b);
    }

    public boolean compare(SmallestUnit that)
    {
      double a=SmallestUNIT.convert(this.unit);
      double b=SmallestUNIT.convert(that.unit);
        return ((a*this.value)==(b*that.value));
    }

    enum SmallestUNIT {
        CENTIMETER(1), FEET(30.00), INCH(2.00), YARD(91.00);

        private final double value;

        SmallestUNIT(double value)
        {
            this.value=value;
        }

        public static double convert(SmallestUNIT unit)
        {
            double variable= unit.value;
            return variable;
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmallestUnit that = (SmallestUnit) o;
        return smallestUNIT == that.smallestUNIT;
    }

}
