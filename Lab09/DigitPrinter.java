//DEREK CAMPBELL
//DLB832
/**
 * Write a description of class DigitPrinter here.
 *
 * @author (Derek Campbell)
 * @version (03/04/2020)
 */
public class DigitPrinter
{
    // instance variables
    private int v;

    /**
     * Constructor for objects of class DigitPrinter
     */
    public DigitPrinter(int _v)
    {
        // initialise instance variables
        v = _v;
    }

    /**
     * mutator method that sets a new value for v.
     * @param  v2  a new value set for v.
     */
    public void setValue(int v2)
    {
        v = v2;
    }

    /**
     * Accessor method that returns the value set for v.
     */
    public int getValue()
    {
        return v;
    }
    
    /**
     * Accessor method that calculates how many digits are in the
     * given number.Assuming the number is less than 10,000,000.
     */
    public void printDigits()
    {
        //1 10 100 1,000 10,000 100,000 1,000,000 10,000,000
        //up to 8 digits.
        if(Math.abs(v)>=10000000){
            System.out.println("V has 8 digits."); 
        }else if(Math.abs(v)>=1000000){
            System.out.println("V has 7 digits."); 
        }else if(Math.abs(v)>=100000){
            System.out.println("V has 6 digits.");
        }else if(Math.abs(v)>=10000){
            System.out.println("V has 5 digits.");
        }else if(Math.abs(v)>=1000){
            System.out.println("V has 4 digits.");
        }else if(Math.abs(v)>=100){
            System.out.println("V has 3 digits.");
        }else if(Math.abs(v)>=10){
            System.out.println("V has 2 digits.");
        }else{
            System.out.println("V has 1 digit.");
        }    
    }
}
