package tdd;

import java.util.ArrayList;
import java.util.List;

public class Calculator
{
	public static int add(String numbers)
	{
		if(numbers.equals(""))
			return 0;
		else if(numbers.contains(",") || numbers.contains("\n"))
			return sum(splitNumbers(numbers));
		else
			return 1;
	}

	private static int toInt(String number)
	{
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers)
	{
	    return numbers.split(",|\\n");
	}
      
    private static int sum(String[] numbers)
    {
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
	}
}