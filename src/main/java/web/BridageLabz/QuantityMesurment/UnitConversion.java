package web.BridageLabz.QuantityMesurment;

public enum UnitConversion {

        MIL_LITERS(0.001), GALLONS(4.54609), LITERS(1.00), KILO_GRAMS(1.00),
        GRAMS(0.001), TONES(1000.0),
        CENTIMETER(0.393701), FEET(12), INCH(1), YARD(0.0277778);

        private double value;

        UnitConversion(double value) {
            this.value = value;
        }

        public static double convert(web.BridageLabz.QuantityMesurment.UnitConversion unit) {
            return unit.value;
        }
}
