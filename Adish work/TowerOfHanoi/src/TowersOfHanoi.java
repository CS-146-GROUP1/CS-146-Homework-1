import java.util.Scanner;

public class TowersOfHanoi 
{
	public void solve(int n, String start, String auxiliary, String end) 
	{
		if (n == 1) 
		{
			// base case
			// Move the disc from start pole to end pole
			System.out.println(start + " -> " + end);
		} 
		else
		{
			// Step 1: Move (n-1) discs from start pole to auxiliary pole.
			solve(n - 1, start, end, auxiliary);
			System.out.println(start + " -> " + end);
			// Step 2: Move the last disc from start pole to end pole.
			// Step 3: Move the (n-1) discs from auxiliary pole to end pole.
			solve(n - 1, auxiliary, start, end);
			
			// Steps 1 and 3 are recursive steps
		}
	}

	public static void main(String[] args) 
	{
		TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
		System.out.print("Enter number of discs: ");
		Scanner in = new Scanner(System.in);
		int discs = in.nextInt();
		towersOfHanoi.solve(discs, "A", "B", "C");
	}
}