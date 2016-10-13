package tdd;

import java.util.List;
import java.util.ArrayList;

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
    	List<Integer> negativeNumbers = new ArrayList<>();
    	boolean hasNegative = false;
 	    int total = 0;

        for(String number : numbers){
        	if(toInt(number) < 0)
        	{
        		negativeNumbers.add(toInt(number));
        		hasNegative = true;
        	}
		    total += toInt(number);
		}
		
		if(!hasNegative)
			return total;
		else
			throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbers.toString());
	}
}