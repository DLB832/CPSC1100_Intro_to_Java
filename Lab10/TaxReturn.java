//DEREK CAMPBELL
//DLB832
/**
 * Write a description of class TaxReturn here.
 *
 * @author (Derek Campbell)
 * @version (03/28/2020)
 */
public class TaxReturn
{
    // instance variables
    //Enumeration types have predetermined values they could be.
    public enum FilingStatus {
        SINGLE, MARRIED;
    }
    private double income;
    FilingStatus fs;
    
    /**
     * Constructor for objects of class TaxReturn
     */
    public TaxReturn(FilingStatus fs, double _income)
    {
        // initialise instance variables
        income = _income;
        this.fs = fs;
        
    }

    /**
     * An Accessor method which takes an individual or a couple's income and 
     * determines how much tax they owe.
     *
     * @return    the amount of tax owed.
     */
    public double getTax()
    {
        // put your code here
        if(fs == FilingStatus.SINGLE && income <= 8000){
               return income * .10;
            }else if(fs == FilingStatus.SINGLE && income > 8000 && income <= 32000){
                return 800 + 0.15*(income - 8000);
            }else if(fs == FilingStatus.SINGLE && income > 32000){
                return 4400 + 0.25*(income - 32000);
       }else if(fs == FilingStatus.MARRIED && income <= 16000){
                return income * .10;
            }else if(fs == FilingStatus.MARRIED && income > 16000 && income <= 64000){
                return 1600 + 0.15*(income - 16000);
            }else{
                return 8800 + 0.25*(income - 64000);
       }
    
   }
}
