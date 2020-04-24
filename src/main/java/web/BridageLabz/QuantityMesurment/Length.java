package web.BridageLabz.QuantityMesurment;

import java.util.Objects;

public class Length {
    private final Unit unit;
    private final double value;

    enum Unit{ FEET,INCH};

    public Length(Unit unit,double value)
    { this.unit=unit;
        this.value=value;
    }
//    @Override
//    public boolean equals(Object that) {
//        if (this == that) return true;
//        if (that == null || getClass() != that.getClass()) return false;
//        Length length = (Length) that;
//        if(this.unit.equals(((Length) that).unit) ) return true;
//        return Double.compare(length.value, value) == 0;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
