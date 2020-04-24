package web.BridageLabz.QuantityMesurment;

class Inch {
    private final double v;

    public Inch(double v) {
        this.v=v;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.v, v) == 0;
    }


}
