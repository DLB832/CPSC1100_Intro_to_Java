
/**
 * Write a description of class QuickTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuickTest
{    /**
     * Quick Test for code before tester class
     */
    public static void main(String[] args)
    {
        AutomaticTeller at01 = new AutomaticTeller(5927);//1st try
        at01.validateUser();
        AutomaticTeller at02 = new AutomaticTeller(3334);//2nd try
        at02.validateUser();
        AutomaticTeller at03 = new AutomaticTeller(1234);//3rd try
        at03.validateUser();
        AutomaticTeller at04 = new AutomaticTeller(7543);//locked out.
        at04.validateUser();
        
    }

}
