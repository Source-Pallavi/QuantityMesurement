package web.BridageLabz.QuantityMesurment;

public class Length {
    private static final double FEET_TO_INCH =12.0 ;
    private final Unit unit;
    private final double value;
    enum Unit{ FEET,INCH}

    public Length(Unit unit,double value)
    { this.unit=unit;
        this.value=value;
    }
//    @Override
//        if (this == that) return true;
//        if (that == null || getClass() != that.getClass()) return false;
//        Length length = (Length) that;
//        if(this.unit.equals(((Length) that).unit) ) return true;
//        return Double.compare(length.value, value) == 0;
//    }
public boolean compare(Length that)
{
if(this.unit.equals(Unit.FEET)&&that.unit.equals(Unit.FEET))
    return Double.compare(this.value,that.value)==0;
if(this.unit.equals(Unit.FEET)&&that.unit.equals(Unit.INCH))
return Double.compare(this.value*FEET_TO_INCH,that.value)==0;
    return false;
}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }


}
