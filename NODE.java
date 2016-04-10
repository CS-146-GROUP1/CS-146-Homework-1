import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

/* Class AVLNode */

public class NODE
{
  NODE left, right;
  int data;
  int height;

  /* Constructor */
  public NODE()
  {
    left = null;
    right = null;
    data = 0;
    height = 0;
  }

  /* Constructor */
  public NODE(int n)
  {
    left = null;
    right = null;
    data = n;
    height = 0;
  }

}
