//DLB832
//DEREK CAMPBELL
import java.util.Scanner;//scanner for user input.
/**
 * A tester for the Fibonacci class.
 *
 * @author (Derek Campbell)
 * @version (4/25/2020)
 */
public class FibonacciTester
{
    public static void main(String[] args)
    {
      Fibonacci f1 = new Fibonacci();
      Scanner in = new Scanner(System.in);//imports a new scanner
      int _n;
      do 
       {
         System.out.println("Please input which number in the Fibonacci Sequence you would like to find.");
            while (!in.hasNextInt())
            {
                System.out.println("please enter a number");
                in.next();
            }
         _n = in.nextInt();//stores appropriate user input as _n
        }while (_n <= 0);
      //the above loop will not allow non valid entries and doesn't crash. 
      System.out.print("Fibonacci number " + _n); 
      System.out.print(" is " + f1.getFiboNumber(_n));
      System.out.println("");
      
      
      MaxMinFromArray mmfa = new MaxMinFromArray();
      System.out.println("The Max value from Array1D is: " +
      mmfa.getMaxFromArray1D());
      System.out.println("The Min value from Array1D is: " +
      mmfa.getMinFromArray1D());
      System.out.println("The Max value from Array2D is: " +
      mmfa.getMaxFromArray2D());
      System.out.println("The Min value from Array2D is: " +
      mmfa.getMinFromArray2D());
    }
}