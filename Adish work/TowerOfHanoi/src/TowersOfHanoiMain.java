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
		TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
		System.out.print("Enter number of discs: ");
		Scanner in = new Scanner(System.in);
		int discs = in.nextInt();
		towersOfHanoi.solve(discs, "A", "B", "C");
	}
}