//DEREK CAMPBELL
//DLB832
import java.util.Scanner;//imports in the IO scanner class for user input.
/**
 * A tester for the Triangle class.
 *
 * @author (Derek Campbell)
 * @version (2/26/2020)
 */
public class TriangleRunner
{
   public static void main(String[] args)
   {
     Scanner in = new Scanner(System.in);//creates the new scanner object called "in".
     
     System.out.println("Please input values for a triangle.");
     System.out.println("Value for x1: ");
        double _x1 = in.nextDouble();//next user input is assigned to _x1.
     System.out.println("Value for y1: ");
        double _y1 = in.nextDouble();//next user input is assigned to _y1. 
     System.out.println("Value for x2: ");
        double _x2 = in.nextDouble();//next user input is assigned to _x2.
     System.out.println("Value for y2: ");
        double _y2 = in.nextDouble();//next user input is assigned to _y2.
     System.out.println("Value for x3: ");
        double _x3 = in.nextDouble();//next user input is assigned to _x3.
     System.out.println("Value for y3: ");
        double _y3 = in.nextDouble();//next user input is assigned to _y3. 
     System.out.println("Thank you for your inputs.");  
     Triangle tri1 = new Triangle(_x1, _y1, _x2, _y2, _x3, _y3);
     //creates a new triangle "tri1" with the givem values as the user inputs.
     
     //creates a neat table to display the given values for the triangle.
     //%.3f limits decimal places.
     System.out.printf("\nTriangle point 1: (" + _x1 + ", " + _y1 + ")");
     System.out.printf("\nTriangle point 2: (" + _x2 + ", " + _y2 + ")");
     System.out.printf("\nTriangle point 3: (" + _x3 + ", " + _y3 + ")");
     System.out.printf("\nSide 1 length: " + tri1.getSide1Length());
     System.out.printf("\nSide 2 length: " + "%.3f", tri1.getSide2Length());
     System.out.printf("\nSide 3 length: " +  tri1.getSide3Length());
     System.out.printf("\nAngle 1: " + "%.3f", tri1.getAngle1());
     System.out.printf("\nAngle 2: " + "%.3f", tri1.getAngle2());
     System.out.printf("\nAngle 3: " + "%.3f", tri1.getAngle3());
     System.out.printf("\nThe Perimeter of the triangle is: " + "%.3f", tri1.getPerimeter());
     System.out.printf("\nThe Area of the Triangle is: " + "%.3f", tri1.getArea());
    }
   
}