package tdd;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest
{
    @Test
    public void testEmptyString()
    {
        assertEquals(0, Calculator.add(""));
          
    }

    @Test
	public void testOneNumber() 
	{
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() 
	{
		assertEquals(3, Calculator.add("1,2"));
	}
	@Test
    public void testMultipleNumbers()
    {
    	assertEquals(55, Calculator.add("1,2,3,4,5,6,7,8,9,10"));
    }

    @Test
    public void testNewLine()
    {
        assertEquals(30, Calculator.add("10\n20"));
    }

    @Test
    public void testNewLineAndComma()
    {
        assertEquals(6, Calculator.add("1\n2,3"));
    }

}
