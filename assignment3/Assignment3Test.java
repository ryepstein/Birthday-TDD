package assignment3;

import org.junit.Test;
import static org.junit.Assert.*;

public class Assignment3Test {

    /**
     * Test of dayOfWeek method, of class DayOfBirth.
     * Base date:
     */
    @Test
    public void TEST()
    {
        Boolean expResult = true;
        assert(expResult);
    }
    @Test
    public void testMONDAY()
    {
        String date = "11/23/2015";
        DayOfBirth instance = new DayOfBirth();
        String expResult = "MONDAY";
        String result = instance.dayOfWeek(date);
        assertEquals(expResult, result);
    }
    @Test
    public void testTUESDAY()
    {
        String date = "11/24/2015";
        DayOfBirth instance = new DayOfBirth();
        String expResult = "TUESDAY";
        String result = instance.dayOfWeek(date);
        assertEquals(expResult, result);
    }
    @Test
    public void testWEDNESDAY()
    {
        String date = "11/25/2015";
        DayOfBirth instance = new DayOfBirth();
        String expResult = "WEDNESDAY";
        String result = instance.dayOfWeek(date);
        assertEquals(expResult, result);
    }
    @Test
    public void testTHURSDAY()
    {
        String date = "11/26/2015";
        DayOfBirth instance = new DayOfBirth();
        String expResult = "THURSDAY";
        String result = instance.dayOfWeek(date);
        assertEquals(expResult, result);
    }
    @Test
    public void testFRIDAY()
    {
        String date = "11/27/2015";
        DayOfBirth instance = new DayOfBirth();
        String expResult = "FRIDAY";
        String result = instance.dayOfWeek(date);
        assertEquals(expResult, result);
    }
    @Test
    public void testSATURDAY()
    {
        String date = "11/28/2015";
        DayOfBirth instance = new DayOfBirth();
        String expResult = "SATURDAY";
        String result = instance.dayOfWeek(date);
        assertEquals(expResult, result);
    }
    @Test
    public void testSUNDAY()
    {
        String date = "11/29/2015";
        DayOfBirth instance = new DayOfBirth();
        String expResult = "SUNDAY";
        String result = instance.dayOfWeek(date);
        assertEquals(expResult, result);
    }
    @Test
    public void testCHRISTMAS()
    {
        String date = "12/25/2015";
        DayOfBirth instance = new DayOfBirth();
        String expResult = "FRIDAY";
        String result = instance.dayOfWeek(date);
        assertEquals(expResult, result);
    }
    @Test
    public void testNEWYEAR()
    {
        String date = "01/01/2016";
        DayOfBirth instance = new DayOfBirth();
        String expResult = "FRIDAY";
        String result = instance.dayOfWeek(date);
        assertEquals(expResult, result);
    }
    @Test
    public void testRyanBDAY() // Test my birthday
    {
        String date = "04/26/1991";
        DayOfBirth instance = new DayOfBirth();
        String expResult = "FRIDAY";
        String result = instance.dayOfWeek(date);
        assertEquals(expResult, result);
    }
}
