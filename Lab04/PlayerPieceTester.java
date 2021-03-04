//DEREK CAMPBELL
//DLB832
/**
 * This is a class to test the PlayerPiece class
 * 
 * @author (Derek Campbell) 
 * @version (02/02/2020)
 */
public class PlayerPieceTester
{
    public static void main(String[] args) {
      //create a PlayerPiece object
      //this is equivalent to right clicking
      //a class in BlueJ and creating an object
      PlayerPiece piece01 = new PlayerPiece();
      //by default, all instance vars 
      //in PlayerPiece are set to 0
      PlayerPiece piece02 = new PlayerPiece("Derek", "Cryptid", 350, 350, 0, 2, 14, 20, 75, 75);
      //should create a new piece with the appropriate arguments.
      
     //actual results
      System.out.println("Current/Total HP = " + 
                    piece01.getCurrentHealth() + "/" + 
                    piece01.getMaxHealth());

    //expected results
    //we expect the values to be 0 initially because we have not set 
    //any other specific values in the PlayerPiece.java file
      System.out.println("Expected 0/0");
      System.out.println();
      //Below this line you need to add tests 
      //first you will test your constructors.
      //test the  no argument constructor, and make sure
      //that the default values are set correctly (use method calls)
      //next, test the constructor that has several arguments
      //use method calls again to test these values are set correctly
      System.out.println("piece01 tests"); // tests for piece01
      System.out.println("Current/Total HP = " +
                    piece01.getCurrentHealth() + "/" +
                    piece01.getMaxHealth());
      //actal results for the no argument constructor for default values.
      System.out.println("Expected 100/100");
      // expected results of the no argument constructor for default values.
      
      //actual results
      System.out.println("Piece Name = " +
                    piece01.getPieceName());
      //expected results
      System.out.println("Expected no name");
      
      //actual results
      System.out.println("Piece Type = " +
                    piece01.getPieceType());
      //expected results              
      System.out.println("Expected human"); 
      
      //actual results
      System.out.println("Location (X,Y) = " +
                    piece01.getLocX() + "," +
                    piece01.getLocY());
      //expected results
      System.out.println("Expected (7,8)");
      
      //actual results
      System.out.println("Attack Power = " +
                    piece01.getAttackPower());
      //expected results
      System.out.println("Expected 25");
      
      //actual results
      System.out.println("Defense Power = " +
                    piece01.getDefensePower());
      //expected results
      System.out.println("Expected 20");
      
      //actual results
      System.out.println("Current/Total SP = " +
                    piece01.getCurrentSpecialPower() + "/" +
                    piece01.getMaxSpecialPower());
      //expected results
      System.out.println("Expected 50/50");
      System.out.println("");
      System.out.println("piece02 tests");
      System.out.println("Current/Total HP = " +
                    piece02.getCurrentHealth() + "/" +
                    piece02.getMaxHealth());
      //actal results for piece02. Testing if new piece declaration/initialization was successful.
      System.out.println("Expected 350/350");
      // expected results of piece02.
      
      //actual results
      System.out.println("Piece Name = " +
                    piece02.getPieceName());
      //expected results
      System.out.println("Expected Derek");
      
      //actual results
      System.out.println("Piece Type = " +
                    piece02.getPieceType());
      //expected results              
      System.out.println("Expected Cryptid"); 
      
      //actual results
      System.out.println("Location (X,Y) = " +
                    piece02.getLocX() + "," +
                    piece02.getLocY());
      //expected results
      System.out.println("Expected (0,2)");
      
      //actual results
      System.out.println("Attack Power = " +
                    piece02.getAttackPower());
      //expected results
      System.out.println("Expected 14");
      
      //actual results
      System.out.println("Defense Power = " +
                    piece02.getDefensePower());
      //expected results
      System.out.println("Expected 20");
      
      //actual results
      System.out.println("Current/Total SP = " +
                    piece02.getCurrentSpecialPower() + "/" +
                    piece02.getMaxSpecialPower());
      //expected results
      System.out.println("Expected 75/75");
      
      System.out.println(" "); //blank line for seperation of tests.
      System.out.println("Piece 1: Movement test"); //testing mutator methods
      
      piece01.moveUp(); // calling the moveUp mutator
      //actual results
      System.out.println("Move up. Y = " +
                    piece01.getLocY());
      //expected results
      System.out.println("Expected 9");
      
      piece01.moveDown(); // calling the moveDown mutator
      //actual results
      System.out.println("Move down. Y = " +
                    piece01.getLocY());
      //expected results
      System.out.println("Expected 8");
      
      piece01.moveLeft(); // calling the moveLeft mutator
      //actual results
      System.out.println("Move left. X = " +
                    piece01.getLocX());
      //expected results
      System.out.println("Expected 6");
      
      piece01.moveRight(); // calling the moveRight mutator
      //actual results
      System.out.println("Move right. X = " +
                    piece01.getLocX());
      //expected results
      System.out.println("Expected 7");
      System.out.println(""); // blank line for cleanliness
      System.out.println("Test location set");
      //actual results
      piece01.setLocXY(14,15);
      System.out.println("New piece01 location = " +
                    piece01.getLocX() + "," +
                    piece01.getLocY());
      //expected results
      System.out.println("Expected new piece location = (14,15)");
      
      System.out.println("");//blank space
      System.out.println("Deduct Health test");
      //actual results
      piece01.deductHealth(20);//can't use println for void methods. use get to verify working.
      System.out.println("HP - 20 = " +
                    piece01.getCurrentHealth());
      //expected results
      System.out.println("Expected 80");
      
      System.out.println("");//blank space
      System.out.println("Add Health test");
      //actual results
      piece01.addHealth(40);
      System.out.println("HP + 40 = " +
                    piece01.getCurrentHealth());
      //expected results
      System.out.println("Expected 120");
    }
}
