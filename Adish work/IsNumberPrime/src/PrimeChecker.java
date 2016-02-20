
/*
 * This class checks if the given input is a prime number
 */

public class PrimeChecker 
{
	/*
	 * A prime number is a number which is not divisible by any number other than 1 and itself itself
	 */
	
//	public PrimeChecker()
//	{
////		int numberOfMatches;
//	}
	
	
	/**
	 * This method checks if the given number is a prime number
	 * @param number
	 * @return
	 */
	boolean CheckIfComposite(int number)
	{
		boolean isAFactor = false;
		int numberOfFactors = 1; // assuming 1 and number itself is a factor
		for (int i = 1; i < 10; i++)
		{
			if ( (number % i != 0) )
			{
				isAFactor = true;
				numberOfFactors++;
			}
			isAFactor = false; // switch boolean checker off
		}
		if (numberOfFactors > 1)
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