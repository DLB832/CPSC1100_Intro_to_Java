//DEREK CAMPBELL
//DLB832

public class Troll extends PlayerPiece
{
    // instance variables - replace the example below with your own
    private int maxHate;
    private int currentHate;

    public Troll()
    {
        // initialise instance variables
        maxHate = 75;
        currentHate = 75;
    }

    public int getMaxHate()
    {
        return maxHate; //shows the maxHate value
    }
    public int getCurrentHate()
    {
        return currentHate;
    }
    //mutator methods below
    public void setMaxHate(int maxH)
    {
        maxHate = maxH;
    }
    public void setCurrentHate(int currentH)
    {
        currentHate = currentH;
    }
    
    
}
