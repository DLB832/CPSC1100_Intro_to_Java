//DEREK CAMPBELL
//DLB832
/**
 * Lab04's PlayerPiece. Will most likely be utilizing techniques learned here in the expansion of 
 * Lab03's game player pieces.
 * @author (Derek Campbell) 
 * @version (02/02/2020)
 */
public class PlayerPiece
{
    //comments to the right of each instance variable indicate the
    //initial values that you will set in the no argument constructor
    // instance variables
    private String pieceName; //"no name"
    private String pieceType; //"human"
    
    private int currentHealth; //100
    private int maxHealth; //100
     
    private int locX;  //7
    private int locY;  //8
    
    private int attackPower; //25
    private int defensePower; //20
    
    private int currentSpecialPower; //50
    private int maxSpecialPower; //50

    /**
     * Initializing instance variables and setting them to appropriate starting values.
     */
    public PlayerPiece()
    {
        // initialise instance variables
        //Use the values listed in the comments
        //above that are next to each instance variable
        pieceName = "no name";
        pieceType = "human";
        currentHealth = 100;
        maxHealth = 100;
        locX = 7;
        locY = 8;
        attackPower = 25;
        defensePower = 20;
        currentSpecialPower = 50;
        maxSpecialPower = 50;
       
    }
    
    /**
     * Quick piece creation initialization.
     */
    public PlayerPiece(String name, String type, int curH, int maxH, int x, int y, 
                            int atkP, int defP, int curSP, int maxSP) {
        pieceName = name;
        //fill in the rest of the values here
        pieceType = type;
        currentHealth = curH;
        maxHealth = maxH;
        locX = x;
        locY = y;
        attackPower = atkP;
        defensePower = defP;
        currentSpecialPower = curSP;
        maxSpecialPower = maxSP;
    }
    

    /**
     * Creates an accessor method for providing the maximum health value.
     */
    public int getMaxHealth() {
        return maxHealth;
    }
    /**
     * Creates an accessor method for providing the current health value.
     */
    public int getCurrentHealth() {
        return currentHealth;
    }
    /**
     * Creates an accessor method for providing the X location coordinate.
     */
    public int getLocX() {
        return locX;
    }
    /**
     * Creates an accessor method for providing the Y location coordinate.
     */
    public int getLocY() {
        return locY;
    }
    /**
     * Creates an accessor method for providing the attack power value.
     */
    public int getAttackPower() {
        return attackPower;
    }
    /**
     * Creates an accessor method for providing the defense power value.
     */
    public int getDefensePower() {
        return defensePower;
    }
    //moves the piece by 1 value either X or Y.
    /**
     * Creates a mutator method that moves the piece 1 place up on the Y coordinate.
     */
    public void moveUp() {
        locY = locY + 1;
    }
    /**
     * Creates a mutator method that moves the piece 1 place down on the Y coordinate.
     */
    public void moveDown() {
        locY = locY - 1;
    }
    /**
     * Creates a mutator method that moves the piece 1 place left on the X coordinate.
     */
    public void moveLeft() {
        locX = locX - 1;
    }
    /**
     * Creates a mutator method that moves the piece 1 place right on the X coordinate.
     */
    public void moveRight() {
        locX = locX + 1;
    }
    /**
     * Creates a mutator method that sets a new maximum special power value.
     */
    public void setMaxSpecialPower(int maxS) {
        maxSpecialPower= maxS;
    }
    
    /**
     * Creates a mutator method that sets a new current special power value.
     */
    public void setCurrentSpecialPower(int curS) {
        currentSpecialPower = curS;
    }
    /**
     * Creates an accessor method that gets the maximum special power value.
     */
    public int getMaxSpecialPower() {
        return maxSpecialPower;
    }
    
    /**
     * Creates an accessor method that gets the current special power value.
     */
    public int getCurrentSpecialPower() {
        return currentSpecialPower;
    }
    
    /**
     * Creates an accessor method that gets the piece's type.
     */
    public String getPieceType() {
        return pieceType;
    }
    
    /**
     * Creates an accessor method that gets the piece's name.
     */
    public String getPieceName() {
        return pieceName;
    }
    
    /**
     * Creates a mutator method that sets a new piece type.
     */
    public void setPieceType(String type) {
        pieceType = type;
    }
    
    /**
     * Creates a mutator method that sets a new piece name.
     */
    public void setPieceName(String name) {
        pieceName = name;
    }
    
    /**
     * Creates a mutator method that sets a new X and Y coordinate for a piece.
     */
    public void setLocXY(int x, int y) {
        locX = x;
        locY = y;
    }
    
    /**
     * Creates a mutator method that subtracts a declared amount from the piece's current health.
     * Especially useful for making changes to the health due to damage recieved.
     * @param amt the specific amount to be subtracted.
     */
    public void deductHealth( int amt) {
        currentHealth = currentHealth - amt;
    }
    /**
     * Creates a mutator method that adds a declared amount to the piece's current health.
     * Especially useful for making changes to the health due to healing recieved.
     * @param amt the specific amount to be added.
     */
    public void addHealth(int amt) {
        currentHealth = currentHealth + amt;
    }
}
