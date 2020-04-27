package web.BridageLabz.QuantityMesurment;

public class Length {
    private static final double FEET_TO_INCH =12.0 ;
    private static final double FEET_TO_YARD = 3.0;
    private static final double INCH_TO_YARD = 36.0;

    private final Unit unit;
    private final double value;
    enum Unit{ FEET, YARD, INCH
     }

    public Length(Unit unit,double value)
    { this.unit=unit;
        this.value=value;
    }
public boolean compare(Length that)
{
if(this.unit.equals(Unit.FEET)&&that.unit.equals(Unit.FEET))
    return Double.compare(this.value,that.value)==0;
if(this.unit.equals(Unit.FEET)&&that.unit.equals(Unit.INCH))
return Double.compare(this.value*FEET_TO_INCH,that.value)==0;
    if(this.unit.equals(Unit.INCH)&&that.unit.equals(Unit.FEET))
        return Double.compare(this.value,that.value*FEET_TO_INCH)==0;
    if(this.unit.equals(Unit.FEET)&&that.unit.equals(Unit.YARD))
        return Double.compare(this.value,that.value*FEET_TO_YARD)==0;
    if(this.unit.equals(Unit.YARD)&&that.unit.equals(Unit.INCH))
        return Double.compare(this.value,that.value*INCH_TO_YARD)==0;
    return false;
}
public boolean compare(SmallestUnit.SmallestUNIT that)
{
     double a= SmallestUnit.SmallestUNIT.convert(that);
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
