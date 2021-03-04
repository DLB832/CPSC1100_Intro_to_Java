//DLB832
//DEREK CAMPBELL
/**
 * Write a description of class Fibonacci here.
 *
 * @author (Derek Campbell)
 * @version (04/25/2020)
 */
public class Fibonacci
{
    // instance variables
    private int n;//which Fibonacci number of the sequence user wants to find.

    /**
     * Constructor for objects of class Fibonacci
     */
    public Fibonacci()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  _n which number in the sequence the user wants returned.
     * @return    tthe nth number of the Fibonacci Sequence.
     */
    public long getFiboNumber(int _n)
    {
        long fold1 = 1;
        long fold2 = 1;
        long fnew = fold1 + fold2; 
        for(int i = 1; i < _n; i++)
        {
          fold1 = fold2;
          fold2 = fnew;
          fnew = fold1 + fold2;
        }
        return fold1;//? only returns correctly as fold1. Not 2 or new.
        //after initialization: fold1 = fold2 & fold2 = foldnew
        //fnew = fold1 + fold2
    }
}
