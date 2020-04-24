package web.BridageLabz.QuantityMesurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMesurmentTest {
    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Feet feet = new Feet(0.0);
        Feet feet1= new Feet(0.0);
        Assert.assertEquals(feet,feet1);
    }
}
