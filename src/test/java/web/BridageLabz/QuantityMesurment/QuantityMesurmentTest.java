package web.BridageLabz.QuantityMesurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMesurmentTest {
    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Length length = new Length(Length.Unit.FEET,0.0);
        Length length1 = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(length, length1);
    }
    @Test
    public void given1FeetAnd2Feet_shouldReturnNot_Equal()
    {
        Length length = new Length(Length.Unit.FEET,0.0);
        Length length1 = new Length(Length.Unit.FEET,1.0);
        boolean eq= length.equals(length1);
        Assert.assertFalse(eq);
    }
    @Test
    public void given1InchAnd2Inch_shouldReturnEqual()
    {
        Length length = new Length(Length.Unit.INCH,0.0);
        Length length1 = new Length(Length.Unit.INCH,0.0);
Assert.assertEquals(length,length1);
    }
    @Test
    public void given0inchAnd1inch_shouldReturnNot_Equal()
    {Length length = new Length(Length.Unit.INCH,0.0);
        Length length1 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(length,length1);
    }

    @Test
    public void given1feetand_1inch_Shouldreturn_NOTEQUAL()
    {Length length = new Length(Length.Unit.INCH,1.0);
        Length length1 = new Length(Length.Unit.FEET,1.0);
        Assert.assertNotEquals(length,length1);
    }

    @Test
    public void given0feet0inchreturnEqualLength() {
        Length length = new Length(Length.Unit.INCH,1.0);
        Length length1 = new Length(Length.Unit.FEET,1.0);
      boolean comparecheck=length.compare(length1);
      Assert.assertFalse(comparecheck);
    }


    @Test
    public void given1Feetand1Feet_WhenComapre_return_equal_length() {
        Length length = new Length(Length.Unit.FEET,1.0);
        Length length1 = new Length(Length.Unit.FEET,1.0);
        boolean checkCompare= length.compare(length1);
        Assert.assertTrue(checkCompare);
    }
}
