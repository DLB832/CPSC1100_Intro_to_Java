//DEREK CAMPBELL
//DLB832
import java.util.Scanner;//imports the IO scanner.
import java.lang.Math; //imports math functions.
/**
 * Write a description of class Lab6Tester here.
 *
 * @author (Derek Campbell)
 * @version (02/12/2020)
 */
public class Lab6Tester
{
    public static void main(String[] args){//creates the main method for class.
        //data type instane variable initiations.
        int var1 = 0;
        byte var2 = 0;
        short var3 = 0;
        long var4 = 0;
        double var5 = 0;
        float var6 = 0;
        char var7 = 'g';
        boolean var8 = false;
        
        //printing out current data type's values.
        System.out.println("int var1 = " + var1);
        System.out.println("byte var2 = " + var2);
        System.out.println("short var3 = " + var3);
        System.out.println("long var4 = " + var4);
        System.out.println("double var5 = " + var5);
        System.out.println("float var6 = " + var6);
        System.out.println("char var7 = " + var7);
        System.out.println("boolean var8 = " + var8);
        System.out.println("");
        
        //modifying values with assignment statements.
        var1 = 2147483647;
        var2 = 64;
        var3 = 28941;
        var4 = 9223372036854775807L;
        var5 = 0.416854654654;
        var6 = 0.1113598F;
        var7 = '*';
        var8 = true;
        
        //printing out new data type's values.
        System.out.println("int var1 = " + var1);
        System.out.println("byte var2 = " + var2);
        System.out.println("short var3 = " + var3);
        System.out.println("long var4 = " + var4);
        System.out.println("double var5 = " + var5);
        System.out.println("float var6 = " + var6);
        System.out.println("char var7 = " + var7);
        System.out.println("boolean var8 = " + var8);
        System.out.println("");
        
        //constants creation
        final int CONSTANT1 = 15;
        final byte CONSTANT2 = 127;
        final short CONSTANT3 = 32_000;
        final long CONSTANT4 = -9223372036854775808L;
        final double CONSTANT5 = 165465413465432.33345654874;
        final float CONSTANT6 = 654646468746.3524644F;
        final char CONSTANT7 = 'K';
        final boolean CONSTANT8 = true;
        
        //printing out constants.
        System.out.println("int CONSTANT1 = " + CONSTANT1);
        System.out.println("byte CONSTANT2 = " + CONSTANT2);
        System.out.println("short CONSTANT3 = " + CONSTANT3);
        System.out.println("long CONSTANT4 = " + CONSTANT4);
        System.out.println("double CONSTANT5 = " + CONSTANT5);
        System.out.println("float CONSTANT6 = " + CONSTANT6);
        System.out.println("char CONSTANT7 = " + CONSTANT7);
        System.out.println("boolean CONSTANT8 = " + CONSTANT8);
        System.out.println("");
        
        /*CONSTANT5 = 6546854; cannot assign values to a constant. Kept in
        as a reminder.*/
        System.out.print("When you try to assign a value to a constant you" +
                     ("\nreceive an error message which reads: \"cannot" +
                     ("\nassign a value to a final variable CONSTANTS\".")));
        System.out.println("\n"); 
        
        //Arithmatic operations.
        int a = 3;
        int b = 4;
        int c = 5;
        int d = 17;
        //3 and 4 are added with sum 7
        //7 is divided by 5 with quotient 1
        System.out.println((a + b)/ c);
        //4 is divided by 5 with a quotient 0
        //3 is added to 0 with a sum 3
        System.out.println(a + b / c);
        //a++ is the same as saying a + 1. 3+1
        //it is an incrimental method.
        a++;
        System.out.println(a);
        //similarly a-- is the same as saying a - 1. 3-1.
        //it is a decrimental method.
        a--;
        System.out.println(a);
        //1 is added to the value of a (3+1).
        System.out.println(a+1);
        // % provides only the remainder of the quotient of d/c. 
        //(17/5=3 with remainder 2). The 2 is the returned value.
        System.out.println(d % c);
        // / provides the quotient of d/c without the remainder.
        //(17/5=3 with a remainder 2). The whole number 3 is returned.
        System.out.println(d / c);
        // % provides only the remainder of the quotient of d/b.
        //(17/4=4 with a remainder 1). The 1 is the returned value.
        System.out.println(d % b);
        // / provides the quotient of d/c without the remainder.
        //(17/4=4 with remainder 1). The whole number 4 is returned.
        System.out.println(d / b);
        //3 is divided by 17 with a quotient of 0. 4 and 17 are added to 0 
        // for a total of 21. 
        System.out.println(d + a / d + b);
        //the sum of 17 and 3 is divided by the sum of 17 and 4 .
        //resulting in 0. 20/21=0.
        System.out.println((d + a) / (d + b));
        //takes the square root of 4 and returns the absolute value.
        //the square root of 4 is 2.
        System.out.println(Math.sqrt(b));
        //raises 3 to a power 4 and returns the value.
        //3^4 = 81
        System.out.println(Math.pow(a, b));
        //takes the absolute value of the number and returns it.
        //the absolute value of -3. |-3|=3.
        System.out.println(Math.abs(-a));
        //determines which of the given values is larger and returns that
        //number's value. the larger between 3 and 4 is 4.
        System.out.println(Math.max(a, b));
        System.out.println("");
        
        //IO prompt.
        Scanner in = new Scanner(System.in);
        System.out.println("Please input two integers.");
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        System.out.println("");
        
        //Millk jars
        double milk = 5.5; // gallons
        double jarCapacity = .75; //gallons
        double completelyFilledJars = milk / jarCapacity;
        System.out.println("Number of Filled Jars: " + completelyFilledJars);
        System.out.print("Dividing two \"double\" type variables cannot \n" +
            "return an \"int\" type variable; since they have different \n" +
            "lengths of data that they hold. To fix this, change the \n" +
            "\"completelyFilledJars\" variable to be of the \"double\" type.\n");
        System.out.println("");
        
        //yards conversion
        final double YARDS = 3.5;
        final double FEET = YARDS * 3;
        final double INCHES = FEET * 12;
        //since these are units of measurement, use constants.
        System.out.println(YARDS + "\1yards are\1" + FEET + "\1feet");
        System.out.println(YARDS + "\1yards are\1" + INCHES + "\1inches");
        System.out.println("");
        
        //incrementing & deincrementing
        int x = 10;
        int y = -3;
        System.out.println("Starting X value: " + x);
        System.out.println("Starting Y value: " + y);
        
        x = x + 1; //first way to increment.
        System.out.println("X after incrementing equals: " + x);
        
        y++; //second,faster way to increment.
        System.out.println("Y after incrementing equals: " + y);
        System.out.println("");
        
        //annuity.
        System.out.println("PVann =10000*({[(1+0.08)^(20-1)-1]/0.08}/(1+0.08)^(20-1)+1)");
        
        double PVann = 10000*(((Math.pow(1+0.08,20-1)-1)/0.08)/Math.pow(1+0.08,20-1)+1);
        System.out.println(PVann);
        System.out.println("");
        
        //user input.
        System.out.print("To find the present value of an annuity, use the formula\n" +
            "PVann =PMT*({[(1+i)^(n-1)-1]/i}/(1+i)^(n-1)+1) \n" +
            "Where: \n" +
            "PMT: periodic payment \n" +
            "i: periodic interest of compund rate \n" +
            "n: number of payments \n");
        System.out.println("Please input desired variables");
        System.out.println("PMT: ");
        final int PMT = in.nextInt();
        System.out.println("i (as a decimal): ");
        final double i = in.nextDouble();
        System.out.println("n: ");
        final int n = in.nextInt();
        PVann = PMT*(((Math.pow(1+i,n-1)-1)/i)/Math.pow(1+i,n-1)+1);
        System.out.println("Present value of annuity: " + PVann);
        System.out.println("");
        
        //average age.
        int age1 = 18;
        int age2 = 35;
        int age3 = 50;
        int age4 = 44;
        
        double averageAge = (age1 + age2 + age3 + age4) / 4.00;
        System.out.println("average age: " + averageAge);
        System.out.print("The outcome of the program is 36.0 instead of  \n" +
            "the more accurate 36.75. This is because the remainder is \n" +
            "not being shown. To fix this, change 4 to a floating-point \n" +
            "number 4.00 and the fractional part will not be discarded. \n");
        System.out.println("");    
            
        //outcome of 9.1
        double probability = 8.70;
        int percentage = (int) Math.round(100 * probability);
        System.out.println((percentage));
        
        System.out.println("The outcome of the current program is 869.");
        System.out.print("This is due to some loss in data when converting \n" +
            "from a double to an int data type. To fix this, use the \n" +
            "Math.round method to round up to the next integer \n");
        System.out.println("");
        
        //substring
        String inputString = new String("The quick brown fox jumps over the lazy dog"); 
        String outputString = inputString.substring(0,1) + inputString.substring(2,3) + 
            inputString.substring(22,24) + inputString.substring(21,22) + 
            inputString.substring(24,26) + inputString.substring(16,17) +  
            inputString.substring(5,6) + inputString.substring(43-1) +  
            inputString.substring(6,7) + inputString.substring(31,32);
        System.out.println("Output String: " + outputString);    
    }
}
