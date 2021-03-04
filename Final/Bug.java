
/**
 * Write a description of class Bug here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bug
{
    // instance variables - replace the example below with your own
    private int currentPosition;
    private boolean direction = true; //true = right. false = left.
    

    /**
     * Constructor for objects of class Bug
     */
    public Bug(int _currentPosition, boolean _direction)
    {
        // initialise instance variables
        currentPosition = _currentPosition;
        direction = _direction;
    }

    public void turn()
    {
        if (direction = true){
            direction = false;
            System.out.println("Bugsy is now facing left.");
        }
        if (direction = false){
            direction = true;
            System.out.println("Bugsy is now facing right.");
        }
        
    }
    
    public void move()
    {
        if (direction = true){
            currentPosition++;
        }
        if (direction = false){
            currentPosition--;
        }
    }
    
    public void getPosition()
    {
        System.out.println("Bugsy is at " + currentPosition);
    }
    
}
