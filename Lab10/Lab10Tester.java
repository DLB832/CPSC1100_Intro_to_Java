//DEREK CAMPBELL
//DLB832
/**
 * A tester class for all of Lab10.
 *
 * @author (Derek Campbell)
 * @version (03/28/2020)
 */
public class Lab10Tester
{
    public static void main(String[] args){
        System.out.println("Bein Task01.");
        
        //calling single as part of the FilingStatus enum within the TaxReturn class.
        TaxReturn tx01 = new TaxReturn(TaxReturn.FilingStatus.SINGLE, 8_000);
        System.out.println("The income tax value for a single idividual who made $8,000 is: $" 
                                                        + tx01.getTax());
        System.out.println("The expected value is: $800");
        
        TaxReturn tx02 = new TaxReturn(TaxReturn.FilingStatus.SINGLE, 32_000);
        System.out.println("The income tax value for a single idividual who made $32,000 is: $" 
                                                        + tx02.getTax());
        System.out.println("The expected value is: $4,400");
        TaxReturn tx03 = new TaxReturn(TaxReturn.FilingStatus.SINGLE, 40_000);
        System.out.println("The income tax value for a single idividual who made $40,000 is: $" 
                                                        + tx03.getTax());
        System.out.println("The expected value is: $6,400");
        TaxReturn tx04 = new TaxReturn(TaxReturn.FilingStatus.MARRIED, 16_000);
        System.out.println("The income tax value for a married couple who made $16,000 is: $" 
                                                        + tx04.getTax());
        System.out.println("The expected value is: $1,600");
        TaxReturn tx05 = new TaxReturn(TaxReturn.FilingStatus.MARRIED, 64_000);
        System.out.println("The income tax value for a married couple who made $64,000 is: $" 
                                                        + tx05.getTax());
        System.out.println("The expected value is: $8,800");
        TaxReturn tx06 = new TaxReturn(TaxReturn.FilingStatus.MARRIED, 70_000);
        System.out.println("The income tax value for a married couple who made $70,000 is: $" 
                                                        + tx06.getTax());
        System.out.println("The expected value is: $10,00");
        System.out.println("");
        
        TaxReturn tx11 = new TaxReturn(TaxReturn.FilingStatus.SINGLE, 4_000);
        System.out.println("The income tax value for a single idividual who made $4,000 is: $" 
                                                        + tx11.getTax());
        System.out.println("The expected value is: $400");
        
        TaxReturn tx12 = new TaxReturn(TaxReturn.FilingStatus.SINGLE, 16_000);
        System.out.println("The income tax value for a single idividual who made $16,000 is: $" 
                                                        + tx12.getTax());
        System.out.println("The expected value is: $2,000");
        TaxReturn tx13 = new TaxReturn(TaxReturn.FilingStatus.SINGLE, 50_000);
        System.out.println("The income tax value for a single idividual who made $50,000 is: $" 
                                                        + tx13.getTax());
        System.out.println("The expected value is: $8,900");
        TaxReturn tx14 = new TaxReturn(TaxReturn.FilingStatus.MARRIED, 10_000);
        System.out.println("The income tax value for a married couple who made $10,000 is: $" 
                                                        + tx14.getTax());
        System.out.println("The expected value is: $1,000");
        TaxReturn tx15 = new TaxReturn(TaxReturn.FilingStatus.MARRIED, 50_000);
        System.out.println("The income tax value for a married couple who made $50,000 is: $" 
                                                        + tx15.getTax());
        System.out.println("The expected value is: $6,700");
        TaxReturn tx16 = new TaxReturn(TaxReturn.FilingStatus.MARRIED, 80_000);
        System.out.println("The income tax value for a married couple who made $80,000 is: $" 
                                                        + tx16.getTax());
        System.out.println("The expected value is: $12,800");
        
        System.out.println("");
        System.out.println("Begin Task02.");
        
        AutomaticTeller at01 = new AutomaticTeller(5927);//1st try
        at01.validateUser();
        AutomaticTeller at02 = new AutomaticTeller(3334);//2nd try
        at02.validateUser();
        AutomaticTeller at03 = new AutomaticTeller(1234);//3rd try
        at03.validateUser();
        AutomaticTeller at04 = new AutomaticTeller(7543);//locked out.
        at04.validateUser();
        
        System.out.println("");
        System.out.println("Begin Task03.");
        
        CarSimulator cs01 = new CarSimulator();//both closed
        System.out.println("In car 1  " + 
        cs01.checkDoors(0, 0, 0, 0, 0, 0, 0, 0, CarSimulator.GearShift.P));
        CarSimulator cs02 = new CarSimulator();//left open
        System.out.println("In car 2 the " + 
        cs02.checkDoors(1, 0, 0, 1, 1, 0, 1, 0, CarSimulator.GearShift.P));
        CarSimulator cs03 = new CarSimulator();//right open
        System.out.println("In car 3 the " + 
        cs03.checkDoors(0, 1, 0, 1, 0, 1, 0, 1, CarSimulator.GearShift.P));
        CarSimulator cs04 = new CarSimulator();//both open
        System.out.println("In car 4  " + 
        cs04.checkDoors(1, 1, 0, 1, 1, 1, 1, 1, CarSimulator.GearShift.P));
        
        
        
        
    }
}
