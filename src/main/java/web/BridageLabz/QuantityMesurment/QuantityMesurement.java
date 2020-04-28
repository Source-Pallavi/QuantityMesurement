package web.BridageLabz.QuantityMesurment;

public class QuantityMesurement  {
    public  double value;
    public  UnitConversion unit;

    public QuantityMesurement(UnitConversion unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public QuantityMesurement(UnitConversion unit)
    {
        this.unit = unit;
    }

    public static double add(QuantityMesurement value1, QuantityMesurement value2)
    {
        return Mesurement.add(value1,value2);
    }

    public boolean compare(QuantityMesurement that) {
        double a =UnitConversion.convert(this.unit);
        double b = UnitConversion.convert(that.unit);
        return ((a * this.value) == (b * that.value)||Math.ceil(a * this.value) == Math.ceil(b * that.value)||
                Math.floor(a * this.value) == Math.floor(b * that.value)||Math.floor(a * this.value) == Math.ceil(b * that.value)||
                Math.ceil(a * this.value) == Math.floor(b * that.value));
    }
}
