import java.util.*;
/**
 * @author Adish Betawar
 */


/*
 * A prime number is a number which is not divisible by any number other than 1 and itself itself
 */

public class IsPrime
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
//		Scanner in = new Scanner(System.in);
//		System.out.println("Please input a positive whole number");		
//		int N = in.nextInt();
		
		Long N = 0x7FL; // Integer.MAX_VALUE;
		
//		System.out.println("You have entered: " + N);	 
		CheckIfComposite(N.longValue());
//		in.close();
		System.out.println("End of program");
	}
	
	/**
	 * This method checks if the given number is a prime number
	 * @param number
	 * @return
	 */
	public static boolean CheckIfComposite(long number)
	{
		ArrayList<Long> factors = new ArrayList<>();
		boolean isAFactor = false; // this is a check switch
		long start = System.currentTimeMillis();
		// Dealing with the standard factors 1 and the number inputed itself
		
		factors.add(1L);
		factors.add(number);
		int numberOfFactors = factors.size(); // assuming 1 and number itself is a factor
		

		long i = 2L;
		for (; i < number; i++)
		{			
			// Assuming we DO count the first two factors
			numberOfFactors = factors.size();
			long tempStorage = number % i;
			if ( tempStorage == 0 )
			{
				isAFactor = true;
				if (factors.contains(i))
					break;
				else
				{
					factors.add(i);
					if (factors.contains(number / i)) // dealing with the partner number to prevent duplicates
						continue;
					factors.add(number / i);					
				}
			}			
			isAFactor = false; // switch boolean checker off
		}
		System.out.println("There are " + numberOfFactors + " factors for ---> " + number + " looped for iteration = " + (i-1));
		
		
		System.out.println("The factors of " + number + " are: " + factors.toString());
		if (numberOfFactors > 2)
		{
			System.out.println("This number is not prime");
			System.out.println((System.currentTimeMillis() - start) + " ms");
			return true;
		}
		else
		{
			System.out.println("This number is prime");
			System.out.println(( System.currentTimeMillis() - start) + " ms");
			return false;
		}
	}	
	
}