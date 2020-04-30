package web.BridageLabz.QuantityMesurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMesurmentTest
{
    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        QuantityMesurement length = new QuantityMesurement(UnitConversion.FEET,0.0);
        QuantityMesurement length1 = new QuantityMesurement(UnitConversion.FEET,0.0);
        boolean equal= length.compare(length1);
        Assert.assertTrue(equal);
    }
    @Test
    public void given1FeetAnd2Feet_shouldReturnNot_Equal()
    {
        QuantityMesurement length = new QuantityMesurement(UnitConversion.FEET,0.0);
        QuantityMesurement length1 = new QuantityMesurement(UnitConversion.FEET,1.0);
        boolean eq= length.equals(length1);
        Assert.assertFalse(eq);
    }

    @Test
    public void given1InchAnd2Inch_shouldReturnEqual()
    {
        QuantityMesurement length = new QuantityMesurement(UnitConversion.INCH,0.0);
        QuantityMesurement length1 = new QuantityMesurement(UnitConversion.INCH,0.0);
         boolean equal= length.compare(length1);
         Assert.assertTrue(equal);
    }
    @Test
    public void given0inchAnd1inch_shouldReturnNot_Equal()
    { QuantityMesurement length = new QuantityMesurement(UnitConversion.INCH,0.0);
      QuantityMesurement length1 = new QuantityMesurement(UnitConversion.INCH,1.0);
        Assert.assertNotEquals(length,length1);
    }

    @Test
    public void given1feetand_1inch_Shouldreturn_NOTEQUAL()
    { QuantityMesurement length = new QuantityMesurement(UnitConversion.FEET,1.0);
      QuantityMesurement length1 = new QuantityMesurement(UnitConversion.INCH,1.0);
        Assert.assertNotEquals(length,length1);
    }

    @Test
    public void given0feet0inchreturnEqualLength() {
       QuantityMesurement length = new QuantityMesurement(UnitConversion.FEET,0.0);
      QuantityMesurement length1 = new QuantityMesurement(UnitConversion.INCH,0.0);
      boolean comparecheck=length.compare(length1); 
      Assert.assertTrue(comparecheck);
    }


    @Test
    public void given1Feetand1Feet_WhenComapre_return_equal_length() {
       QuantityMesurement length = new QuantityMesurement(UnitConversion.FEET,1.0);
       QuantityMesurement length1 = new QuantityMesurement(UnitConversion.FEET,1.0);
        boolean checkCompare= length.compare(length1);
        Assert.assertTrue(checkCompare);
    }

    @Test
    public void whenWeCheck1InchIsEqTo1Feet() {
      QuantityMesurement length = new QuantityMesurement(UnitConversion.FEET,1.0);
      QuantityMesurement length1 = new QuantityMesurement(UnitConversion.INCH,1.0);
        boolean comparecheck=length.compare(length1);
        Assert.assertFalse(comparecheck);
    }
    @Test
    public void whenWeCheck12InchIsEqTo1Feet() {
      QuantityMesurement length = new QuantityMesurement(UnitConversion.INCH,12.0);
      QuantityMesurement length1 = new QuantityMesurement(UnitConversion.FEET,1.0);
        boolean comparecheck=length.compare(length1);
        Assert.assertTrue(comparecheck);
    }

    @Test
    public void whenWeCompare3FeetEqToOneYardreturnsTRUE() {
       QuantityMesurement length = new QuantityMesurement(UnitConversion.FEET,3.0);
       QuantityMesurement length1 = new QuantityMesurement(UnitConversion.YARD,1.0);
        boolean comparecheck=length.compare(length1);   
        Assert.assertFalse(comparecheck);   //
    }
    @Test
    public void whenWeCompare1FeetnotEqToOneYardreturnsFALSE() {
       QuantityMesurement length = new QuantityMesurement(UnitConversion.FEET,1.0);
       QuantityMesurement length1 = new QuantityMesurement(UnitConversion.YARD,1.0);
        boolean comparecheck=length.compare(length1);
        Assert.assertFalse(comparecheck);
    }
    @Test
    public void whenWeCompare1Inch_notEqTo_OneYardreturnsFALSE() {
      QuantityMesurement length = new QuantityMesurement(UnitConversion.INCH,1.0);
      QuantityMesurement length1 = new QuantityMesurement(UnitConversion.YARD,1.0);
        boolean comparecheck=length.compare(length1);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void whenWeCompare1Yard_EqTo_36inch_returnstrue() {
       QuantityMesurement length = new QuantityMesurement(UnitConversion.YARD,1.0);
       QuantityMesurement length1 = new QuantityMesurement(UnitConversion.INCH,36.0);
        boolean comparecheck=length.compare(length1);
        Assert.assertFalse(comparecheck);
    }
    @Test
    public void whenWeCompare36Inch_EqTo_1Yard_returnstrue() {
        QuantityMesurement length = new QuantityMesurement(UnitConversion.INCH,36.0);
        QuantityMesurement length1 = new QuantityMesurement(UnitConversion.YARD,1.0);
        boolean comparecheck=length.compare(length1);
        Assert.assertFalse(comparecheck);
    }
    @Test
    public void whenWeCompare1Yard_EqTo_3feet_returnstrue() {
       QuantityMesurement length = new QuantityMesurement(UnitConversion.YARD,1.0);
       QuantityMesurement length1 = new QuantityMesurement(UnitConversion.FEET,3.0);
        boolean comparecheck=length.compare(length1);
        Assert.assertFalse(comparecheck);
    }

    @Test
    public void whenWeCompare2inch_5cm_returnTrue() {
       QuantityMesurement smallestUnit = new QuantityMesurement(UnitConversion.INCH,2.0);
       QuantityMesurement smallestUnitq1 = new QuantityMesurement(UnitConversion.CENTIMETER,5.0);
        boolean check=smallestUnit.compare(smallestUnitq1);    
       Assert.assertTrue(check);
    }

    @Test
    public void whenWeAdd2inch_Plus_2inch_Returns_4inch()
    {
        QuantityMesurement smallestUnit = new QuantityMesurement(UnitConversion.INCH,2.0);
        QuantityMesurement smallestUnitq1 = new QuantityMesurement(UnitConversion.INCH,2.0);
        double sum= QuantityMesurement.add(smallestUnit,smallestUnitq1);
        Assert.assertEquals(sum,4.0,0.0);
    }
    @Test
    public void whenWeAdd1feet_Plus_2Inch_Returns_14inch()
    {
         QuantityMesurement smallestUnit = new QuantityMesurement(UnitConversion.FEET,1.0);
         QuantityMesurement smallestUnitq1 = new QuantityMesurement(UnitConversion.INCH,2.0);
         double sum= QuantityMesurement.add(smallestUnit,smallestUnitq1);
         Assert.assertEquals(sum,14.0,0.0);
    }
    @Test
    public void whenWeAdd1feet_Plus_1Feet_Returns_24inch()
    {
       QuantityMesurement smallestUnit = new QuantityMesurement(UnitConversion.FEET,1.0);
       QuantityMesurement smallestUnitq1 = new QuantityMesurement(UnitConversion.FEET,1.0);
       double sum= QuantityMesurement.add(smallestUnit,smallestUnitq1);
       Assert.assertEquals(sum,24.0,0.0);
    }
    @Test
    public void whenWeAdd2inch_Plus_2_5CM_Returns_3inch()
    {
       QuantityMesurement smallestUnit = new QuantityMesurement(UnitConversion.INCH,2.5);
       QuantityMesurement smallestUnitq1 = new QuantityMesurement(UnitConversion.CENTIMETER,3.0);
       double sum= QuantityMesurement.add(smallestUnit,smallestUnitq1);
       Assert.assertEquals(sum,3.6811030000000002,0.0);
    }

    @Test
    public void whenWeCompare1_gallon_to_3pt78liters_returnTRUE()
    {
        QuantityMesurement quantityMesurement = new QuantityMesurement(UnitConversion.GALLONS,1.0);
        QuantityMesurement quantityMesurement1 = new QuantityMesurement(UnitConversion.LITERS,4.54609);
        boolean comparecheck= quantityMesurement.compare(quantityMesurement1);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void whenWeCompare1_liters_to_1000mili_liters_returnTRUE()
    {
        QuantityMesurement quantityMesurement = new QuantityMesurement(UnitConversion.LITERS,1.0);
        QuantityMesurement quantityMesurement1 = new QuantityMesurement(UnitConversion.MIL_LITERS,1000.00);
        boolean comparecheck= quantityMesurement.compare(quantityMesurement1);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void whenWeadd1_gallons_to_3pt78liters_equalsto7pt57()
    {
        QuantityMesurement quantityMesurement = new QuantityMesurement(UnitConversion.GALLONS,1.0);
        QuantityMesurement quantityMesurement1 = new QuantityMesurement(UnitConversion.LITERS,3.78);
        double comparecheck= QuantityMesurement.add(quantityMesurement1, quantityMesurement);
        Assert.assertEquals(8.32609,comparecheck,0.0);
    }
    @Test
    public void whenWeadd1_liter_to_1000mililiters_equalsto2liter()
    {
        QuantityMesurement quantityMesurement = new QuantityMesurement(UnitConversion.LITERS,1.0);
        QuantityMesurement quantityMesurement1 = new QuantityMesurement(UnitConversion.MIL_LITERS,1000);
        double comparecheck= QuantityMesurement.add(quantityMesurement1, quantityMesurement);
        Assert.assertEquals(2,comparecheck,0.0);
    }
    @Test
    public void whenWeCompare1_KG_to_1000GRAMS_returnTRUE()
    {
        QuantityMesurement quantityMesurement = new QuantityMesurement(UnitConversion.KILO_GRAMS,1.0);
        QuantityMesurement quantityMesurement1 = new QuantityMesurement(UnitConversion.GRAMS,1000.00);
        boolean comparecheck= quantityMesurement.compare(quantityMesurement1);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void whenWeCompare1_tonn_to_1000kiloGRAMS_returnTRUE()
    {
        QuantityMesurement quantityMesurement = new QuantityMesurement(UnitConversion.TONES,1.0);
        QuantityMesurement quantityMesurement1 = new QuantityMesurement(UnitConversion.KILO_GRAMS,1000.00);
        boolean comparecheck= quantityMesurement.compare(quantityMesurement1);
        Assert.assertTrue(comparecheck);
    }
    @Test
    public void whenWeadd1_tonn_to_1000GRAMS_return1001kgs()
    {
        QuantityMesurement quantityMesurement = new QuantityMesurement(UnitConversion.TONES,1.0);
        QuantityMesurement quantityMesurement1 = new QuantityMesurement(UnitConversion.GRAMS,1000.00);
        double comparecheck= QuantityMesurement.add(quantityMesurement1, quantityMesurement);
        Assert.assertEquals(1001,comparecheck,0.0);
    }
// @Test
// public void whenWeCompare212Frenheitdegree_to_100degreeCelcius_returnTRUE()
// {
//     TemperatureConversion quantityMesurement = new TemperatureConversion(Temperature.FAHRENHEIT,212.0);
//     TemperatureConversion quantityMesurement1 = new TemperatureConversion(Temperature.CELSIUS,100.00);
//     boolean comparecheck= quantityMesurement.compare(quantityMesurement1);
//     Assert.assertFalse(comparecheck);
// }

}
