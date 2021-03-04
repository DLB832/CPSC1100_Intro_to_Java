//DEREK CAMPBELL
//DLB832

public class Human extends PlayerPiece
{
    // decleration of instance variables unique to the Human class.
    private int maxSpirit;
    private int currentSpirit;

    
    public Human()
    {
        // initialise instance variables with their starting values.
        maxSpirit = 50;
        currentSpirit = 50;
    }

    
    public int getMaxSpiritt()
    {
        return maxSpirit;
    }
    public int getCurrentSpirit()//finds the current spirit value.
    {
        return currentSpirit;//displays the current spirit value.
    }
    //below are mutator methods which change an instance variable
    public void setMaxSpirit(int maxS)
    {
        //set maxSpirit to value received as a parameter,
        // maxS
        maxSpirit = maxS; //refers to maxSpirit instance variable
    }
    public void SetCurrentSpirit(int currentS)//calling for an int to be set
    {
        currentSpirit = currentS; //changes the refence to the instance var
    }
}
