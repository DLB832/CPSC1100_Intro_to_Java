//DEREK CAMPBELL
//DLB832

public class Dwarf extends PlayerPiece 
{
    // declaration of instance variables unique to the dwarf class.
    private int maxStrength;
    private int currentStrength;

    public Dwarf()
    {
        // initialise instance variables with starting values.
        maxStrength = 50;
        currentStrength = 50;
    }

    
    public int getMaxStrength()
    {
        return maxStrength;
    }
    public int getCurrentStrength()
    {
        return currentStrength;
    }
    //mutators go below
    public void setMaxStrength(int maxSTR)
    {
        maxStrength = maxSTR;
    }
    public void setCurrentStrength(int currentSTR)
    {
        currentStrength = currentSTR;
    }
}
