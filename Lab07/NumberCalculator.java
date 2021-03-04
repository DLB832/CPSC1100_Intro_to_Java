//Derek Campbell
//DLB832
/**
 * Write a description of class NumberCalculator here.
 *
 * @author (Derek Campbell)
 * @version (02/19/2020)
 */
public class NumberCalculator
{
    // instance variables
    private int x;
    private int y;

    /**
     * Constructor for objects of class NumberCalculator
     */
    public NumberCalculator(int _x, int _y)
    {
        // initialise instance variables
        x = _x;
        y = _y;
        
    }

    /**
     * Returns the sum of the two values.
     */
    public int getSum()
    {
        return x + y;
    }
    
    /**
     * Returns the difference of the two values.
     */
    public int getDifference()
    {
        return x - y;
    }
    
    /**
     * Returns the product of the two values.
     */
    public int getProduct()
    {
        return x * y;
    }
    
    /**
     * Returns the average of the two values (converting to a double).
     */
    public double getAverage()
    {
        return (int) (x + y) / 2;
        /*the (int) is a "cast" telling the program that the line is an int
        but that we need to turn it into a double*/
    }
    
    /**
     * Returns the distance of two values (or the absolute value of the 
     * difference.)
     */
    public int getDistance()
    {
        return Math.abs(x - y);
        //declared in the math class.
    }
    
    /**
     * Returns the maximum of the two values.
     */
    public int getMaximum()
    {
        return Math.max(x,y);
        //declared in the math class.
    }
    
    /**
     * Returns the minimums of the two values.
     */
    public int getMinimum()
    {
        return Math.min(x,y);
        //declared in the math class.
    }
}
