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
		System.out.println("Please input a number");		
//		PrimeChecker check; // checks if number is prime               might delete
		int N = in.nextInt();
		System.out.println("The number that you have entered is " + N);

		System.out.println( N + " % 2 = " + (N % 2) );
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
		
		// Dealing with the standard factors 1 and the number inputed itself
		
				factors.add(1);
				factors.add(number);
		int numberOfFactors = factors.size(); // assuming 1 and number itself is a factor
		
		
		for (int i = 2; i < number; i++)
		{
			// Assuming we 'DO NOT' count the first two factors
			// numberOfFactors = factors.size() - 2;
			
			// Assuming we DO count the first two factors
			numberOfFactors = factors.size();
			int tempStorage = number % i;
			if ( tempStorage == 0 )
			{
				isAFactor = true;
				factors.add(i);
				// deal with partner factor as well
			}
			
			
			isAFactor = false; // switch boolean checker off
		}
		System.out.println("There are " + numberOfFactors + " factors for the number ---> " + number);
		
		System.out.println("The factors of " + number + " are: " + factors.toString());
		if (numberOfFactors > 2)
		{
			System.out.println("This number is not prime");
			return true;
		}
		else
		{
			System.out.println("This number is prime");
			return false;
		}
	}
	
	
	
	
}