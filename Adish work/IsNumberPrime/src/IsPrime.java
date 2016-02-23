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
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a positive whole number");		
//		PrimeChecker check; // checks if number is prime               might delete
		int N = in.nextInt();
		
		System.out.println("You have entered: " + N);
		// boolean isPrime = false;
		CheckIfComposite(N);
//		check.CheckIfPrime(n); might delete
		in.close();
		System.out.println("End of program");
	}
	
	/**
	 * This method checks if the given number is a prime number
	 * @param number
	 * @return
	 */
	public static boolean CheckIfComposite(int number)
	{
		ArrayList<Integer> factors = new ArrayList<>();
		boolean isAFactor = false; // this is a check switch
		long start = System.currentTimeMillis();
		// Dealing with the standard factors 1 and the number inputed itself
		
				factors.add(1);
		int numberOfFactors = factors.size(); // assuming 1 and number itself is a factor
		
		
		for (int i = 2; i <= number; i++)
		{			
			// Assuming we DO count the first two factors
			numberOfFactors = factors.size();
			int tempStorage = number % i;
			if ( tempStorage == 0 )
			{
				isAFactor = true;
				factors.add(i);
			}
			
			
			isAFactor = false; // switch boolean checker off
		}
		System.out.println("There are " + numberOfFactors + " factors for ---> " + number);
		
		System.out.println("The factors of " + number + " are: " + factors.toString());
		if (numberOfFactors > 2)
		{
			System.out.println("This number is not prime");
			System.out.println(System.currentTimeMillis() - start + " ms");
			System.out.println("This number is prime");
			return true;
		}
		else
		{
			System.out.println("This number is prime");
			System.out.println(System.currentTimeMillis() - start + " ms");
			return false;
		}
	}
	
	
	
	
}