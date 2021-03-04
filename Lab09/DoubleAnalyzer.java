//DEREK CAMPBELL
//DLB832
/**
 * Write a description of class DoubleAnalyzer here.
 *
 * @author (Derek Campbell)
 * @version (03/04/2020)
 */
public class DoubleAnalyzer
{
    // instance variables
    private double x;

    /**
     * Constructor for objects of class DoubleAnalyzer
     */
    public DoubleAnalyzer(double _x)
    {
        // initialise instance variables
        x = _x;
    }

    /**
     * Mutator method that sets a new value for x.
     * @param  y  a new value set for x.
     */
    public void setValue(double y)
    {
        x = y;
    }

    /**
     * Accessor method that returns the value set for x.
     */
    public double getValue()
    {
        return x;
    }
    
    /**
     * Analyzes the value set for x
     * @return 1 if the value for x is positive
     * @return 0 if the value for x is 0.
     * @return -1 if the value for x is negative.
     */
    public void analyzeDouble()
    {
        if(x>0){//if positive return 1.
            System.out.println("X is positive.");
        }else if(x==0){//if 0 return 0.
            System.out.println("X is zero.");
        }else{//anything else not positive or zero return -1.
            System.out.println("X is negative.");
        } 
        
         if(Math.abs(x)<1){
            System.out.println("small");
        }else if(Math.abs(x)>1000000){
            System.out.println("large");
        }
        
    }
}
