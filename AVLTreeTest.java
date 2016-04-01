import java.util.Random;
import java.util.Scanner;

/* Class AVL Tree Test */

public class AVLTreeTest

{

public static void main(String[] args)

{

Scanner scan = new Scanner(System.in);

/* Creating object of AVLTree */

AVLTree avlt = new AVLTree();

System.out.println("AVLTree\n");

char ch;

int []integers=new int[35];

int nos=0;

boolean flag=false;

Random rand = new Random();

for(int i=0;i<35;i++)

{

int num = rand.nextInt(89) + 10;

for(int j=0;j<=nos;j++)

{

if(integers[j]==num)

flag=true;

}

if(flag!=true)

{

avlt.insert(num);

System.out.print("\nTree - after inserting "+num+":");

System.out.println();

/* Display tree in In-order */

avlt.inorder();

nos++;

}

}

}

}