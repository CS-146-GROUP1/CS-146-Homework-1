import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class Chemistry_MainTest 
{
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
	}

	
	@Test
	public void FindingIsotopes1() 
	{
		System.out.println("Test 1");
		String sample_Isotope = "Uranium-238";
		int result = find_IsotopeNumber(sample_Isotope);
		System.out.println("Expected:  \t\t Acquired: " + result);
		assertEquals(238, result);
	}


	@Test
	public void FindingIsotopes2() 
	{
		System.out.println();
		System.out.println("Test 2");
		String sample_Isotope = "Carbon-12";
		int result = find_IsotopeNumber(sample_Isotope);
		System.out.println("Expected: 12 \t\t Acquired: " + result);
		assertEquals(12, result);
	}

	
	
	/*
	 * These are the methods that we are testing
	 */
	
	/**
	 * 
	 * @param element_Isotope
	 * @return
	 */
	private int find_IsotopeNumber(String element_Isotope) 
	{
		String truncated_Name = element_Isotope.substring(element_Isotope.indexOf('-') + 1);
		System.out.println("in method Result: " + truncated_Name);
		int result = Integer.parseInt(truncated_Name);
		return result;
	}

}