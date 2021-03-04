//DEREK CAMPBELL
//DLB832
import java.util.Scanner; //imports a usable scanner for user input.
import java.util.ArrayList; //imports array ists for writing lists via input w/ Scanner.
import java.util.Collections; //imports collections for lists and sorting.
/**
 * Write a description of class InputAnalyzer here.
 * a, b, c, d;
 * @author (Derek Campbell)
 * @version (04/04/2020)
 */
public class InputAnalyzer
{
    // no instance variables.

    /**
     * Constructor for objects of class InputAnalyzer
     */
    public InputAnalyzer()
    {
        // no constructor variables to initialize.
    }

    /**
     * finds the smallest and larger numbers inputted into a list and returns those values.
     */
    public void findSmallLarge()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter numbers. Please press Q to end.");
        ArrayList<Integer> list = new ArrayList<Integer>();
        do
        {
            list.add(in.nextInt());
        }while(in.hasNextInt());
        Collections.sort(list);//sorts the ArrayList in ascending order.
        System.out.println("The smallest imported number is: " + list.get(0));
        //after being sorted, calls the value saved in the first slot.
        System.out.println("The largest imported number is: " + list.get(list.size()-1));
        //after being sorted, calls the value saved in the final slot.
    }
    
    /**
     * Returns a count of the number of even integers and odd integers inputted by the user.
     */
    public void countEvenOdd()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter numbers. Please press Q to end.");
        int evens = 0;
        int odds = 0;
        int cEO;
        do
        {
            cEO = in.nextInt();
           if(cEO % 2 == 1)
           {
               odds = odds + 1;
            }else{
                evens = evens +1;
           }
        }while(in.hasNextInt());
        System.out.println("The number of odd numbers entered was: " + odds);
        System.out.println("The number of even numbers entered was: " + evens);
    }
    
    /**
     * provides a cummulative sum of the integers inputted by the user.
     */
    public void cumulativeTotal()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter numbers. Please press Q to end.");
        int cT = in.nextInt();
        do 
        {
            cT = cT + in.nextInt();
            System.out.println("Your cumulative total is: " + cT);
        }
        while(in.hasNextInt());
        //System.out.println("Your cumulative total is: " + cT);
    }
    
    /**
     * Determines if the user inputs the same number twice in a row.
     */
    public void findAdjDuplicates()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter numbers. Please press Q to end.");
        int fAD = in.nextInt();
        
        while(in.hasNextInt())
        {
            int input = in.nextInt();
            if(input == fAD)
            {
                System.out.println("Duplicate number: " + input);
               
                while(in.hasNextInt())
                {
                    input = in.nextInt();
                    if(input != fAD);
                        break;
                }
            }
            fAD = input;
        }
    }
    
}
