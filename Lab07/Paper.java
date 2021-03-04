
//Derek Campbell
//DLB832
/**
 * Write a description of class Paper here.
 *
 * @author (Derek Campbell)
 * @version (02/19/2020)
 */
public class Paper
{
    // instance variables.
    private double height;//in inches.
    private double width;//in inches.
    private static double MILLIMETERS = 25.4;//25.4 mm per inch.
    
    /**
     * Constructor for objects of class Paper
     */
    public Paper(double _height, double _width)
    {
        // initialise instance variables
        height = _height;
        width = _width;
    }
    
    /**
     * Shows the paper's width in inches as width in millimeters.
     */
    public double getWidthInMillimeters()
    {
        return MILLIMETERS * width;
    }
   
    /**
     * Shows the paper's height in inches as height in millimeters.
     */
    public double getHeightInMillimeters()
    {
        return MILLIMETERS * height;
    }
    
    /**
     * Shows the paper's width in inches.
     */
    public double getWidthInInches()
    {
        return width;
    }
    
    /**
     * Shows the paper's height in inches.
     */
    public double getHeightInInches()
    {
        return height;
    }
}
