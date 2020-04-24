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
    @Test
    public void given1FeetAnd2Feet_shouldReturnNot_Equal()
    {
        Feet feet = new Feet(0.0);
        Feet feet1= new Feet(1.0);
        boolean eq=feet.equals(feet1);
        Assert.assertFalse(eq);
    }
    @Test
    public void given1FeetAnd2Feeyt_shouldReturnEqual()
    {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
Assert.assertEquals(inch1,inch2);


    }
    @Test
    public void given0inchAnd1inch_shouldReturnNot_Equal()
    {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertNotEquals(inch1,inch2);
    }
    

}
