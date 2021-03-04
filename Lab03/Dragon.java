//DEREK CAMPBELL
//DLB832
public class Dragon extends PlayerPiece
{
    // instance variables specific for the Dragon class.
    private int maxFire;
    private int currentFire;

    /*constructor objects for the Dragon class. here you can edit this 
     * objects specific variables even the ones its pulling from the 
     * player piece class. */
   public Dragon()
    {
        // initialise instance variables
        maxFire = 100;
        currentFire = 100;
    }

   public int getMaxFire()
    {
        return maxFire;
    }
   public int getCurrentFire()
    {
        return currentFire;
    }
    // mutator methods below
   public void setMaxFire(int maxF)
    {
        maxFire = maxF;
    }
   public void setCurrentfire(int currentF)
    {
       currentFire = currentF;
    }
   
    
}
