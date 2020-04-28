package web.BridageLabz.QuantityMesurment;

import java.util.Objects;

public class Mesurement extends QuantityMesurement
{
    private  UnitConversion unit;
    private  double value;

    public Mesurement(UnitConversion unit, double value)
    { super(unit, value);
        this.unit=unit;
        this.value=value;

    }

    public Mesurement(UnitConversion unit) {
        super(unit);
        this.unit=unit;
    }


    public static double add(QuantityMesurement value1, QuantityMesurement value2) {
        double a = UnitConversion.convert(value1.unit);
        double b = UnitConversion.convert(value2.unit);
        return ((a * value1.value) + (b * value2.value));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mesurement that = (Mesurement) o;
        return Double.compare(that.value, value) == 0 &&
                unit == that.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, value);
    }
}



