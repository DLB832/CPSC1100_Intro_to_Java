//DEREK CAMPBELL
//DLB832
/**
 * Write a description of class StringManipulator here.
 *
 * @author (Derek Campbell)
 * @version (04/04/2020)
 */
public class StringManipulator
{
    // instance variables
    private String line;

    /**
     * Constructor for objects of class StringManipulator
     * 
     * @param (_line) A line of text to be evaluated by the methods.
     */
    public StringManipulator(String _line)
    {
        // initialise instance variables
        line = _line;
    }

    /**
     * Prints out only the uppercase letters in a string inputted by the user.
     */
    public void printUpper()
    {
        
        for(int u = 0; u < line.length(); u++)
        {
            if(Character.isUpperCase(line.charAt(u)))
            {
                System.out.print(line.charAt(u));
            }
        }
            
    }
    
    /**
     * Prints out every other character in a string inputted by the user.
     */
    public void printEveryOther()
    {
        
        for (int p = 0; p < line.length(); p++)
        {
            if(p % 2 == 0)//if the characters position is even
            {
                System.out.print(line.charAt(p));
            }
        }
        System.out.println("");
    }
    
    /** 
     * Changes each vowel in a string inputted by a user into an underscore.
     */
    public void vowelsToUnderscore()
    {
        String line2;
        line2 = line.replaceAll("[aeiouAEIOU]", "_");
        System.out.println(line2);
        //how do you do this in a loop? It works like this and seems to be more efficient.
        }
    
    /**
     * prints out the number of vowels in a string inputted by the user.
     */
    public void printVowelCount()
    {
        int vowels = 0;
        for (int v = 0; v < line.length(); v++)
        {
            char ch = line.charAt(v);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                vowels++;
            }
        }
        System.out.println("The number of vowels used was: " + vowels);
    }
    
    /** 
     * prints the numerical position of the vowels in a string inputted by the user.
     */
    public void printVowelPositions()
    {
        for (int vp = 0; vp < line.length(); vp++)
        {
            char c = line.charAt(vp);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            {
                System.out.print(vp + " ");
            }
        }
        System.out.println("");
    }
    
}
