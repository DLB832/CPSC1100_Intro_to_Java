//DEREK CAMPBELL
//DLB832
/**
 * Write a description of class LoopsComputer here.
 * a, b, c, d;
 *
 * @author (Derek)
 * @version (04/04/2020)
 */
public class LoopsComputer
{
    
    /**
     * Constructor for objects of class LoopsComputer
     */
    public LoopsComputer()
    {
        // initialise instance variables
        
    }

    /**
     * the sum of all even numbers between 2 and 100 (inclusive).
     */
    public void computeEvenSum()
    {
        //if n%2==0 then even
        int i;
        int evenSum = 0;
        for(i = 2; i <= 100; i++)
        {
            if(i % 2 == 0)
            {
                evenSum = evenSum + i;
            }
        }
        System.out.println("The sum of even numbers between 2 & 10 is: " + evenSum);
    }
    
    /**
     * the sum of all squares between 1 and 100 (inclusive).
     */
    public void computeSquareSum()
    {
        //method
        double n;
        double squareSum = 0;
        for(n = 1; n <= 100; n++)
        {
            squareSum = squareSum + Math.pow(n, 2); 
        }
        System.out.println("The sum of all squares between 1 & 100 is: " + squareSum);
    }
    
    /**
     * all powers from 2^0 to 2^20.
     */
    public void printPowers()
    {
        //method
        double p = 0;
        double powers;
        while(p <= 20)
        {
            powers = Math.pow(2,p);
            System.out.print("2^" + p);
            System.out.print(" = " + powers);
            System.out.println("");
            p++;
        }
    }
    
    /**
     * the sum of all odd numbers between a and b (inclusive).
     */
    public void oddSum(int _a, int _b)
    {
        //if n%2==1 then odd
        int a;
        int oddSum = 0;
        for(a = _a; a <= _b; a++)
        {
            if(a % 2 == 1)
            {
                oddSum = oddSum + a;
            }
        }
        System.out.println("The sum of odd numbers between a & b is: " + oddSum);
        
    }
}
