import java.util.Comparator;
import java.util.Stack;
import java.util.ArrayList;
/**
 * @author Adish
 *
 */
public class Periodic_Table
{
	// global required but still in thought
	int GROUP = 0;
	int PERIOD = 0;
	Element[][] periodic_Table; // case statement somewhere for group classification required
	
	
	//Specific GROUP or PERIOD names
	/**
	 * Will be either in arrays or arrayLists
	 * This is an option if we want to add things into the list
	 */
	ArrayList<Element> Alkali_metals;
	ArrayList<Element> Alkaline_metals;
	ArrayList<Element> Transition_metals;
	ArrayList<Element> Halogens;
	ArrayList<Element> Noble_gases;
	ArrayList<Element> Lanthanides;
	ArrayList<Element> Actinides;	
	
	private class Element extends Periodic_Table implements Comparator<Element> 
	{
		String name; // long form of the name of an element
		String chemical_Symbol; // chemical symbol of atomic element
		
		int atomic_Number; // number of protons in atom
		Stack<String> known_Isotopes;
		float atomic_Mass;
	
		// LinkedList like implementation
//		Element next_Element;
//		Element previous_Element;
		
		/**
		 * default constructor
		 */
		public Element()
		{
			name = "";
			
		}
			
		/** @return name            **/
		String get_Name()
		{
			return name;
		}
		
		/** @return chemical symbol **/
		String get_Chemical_Symbol()
		{
			return chemical_Symbol;
		}
		
		/** @return atomic number   **/		
		int get_Atomic_Number()
		{
			return atomic_Number;
		}
		
		
		/**
		 * Sorts the stack when we add in the isotopes
		 * @param s
		 */
		void sortStack(Stack<String> s)
		{
			if(!known_Isotopes.isEmpty())
			{
				String temp = s.pop();
				sortStack(s);
				sortedInsert(temp);
			}
		}

		/**
		 * Helper method for when we insert isotopes of an element into the Stack 
		 * @param element_Isotope: the element isotope that you are looking at
		 * @param isotope_Number: the number as extracted by the element name
		 */
		void sortedInsert(String element_Isotope)
		{
			int isotope_Number = find_IsotopeNumber(element_Isotope);
			if (known_Isotopes.isEmpty() || element_Isotope.compareTo(known_Isotopes.pop()) > 0)
			{
				known_Isotopes.push(element_Isotope);
			}
			else
			{
				String temp = known_Isotopes.pop();
				sortedInsert(element_Isotope);
				known_Isotopes.push(element_Isotope);
			}
		}		
		
		/**
		 * Finds the isotope of an element in the name of the isotope such as Carbon-12, or URANIUM-238
		 * @param element_Isotope
		 * @return the number of the isotope
		 */
		private int find_IsotopeNumber(String element_Isotope) 
		{
			String truncated_Name = element_Isotope.substring(element_Isotope.indexOf('-') + 1);
			System.out.println("in method Result: " + truncated_Name);
			int result = Integer.parseInt(truncated_Name);
			return result;
		}

		@Override
		public int compare(Element e1, Element e2)
		{
			if (e1.atomic_Number > e2.atomic_Number)
			{
				return 1;
			}
			else if (e1.atomic_Number < e2.atomic_Number)
			{
				return -1;
			}
			else
				return 0;
		}
	}
	
	// implement sort by atomic number
	// when you sort, you sort one group and group them into 
	
	/**
	 * The entire  periodic table will consist of all elements consolidated into their groups. This will make the concept easier.
	 * We should be able to access all elements via stack, hybridLinkedList. WHat will end up happening in the ultimate goal is that we should be able to  
	 */
	

	// OPTIONAL CODE \\
//	public Element get_Element_From_Group(int group_Number)
//	{
//		return null;
//	}
//	
//	public Element get_Element_From_Period(int period_Number)
//	{
//		return null;
//	}
//	
//	
//	
//	/**
//	 * Stores a new elements into the table
//	 * @return
//	 */
//	public Element Insert_New_Element()
//	{
//		return null;
//	}
	
}