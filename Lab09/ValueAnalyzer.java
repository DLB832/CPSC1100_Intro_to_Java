//DEREK CAMPBELL
//DLB832
/**
 * A class for analyzing an integer and practicing if statements.
 *
 * @author (Derek Campbell)
 * @version (03/04/2020)
 */
public class ValueAnalyzer
{
    // instance variables
    private int x;

    /**
     * Constructor for objects of class ValueAnalyzer
     */
    public ValueAnalyzer()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Sets a new value for x.
     * @param  y  a new value set for x.
     */
    public void setValue(int y)
    {
        x = y;
    }

    /**
     * Returns the value set for x.
     */
    public int getValue()
    {
        return x;
    }
    
    /**
     * Analyzes the value set for x
     * @return 1 if the value for x is positive
     * @return 0 if the value for x is 0.
     * @return -1 if the value for x is negative.
     */
    public int analyzeValue()
    {
        if(x>0){//if positive return 1.
            return 1;
        }else if(x==0){//if 0 return 0.
            return 0;
        }else{//anything else not positive or zero return -1.
            return -1;
        }    
    }
}
