//DEREK CAMPBELL
//DLB832

public class Elf extends PlayerPiece
{
    // declaration of instance variables unique to the Elf class.
    private int maxMagic;
    private int currentMagic;

    public Elf()
    {
        // initialise instance variables and give them a starting value.
        maxMagic = 50;
        currentMagic = 50;
    }

    
    public int getMaxMagic()
    {
        return maxMagic;
    }
    public int getCurrentMagic()
    {
        return currentMagic;
    }
    
    //time for mutators
    public void setMaxMagic(int maxM)
    {
        maxMagic = maxM;
    }
    public void setCurrentMagic(int currentM)
    {
        currentMagic = currentM;
    }
    
}
