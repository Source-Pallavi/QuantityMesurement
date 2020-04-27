package web.BridageLabz.QuantityMesurment;

import java.util.Objects;

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
        System.out.println("value of a "+ a);
        double b=SmallestUNIT.convert(value2.unit);
        System.out.println("value of b "+b );
        System.out.println(+a+" "+b+ "sum "+(a+b));
        return (Math.floor(((a*value1.value)+(b*value2.value))*0.393701));
    }

    public boolean compare(SmallestUnit that)
    {
      double a=SmallestUNIT.convert(this.unit);
        System.out.println("a value   "+ a);
      double b=SmallestUNIT.convert(that.unit);
        System.out.println("b valuee   "+ b);
        return(a*this.value)==(b*that.value);
    }

    enum SmallestUNIT {
        CENTIMETER(1), FEET(30.48), INCH(2.54), YARD(91.44);
        private final double value;
        SmallestUNIT(double value)
        {
            this.value=value;
        }

        public static double convert(SmallestUNIT unit)
        {
            double variable= unit.value;
            System.out.println("a"+variable);
            return variable;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmallestUnit that = (SmallestUnit) o;
        return Double.compare(that.value, value) == 0 &&
                unit == that.unit &&
                smallestUNIT == that.smallestUNIT;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit, smallestUNIT);
    }
}
