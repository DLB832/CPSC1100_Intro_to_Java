//DEREK CAMPBELL
//DLB832
import java.util.Scanner; //imports a scanner for user input.
/**
 * Tester class for Lab 11.
 *
 * @author (Derek Campbell)
 * @version (04/04/2020)
 */
 public class Lab11Tester
 {
   public static void main(String[] args)
   {
       System.out.println("Begin Task01.");
       LoopsComputer lc01 = new LoopsComputer(); //creates a new Loops Computer.
       
       lc01.computeEvenSum();//O
       lc01.computeSquareSum();//O
       lc01.printPowers();//O
       lc01.oddSum(8, 14);//O
       System.out.println("");
       
       System.out.println("Begin Task02");
       InputAnalyzer ia02 = new InputAnalyzer();//creates a new Input Analyzer.

       ia02.findSmallLarge();//O
       ia02.countEvenOdd();//O
       ia02.cumulativeTotal();//O
       ia02.findAdjDuplicates();//O
       System.out.println("");
       
       System.out.println("Begin Task03.");
       System.out.println("Please enter a line of text.");
       Scanner in = new Scanner(System.in);
       String _line = in.nextLine();//promps user for a line of text.
       //If you're going to hit me, hit me with an axe.
       StringManipulator sm03 = new StringManipulator(_line);//uses the users line of text for constructors.
       sm03.printUpper();//O
       sm03.printEveryOther();//O
       sm03.vowelsToUnderscore();//O
       sm03.printVowelPositions();
   }
 }
