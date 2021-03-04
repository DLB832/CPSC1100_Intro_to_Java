//DEREK CAMPBELL
//DLB832
import java.util.Scanner;
/**
 * Write a description of class AutomaticTeller here.
 *
 * @
 */
public class AutomaticTeller
{
    // instance variables
    private int pin;
    int attempts = 1;
    boolean correct = false;
    
    /**
     * Constructor for objects of class AutomaticTeller
     */
    public AutomaticTeller(int _pin)
    {
        // initialise instance variables
        pin = _pin;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void validateUser()
    {
        // put your code here
        System.out.println("Please input your PIN.");
        
        do{ 
            Scanner in = new Scanner(System.in);
            int input = in.nextInt();
            if(input == pin){
                System.out.println("Your PIN is correct.");
                correct = true;
                break;
            }else if(attempts ==3){
                System.out.println("Your bank card is blocked.");
            }else{
                System.out.println("Your PIN is incorrect.");
                attempts++;
                validateUser();
            }
        
            }while(correct == false && attempts < 3);
    
  }
}
