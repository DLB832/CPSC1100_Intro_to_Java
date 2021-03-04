//DEREK CAMPBELL
//DLB832
/**
 * Single tester class for Lab09.
 *
 * @author (Derek Campbell)
 * @version (03/04/2020)
 */
public class Lab09Tester
{
 public static void main(String[] args){
  System.out.println("Begin Task01");
  
  ValueAnalyzer va01 = new ValueAnalyzer();
  va01.setValue(19);//sets the x value to 19.
  System.out.println("The X value = " + 
                        va01.getValue());//returns the x value.
  System.out.println("Expected: 19");
  
  va01.analyzeValue();
    if(va01.analyzeValue()==1){
        System.out.println("X is positive");
    }else if(va01.analyzeValue()==0){
        System.out.println("X is zero.");
    }else{
        System.out.println("X is negative.");
    } 
  System.out.println("Expected: X is positive");
  
  va01.setValue(0);//sets the x value to 0.
  System.out.println("Expected: 0");
  System.out.println("The X value = " + 
                        va01.getValue());//returns the x value.
  va01.analyzeValue();
    if(va01.analyzeValue()==1){
        System.out.println("X is positive");
    }else if(va01.analyzeValue()==0){
        System.out.println("X is zero.");
    }else{
        System.out.println("X is negative.");
    } 
  System.out.println("Expected: X is zero.");
  
  va01.setValue(-4);//sets the x value to -4.
  System.out.println("Expected: -4");
  System.out.println("The X value = " + 
                        va01.getValue());//returns the x value.
  va01.analyzeValue();
    if(va01.analyzeValue()==1){
        System.out.println("X is positive");
    }else if(va01.analyzeValue()==0){
        System.out.println("X is zero.");
    }else{
        System.out.println("X is negative.");
    } 
  System.out.println("Expected: X is negative.");
  
  System.out.println("");
  System.out.println("Begin Task02");
  
  DoubleAnalyzer da02 = new DoubleAnalyzer(-32.1);
  System.out.println("The X value = " + 
                        da02.getValue());//returns the x value.                      
  da02.analyzeDouble();//determine's if the x value is +,-,0,large, or small.
  System.out.println("Expected: -32.1; X is Negative.");
  da02.setValue(1000001);//sets a new value for x.
  System.out.println("The X value = " + 
                        da02.getValue());                      
  da02.analyzeDouble();
  System.out.println("Expected: 1000001.0; X is Positive; Large.");
  System.out.println("Expected: X is positive");
  da02.setValue(0);
  System.out.println("The X value = " + 
                        da02.getValue());
  da02.analyzeDouble();
  System.out.println("Expected: 0.0; X is Zero; small.");
  da02.setValue(0.0467852);
  System.out.println("The X value = " + 
                        da02.getValue());
  da02.analyzeDouble();
  System.out.println("Expected: 0.0467852; X is Positive; small.");
  da02.setValue(-0.3568852);
  System.out.println("The X value = " + 
                        da02.getValue());
  da02.analyzeDouble();
  System.out.println("Expected: -0.3568852; X is negative; small.");
  
  System.out.println("");
  System.out.println("Begin Task03");
  DigitPrinter dp03 = new DigitPrinter(35468574);//8
  System.out.println("The Value of V = " +
                        dp03.getValue());
  dp03.printDigits();
  System.out.println("Expected: 35468574; Expected: 8 digits.");
  dp03.setValue(-64825776);//-8
  System.out.println("The Value of V = " +
                        dp03.getValue());
  dp03.printDigits();
  System.out.println("Expected: -64825776. Expected: 8 digits.");
  dp03.setValue(-6685245);//-7
  System.out.println("The Value of V = " +
                        dp03.getValue());
  dp03.printDigits();
  System.out.println("Expected: -6685245. Expected: 7 digits.");
  dp03.setValue(7852368);//7
  System.out.println("The Value of V = " +
                        dp03.getValue());
  dp03.printDigits();
  System.out.println("Expected: 7852368. Expected: 7 digits.");
  dp03.setValue(346598);//6
  System.out.println("The Value of V = " +
                        dp03.getValue());
  dp03.printDigits();
  System.out.println("Expected: 346598. Expected: 6 digits.");
  dp03.setValue(-658542);//-6
  System.out.println("The Value of V = " +
                        dp03.getValue());
  dp03.printDigits();
  System.out.println("Expected: -658542. Expected: 6 digits.");
  dp03.setValue(69658);//5
  System.out.println("The Value of V = " +
                        dp03.getValue());
  dp03.printDigits();
  System.out.println("Expected: 69658. Expected: 5 digits.");
  dp03.setValue(-58574);//-5
  System.out.println("The Value of V = " +
                        dp03.getValue());
  dp03.printDigits();
  System.out.println("Expected: -58574. Expected: 5 digits.");
  dp03.setValue(4458);//4
  System.out.println("The Value of V = " +
                        dp03.getValue());
  dp03.printDigits();
  System.out.println("Expected: 4458. Expected: 4 digits.");
  dp03.setValue(-3635);//-4
  System.out.println("The Value of V = " +
                        dp03.getValue());
  dp03.printDigits();
  System.out.println("Expected: -3635. Expected: 4 digits.");
  dp03.setValue(654);//3
  System.out.println("The Value of V = " +
                        dp03.getValue());
  dp03.printDigits();
  System.out.println("Expected: 654. Expected: 3 digits.");
  dp03.setValue(-321);//-3
  System.out.println("The Value of V = " +
                        dp03.getValue());
  dp03.printDigits();
  System.out.println("Expected: -321. Expected: 3 digits.");
  dp03.setValue(16);//2
  System.out.println("The Value of V = " +
                        dp03.getValue());
  dp03.printDigits();
  System.out.println("Expected: 16. Expected: 2 digits.");
  dp03.setValue(-14);//-2
  System.out.println("The Value of V = " +
                        dp03.getValue());
  dp03.printDigits();
  System.out.println("Expected: -14. Expected: 2 digits.");
  dp03.setValue(4);//1
  System.out.println("The Value of V = " +
                        dp03.getValue());
  dp03.printDigits();
  System.out.println("Expected: 1. Expected: 1 digit.");
  dp03.setValue(-6);//-1
  System.out.println("The Value of V = " +
                        dp03.getValue());
  dp03.printDigits();
  System.out.println("Expected: -1. Expected: 1 digit.");
  
  System.out.println("");
  System.out.println("Begin Tasko4.");
  
  DigitalThermometer dt04 = new DigitalThermometer(10.0);
  dt04.setVoltage(14.0);
  System.out.println("The voltage is: " +
                        dt04.getVoltage());
  System.out.print("The temperature is: ");
  dt04.calculateTemp();//can't add a void method? new line still pulls it.
  System.out.println("");
  System.out.println("Expected: 14.0. Expected: 150.0.");
  dt04.setVoltage(11.9);
  System.out.println("The voltage is: " +
                        dt04.getVoltage());
  System.out.print("The temperature is: ");
  dt04.calculateTemp();
  System.out.println("Expected: 11.9. Expected: error.");
  dt04.setVoltage(18.1);
  System.out.println("The voltage is: " +
                        dt04.getVoltage());
  System.out.print("The temperature is: "); 
  dt04.calculateTemp();
  System.out.println("Expected: 18.1. Expected: error.");
  System.out.println("");
 }
}