import java.util.Scanner;

/**
 * Main program testing for this part of assignment
 * @author Adish Betawar
 *
 */
public class TowersOfHanoiMain
{

	public static void main(String[] args) 
	{
		long start = System.currentTimeMillis();
		TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
		System.out.print("Enter number of discs: ");
		Scanner in = new Scanner(System.in);
		int discs = in.nextInt();
		towersOfHanoi.solve(discs, "A", "B", "C");
		System.out.println("Time taken: " + ( (System.currentTimeMillis() - start) / 1000) + " s"); // time tracker
	}
}