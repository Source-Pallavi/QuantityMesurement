package web.BridageLabz.QuantityMesurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMesurmentTest
{
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

    @Test
    public void whenWeCheck1InchIsEqTo1Feet() {
        Length length = new Length(Length.Unit.FEET,1.0);
        Length length1 = new Length(Length.Unit.INCH,12.0);
        boolean comparecheck=length.compare(length1);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void whenWeCheck12InchIsEqTo1Feet() {
        Length length = new Length(Length.Unit.INCH,12.0);
        Length length1 = new Length(Length.Unit.FEET,1.0);
        boolean comparecheck=length.compare(length1);
        Assert.assertTrue(comparecheck);
    }

    @Test
    public void whenWeCompare3FeetEqToOneYardreturnsTRUE() {
        Length length = new Length(Length.Unit.FEET,3.0);
        Length length1 = new Length(Length.Unit.YARD,1.0);
        boolean comparecheck=length.compare(length1);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void whenWeCompare1FeetnotEqToOneYardreturnsFALSE() {
        Length length = new Length(Length.Unit.FEET,1.0);
        Length length1 = new Length(Length.Unit.YARD,1.0);
        boolean comparecheck=length.compare(length1);
        Assert.assertFalse(comparecheck);
    }
    @Test
    public void whenWeCompare1Inch_notEqTo_OneYardreturnsFALSE() {
        Length length = new Length(Length.Unit.INCH,1.0);
        Length length1 = new Length(Length.Unit.YARD,1.0);
        boolean comparecheck=length.compare(length1);
        Assert.assertFalse(comparecheck);
    }
    @Test
    public void whenWeCompare1Yard_EqTo_36inch_returnstrue() {
        Length length = new Length(Length.Unit.YARD,1.0);
        Length length1 = new Length(Length.Unit.INCH,36.0);
        boolean comparecheck=length.compare(length1);
        Assert.assertFalse(comparecheck);
    }
    @Test
    public void whenWeCompare36Inch_EqTo_1Yard_returnstrue() {
        Length length = new Length(Length.Unit.INCH,36.0);
        Length length1 = new Length(Length.Unit.YARD,1.0);
        boolean comparecheck=length.compare(length1);
        Assert.assertFalse(comparecheck);
    }
    @Test
    public void whenWeCompare1Yard_EqTo_3feet_returnstrue() {
        Length length = new Length(Length.Unit.YARD,1.0);
        Length length1 = new Length(Length.Unit.FEET,3.0);
        boolean comparecheck=length.compare(length1);
        Assert.assertFalse(comparecheck);
    }

    @Test
    public void whenWeCompare2inch_5cm_returnTrue() {
        SmallestUnit smallestUnit = new SmallestUnit(SmallestUnit.SmallestUNIT.INCH,2.0);
        SmallestUnit smallestUnitq1 = new SmallestUnit(SmallestUnit.SmallestUNIT.CENTIMETER,3.0);
        boolean comparecheck= smallestUnit.compare(smallestUnitq1);
        Assert.assertTrue(comparecheck);
    }

    @Test
    public void whenWeAdd2inch_Plus_2inch_Returns_4inch()
    {
        SmallestUnit smallestUnit = new SmallestUnit(SmallestUnit.SmallestUNIT.INCH,2.0);
        SmallestUnit smallestUnitq1 = new SmallestUnit(SmallestUnit.SmallestUNIT.INCH,2.0);
        double sum= SmallestUnit.add(smallestUnit,smallestUnitq1);
        Assert.assertEquals(sum,4.0,0.0);
    }
    @Test
    public void whenWeAdd1feet_Plus_2Inch_Returns_14inch()
    {
        SmallestUnit smallestUnit = new SmallestUnit(SmallestUnit.SmallestUNIT.FEET,1.0);
        SmallestUnit smallestUnitq1 = new SmallestUnit(SmallestUnit.SmallestUNIT.INCH,2.0);
        double sum= SmallestUnit.add(smallestUnit,smallestUnitq1);
        Assert.assertEquals(sum,14.0,0.0);
    }
    @Test
    public void whenWeAdd1feet_Plus_1Feet_Returns_24inch()
    {
        SmallestUnit smallestUnit = new SmallestUnit(SmallestUnit.SmallestUNIT.FEET,1.0);
        SmallestUnit smallestUnitq1 = new SmallestUnit(SmallestUnit.SmallestUNIT.FEET,1.0);
        double sum= SmallestUnit.add(smallestUnit,smallestUnitq1);
        Assert.assertEquals(sum,24.0,0.0);
    }
    @Test
    public void whenWeAdd2inch_Plus_2_5CM_Returns_3inch()
    {
        SmallestUnit smallestUnit = new SmallestUnit(SmallestUnit.SmallestUNIT.INCH,2.0);
        SmallestUnit smallestUnitq1 = new SmallestUnit(SmallestUnit.SmallestUNIT.CENTIMETER,2.54);
        double sum= SmallestUnit.add(smallestUnit,smallestUnitq1);
        Assert.assertEquals(sum,3.0,0.0);
    }

    @Test
    public void whenWeCompare1_gallon_to_3pt78liters_returnTRUE()
    {
        ComparingVolumes comparingVolumes = new ComparingVolumes(ComparingVolumes.VolumeSmallestUNIT.GALLONS,1.0);
        ComparingVolumes comparingVolumes1  = new ComparingVolumes(ComparingVolumes.VolumeSmallestUNIT.LITERS,4.54609);
        boolean comparecheck= comparingVolumes.compare(comparingVolumes1);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void whenWeCompare1_liters_to_1000mili_liters_returnTRUE()
    {
        ComparingVolumes comparingVolumes = new ComparingVolumes(ComparingVolumes.VolumeSmallestUNIT.LITERS,1.0);
        ComparingVolumes comparingVolumes1  = new ComparingVolumes(ComparingVolumes.VolumeSmallestUNIT.MILI_LITERS,1000.00);
        boolean comparecheck= comparingVolumes.compare(comparingVolumes1);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void whenWeadd1_gallons_to_3pt78liters_equalsto7pt57()
    {
        ComparingVolumes comparingVolumes = new ComparingVolumes(ComparingVolumes.VolumeSmallestUNIT.GALLONS,1.0);
        ComparingVolumes comparingVolumes1  = new ComparingVolumes(ComparingVolumes.VolumeSmallestUNIT.LITERS,3.78);
        double comparecheck= ComparingVolumes.add(comparingVolumes1,comparingVolumes);
        Assert.assertEquals(8.32609,comparecheck,0.0);
    }
    @Test
    public void whenWeadd1_liter_to_1000mililiters_equalsto2liter()
    {
        ComparingVolumes comparingVolumes = new ComparingVolumes(ComparingVolumes.VolumeSmallestUNIT.LITERS,1.0);
        ComparingVolumes comparingVolumes1  = new ComparingVolumes(ComparingVolumes.VolumeSmallestUNIT.MILI_LITERS,1000);
        double comparecheck= ComparingVolumes.add(comparingVolumes1,comparingVolumes);
        Assert.assertEquals(2,comparecheck,0.0);
    }


    

}
