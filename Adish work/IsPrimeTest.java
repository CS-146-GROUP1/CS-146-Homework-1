import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class IsPrimeTest 
{
	@Test
	public void test1() 
	{
		System.out.println("Testing for 8-bit number");
		long N = 0x7FL;
		IsPrime.CheckIfComposite(N);
	}
	
	@Test
	public void test2()
	{
		System.out.println("\nTesting for 16-bit number");
		long N = 0x7FFFL;
		IsPrime.CheckIfComposite(N);
	}

	@Test
	public void test3()
	{
		System.out.println("\nTesting for 32-bit number");		
		long N = 0x7FFFFFFFL;
		IsPrime.CheckIfComposite(N);
	}

	@Test
	public void test4()
	{
		System.out.println("\nTesting for 64-bit number");
		long N = 0x7FFFFFFFFFFFFFFFL;
		IsPrime.CheckIfComposite(N);		
	}
	
	@Test
	public void test5()
	{
		System.out.println("\nTesting for 20-bit number");
		long N = 0xFFFFFL;
		IsPrime.CheckIfComposite(N);		
	}

	@Test
	public void test6()
	{
		System.out.println("\nTesting for 40-bit number");
		long N = 0xFFFFFFFFFFL;
		IsPrime.CheckIfComposite(N);		
	}


}
