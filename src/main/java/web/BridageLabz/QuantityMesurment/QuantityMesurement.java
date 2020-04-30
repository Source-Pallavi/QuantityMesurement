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


    public static double add(QuantityMesurement value1, QuantityMesurement value2) {
        double variableA= UnitConversion.convert(value1.unit);
        double variableB= UnitConversion.convert(value2.unit);
        return ((variableA*value1.value)+(variableB*value2.value));
    }


    public boolean compare(QuantityMesurement that) {
        double variableA =UnitConversion.convert(this.unit);
        double variableB = UnitConversion.convert(that.unit);
        return ((variableA * this.value) == (variableB * that.value)||Math.ceil(variableA * this.value) == Math.ceil(variableB * that.value)||
                 Math.floor(variableA * this.value) == Math.floor(variableB * that.value)||Math.floor(variableA * this.value) == Math.ceil(variableB * that.value)||
                Math.ceil(variableA * this.value) == Math.floor(variableB * that.value));
    }
}
