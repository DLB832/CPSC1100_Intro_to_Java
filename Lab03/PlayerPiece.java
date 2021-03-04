//DEREK CAMPBELL
//DLB832

public class PlayerPiece extends BoardPiece /* extending a class lets it 
inherit aspects of the extended class while also being able to do more 
specialized things itsself. this is a one way relationship. */
{
    /* declaring private instance variables that the class has.
        these will be the set stats for the player. can private variables
        only be called by the declaring class? */
    private int currentHealth;
    private int maxHealth;
    private int locX;
    private int locY;
    private int attackPower;
    private int defensePower;
    
    public PlayerPiece()
    {
        // initialising instance variables and giving them a starting value.
        currentHealth = 100;
        maxHealth = 100;
        locX = 15;
        locY = 13;
        attackPower = 12;
        defensePower = 10;
        
    }

    /* Methods
     * "public" can be called by anyone.
     * NameOfMethod(parameters)
     * brackets for code. new brackets with each method?
     */
    public int getMaxHealth()
    {
        // code goes inbetween brackets
        return maxHealth;
    }
    public int getCurrentHealth()
    {
        return currentHealth;
    }
    public int getLocX()
    {
        return locX;
    }
    public int getLocY()
    {
        return locY;
    }
    public int getAttackPower()
    {
        return attackPower;
    }
    public int getDefensePower()
    {
        return defensePower;
    }
    // the above are accesor methods. they display info but make no changes.
    public void moveUp()
    {
    }
    public void moveDown()
    {
    }
    public void moveLeft()
    {
    }
    public void moveRight()
    {
    }
    /* the above are mutator methods. they change something about the class.
        we will be worrying about this section in a different lab. */
    
    
    
}
