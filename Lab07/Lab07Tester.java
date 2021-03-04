//Derek Campbell
//DLB832
import java.util.Scanner;//imports the scanner class.
/**
 * A class for testing all of the methods produced in Lab07.
 *
 * @author (Derek Campbell)
 * @version (02/19/2020)
 */
public class Lab07Tester
{
    public static void main(String[] args) 
    {
      System.out.println("Begin tasks.\n");
      
      System.out.println("Task01: Begin.\n");
      Paper paper01 = new Paper(8.2,5.3);//creates new paper w/ dimensions.
      System.out.printf("Paper Width: " +
        paper01.getWidthInInches() + (" inches\n"));
      System.out.printf("Paper Height: " +
        paper01.getHeightInInches() + (" inches\n"));
      System.out.printf("Converted Paper Width: %.2f", + 
        paper01.getWidthInMillimeters());          
      System.out.printf("\nConverted Paper Height: %.2f", +
        paper01.getHeightInMillimeters()); 
      
      System.out.println("\n\nTask02: Begin.\n");
      System.out.println("Please input a value for X:");
      Scanner in = new Scanner(System.in);//creates the scanner object.
      int _x = in.nextInt();//takes user input and assigns it to _x. use 42.
      System.out.println("Please input a value for Y:");
      int _y = in.nextInt();//takes user input and assigns it to _y. use 97.
      /*need to assign the values to the parameters before making the new 
      NumberCalculator object*/
      //creates a new number calculator.
      NumberCalculator calc02 = new NumberCalculator(_x,_y);
      //hard spacing done for chart neatness.
      System.out.println("Thank you for your inputs.");
      System.out.printf("Sum:                " +
        calc02.getSum());
      System.out.printf("\nDifference          " +
        calc02.getDifference());
      System.out.printf("\nProduct:           " +
        calc02.getProduct());
      System.out.printf("\nAverage:             " +
        calc02.getAverage());
      System.out.printf("\nDistance:            " +
        calc02.getDistance());
      System.out.printf("\nMaximum:             " +
        calc02.getMaximum());
      System.out.printf("\nMinimum:             " +
        calc02.getMinimum());
      
      System.out.println("\n ");  
      System.out.println("Task 03: Begin.\n");
      System.out.print("Please input a value for the number of Gallons of " +
        ("\ngas in the car's tank:"));
      double _gallons = in.nextDouble();//use 25
      System.out.print("Please input a value for the fuel efficiency of the " +
        ("\ncar in Miles per Gallon:"));
      double _efficiency = in.nextDouble();//use 26.35
      System.out.print("Please input a value for the price of 1 gallon of " +
        ("\ngas:"));
      double _price = in.nextDouble();// use 2.13
      CarSimulator car03 = new CarSimulator(_gallons, _efficiency, _price);
      //creates a new car simulator.
      System.out.println("Thank you for your inputs.");
      System.out.printf("The cost of driving 100 miles is: $%.2f", +
        car03.getCostPer100Miles());
      System.out.println("\nThe distance the car can currently travel is: " +
        car03.getDistance() + (" miles"));
        
      System.out.println("\nTask 04: Begin.\n");
      System.out.print("Please input a value for the frequency of the " +
        ("\ncircuit:"));
      double _f = in.nextDouble();//use 16.7
      System.out.print("Please input a value for the minimum value of the " +
        ("\ncapacitor:"));
      double _cmin = in.nextDouble();//use 14
      System.out.print("Please input a value for the maximum value of the " +
        ("\ncapacitor:"));
      double _cmax = in.nextDouble();//use 365
      System.out.println("Thank you for your inputs.");
      TuningCircuit cir04 = new TuningCircuit(_f, _cmin, _cmax);
      System.out.printf("Minimum Frequency: %.2f", +
        cir04.getFMin());
      System.out.printf("\nMaximum Frequency: %.2f", +
        cir04.getFMax());
    }
    
}
