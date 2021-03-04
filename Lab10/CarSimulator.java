
/**
 * Write a description of class CarSimulator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarSimulator
{
    // instance variables
    private boolean leftOpen = false;
    private boolean rightOpen = false;
    //enumerator for Gearshift
    public enum GearShift{
        P, R, N, D, ONE, TWO, THREE;
    }
    
    
    /**
     * Constructor for objects of class CarSimulator
     */
    public CarSimulator()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String checkDoors(int leftDashSwitch, int rightDashSwitch, 
        int childLock, int masterUnlock, int leftInside, int rightInside,
        int leftOutside, int rightOutside, GearShift gear)
    {
        // should reutn 1 of 4 strings: 
        /* both doors closed
         * left door open
         * right door open
         * both doors open
         */
        
        if((leftDashSwitch == 1 || leftOutside == 1 || (leftInside == 1 && childLock == 0))
            && masterUnlock == 1 && gear == GearShift.P){
                leftOpen = true;
            }
        if((rightDashSwitch == 1 || rightOutside == 1 || (rightInside == 1 && childLock == 0))
            && masterUnlock == 1 && gear == GearShift.P){
                rightOpen = true;
            }
            
        if(leftOpen == true && rightOpen == true){
            return "Both doors open.";
        }else if(leftOpen == true && rightOpen == false){
            return "Left door open.";
        }else if(leftOpen == false && rightOpen == true){
            return "Right door open.";
        }else{
            return "Both doors closed.";
        }
    }
}
