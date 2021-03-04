//DEREK CAMPBELL
//DLB832
/**
 * Write a description of class DigitalThermometer here.
 *
 * @author (Derek Campbell)
 * @version (03/08/2020)
 */
public class DigitalThermometer
{
    // instance variables
    private double vm;

    /**
     * Constructor for objects of class DigitalThermometer
     */
    public DigitalThermometer(double _vm)
    {
        // initialise instance variables
        vm = _vm;
    }

    /**
     * mutator method that sets a new value for vm.
     * @param  vm2  a new value set for vm.
     */
    public void setVoltage(double vm2)
    {
        vm = vm2;
    }
    
    /**
     * Accessor method that returns the value set for vm.
     */
    public double getVoltage()
    {
        return vm;
    }
    
    /**
     * Accoessor method that returns the calculated temperature off the 
     * voltage value set for vm.
     */
    public void calculateTemp()
    {
        if(vm>=12&&vm<=18){ 
            double t = (75/0.5) * (vm/(20-vm)) - (100/0.5);
            System.out.print(t);//temperature.
        }else{
            System.out.println("error.");
        }
    }
}
