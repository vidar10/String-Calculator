package tdd;

import java.util.List;
import java.util.ArrayList;

public class Calculator
{
	public static int add(String numbers)
	{
		String delimiter = "true";
		boolean hasDelimiter = false;
		if(numbers.startsWith("//"))
		{
			delimiter = numbers.split("\n")[0];
			String[] arr = delimiter.split("");
			String[] numbersArr = numbers.split("\\n");

			for(int i = 0; i < arr.length; i++)
				delimiter = arr[i];

			numbers = numbersArr[1];
			hasDelimiter = true;
		}

		if(numbers.equals(""))
			return 0;
		else if(numbers.contains(",") || numbers.contains("\n") || hasDelimiter)
			return sum(splitNumbers(numbers, delimiter));
		else
			return 1;
	}

	private static int toInt(String number)
	{
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers, String delimiter)
	{
		if(delimiter == "true")
			return numbers.split("(,|\\n)");
		else
		    return numbers.split(delimiter);			

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
        	if(toInt(number) <= 1000)
		    	total += toInt(number);
		}
		
		if(!hasNegative)
			return total;
		else
			throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbers.toString());
	}
}