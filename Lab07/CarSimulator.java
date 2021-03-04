//DEREK CAMPBELL
//DLB832
/**
 * A class to simulate the cost of usage of a car. 
 *
 * @author (Derek Campbell)
 * @version (02/23/2020)
 */
public class CarSimulator
{
    // instance variables - replace the example below with your own
    private double gallons;//gallons of gas in the tank
    private double efficiency;//fuel efficiency in miles per gallon.
    private double price;//cost of gas per gallon.
    /**
     * Constructor for objects of class CarSimulator made off of user input.
     */
    public CarSimulator(double _gallons, double _efficiency, double _price)
    {
        // initialise instance variables
        gallons = _gallons;
        efficiency = _efficiency;
        price = _price;
    }

    /**
     * Calculate the cost of driving the car 100 miles.
     * @return  how many miles the car gets per gallon / the price per gallon?
     */
    public double getCostPer100Miles()
    {
        return 100.00 / efficiency * price; //miles/MPG*price=total cost
    }
    
    /**
     * Calculates how far the car can go with the gas currently in the tank.
     * @return the product of the amount of gas in the tank and fuel efficiency.
     */
    public double getDistance()
    {
        return gallons * efficiency;
    }
}
