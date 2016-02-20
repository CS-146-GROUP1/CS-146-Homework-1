/**
 * This is a test class for this problem
 * @author Adish Betawar
 *
 */
public class test 
{
	
	public static int bad1(int n)
	{
		if (n == 0)
		{
			return 0;
		}
		else
		{
			return 2 * bad1(n - 1); 
		}
	}
	
	public static int bad2(int n)
	{
		if (n == 0)
			return 0;
		else
			return ( bad2(n / 3 + 1) + n - 1 );
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("This is to test the bad recursive function. That bad method is called as bad1().\n");
		System.out.println("The second answer provided below is the answer to the second bad method. The method's name is bad2().\n");
		System.out.println("Answer: " + bad1(23));
		System.out.println("Answer: " + bad2(0));
	}

}