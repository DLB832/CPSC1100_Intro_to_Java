// DEREK CAMPBELL
// DLB832
//DO THIS FOR EVERY ASSIGNMENT THIS SEMESTER!!! (worth 5 pts)
import java.awt.Rectangle;

 public class Multitable 
{
    public static void main(String[] args) {//begin main
        //the following line of code prints a message to the screen
        System.out.println("Addition Table");
        char ch1 = '+';
        char ch2 = '*';
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;
        //set the integer starting points.
        System.out.printf("%c|%d %d %d %d %d %d %d %d %d %n",ch1,num1,num2,
        num3, num4, num5, num6, num7, num8, num9);
        /* %c:calls the set character sysmbol. Use the above to set the one-
         * to-one relationship within the arguments.
         * %2d sets the next digit 2 spaces over. Helps with aligning.
         * %n new line
         */
        System.out.println("-|-----------------------");
        System.out.printf("1|%d %d %d %d %d %d %d %d %d %n", num1+1, num2+1,
        num3+1, num4+1, num5+1, num6+1, num7+1, num8+1, num9+1);
        System.out.printf("2|%d %d %d %d %d %d %d %d %d %n", num1+2, num2+2,
        num3+2, num4+2, num5+2, num6+2, num7+2, num8+2, num9+2);
        System.out.printf("3|%d %d %d %d %d %d %d %d %d %n", num1+3, num2+3,
        num3+3, num4+3, num5+3, num6+3, num7+3, num8+3, num9+3);
        System.out.printf("4|%d %d %d %d %d %d %d %d %d %n", num1+4, num2+4,
        num3+4, num4+4, num5+4, num6+4, num7+4, num8+4, num9+4);
        System.out.printf("5|%d %d %d %d %d %d %d %d %d %n", num1+5, num2+5,
        num3+5, num4+5, num5+5, num6+5, num7+5, num8+5, num9+5);
        System.out.printf("6|%d %d %d %d %d %d %d %d %d %n", num1+6, num2+6,
        num3+6, num4+6, num5+6, num6+6, num7+6, num8+6, num9+6);
        System.out.printf("7|%d %d %d %d %d %d %d %d %d %n", num1+7, num2+7,
        num3+7, num4+7, num5+7, num6+7, num7+7, num8+7, num9+7);
        System.out.printf("8|%d %d %d %d %d %d %d %d %d %n", num1+8, num2+8,
        num3+8, num4+8, num5+8, num6+8, num7+8, num8+8, num9+8);
        System.out.printf("9|%d %d %d %d %d %d %d %d %d %n", num1+9, num2+9,
        num3+9, num4+9, num5+9, num6+9, num7+9, num8+9, num9+9);
        System.out.printf("%n");
        System.out.println("Multiplication Table");
        System.out.printf("%c|%d %d %d %d %d %d %d %d %d %n",ch2,num1,num2,
        num3, num4, num5, num6, num7, num8, num9);
        // ch2 calls for character 2 variable
        System.out.println("-|-----------------------");
        System.out.printf("1|%d %d %d %d %d %d %d %d %d %n", num1*1, num2*1,
        num3*1, num4*1, num5*1, num6*1, num7*1, num8*1, num9*1);
        System.out.printf("2|%d %d %d %d %d %d %d %d %d %n", num1*2, num2*2,
        num3*2, num4*2, num5*2, num6*2, num7*2, num8*2, num9*2);
        System.out.printf("3|%d %d %d %d %d %d %d %d %d %n", num1*3, num2*3,
        num3*3, num4*3, num5*3, num6*3, num7*3, num8*3, num9*3);
        System.out.printf("4|%d %d %d %d %d %d %d %d %d %n", num1*4, num2*4,
        num3*4, num4*4, num5*4, num6*4, num7*4, num8*4, num9*4);
        System.out.printf("5|%d %d %d %d %d %d %d %d %d %n", num1*5, num2*5,
        num3*5, num4*5, num5*5, num6*5, num7*5, num8*5, num9*5);
        System.out.printf("6|%d %d %d %d %d %d %d %d %d %n", num1*6, num2*6,
        num3*6, num4*6, num5*6, num6*6, num7*6, num8*6, num9*6);
        System.out.printf("7|%d %d %d %d %d %d %d %d %d %n", num1*7, num2*7,
        num3*7, num4*7, num5*7, num6*7, num7*7, num8*7, num9*7);
        System.out.printf("8|%d %d %d %d %d %d %d %d %d %n", num1*8, num2*8,
        num3*8, num4*8, num5*8, num6*8, num7*8, num8*8, num9*8);
        System.out.printf("9|%d %d %d %d %d %d %d %d %d %n", num1*9, num2*9,
        num3*9, num4*9, num5*9, num6*9, num7*9, num8*9, num9*9);
        System.out.printf("%n");
        
        System.out.println("Rectangle Method Practice");
        
        Rectangle box = new Rectangle(5,10,20,30); /*creates an object
        called box with arguements.*/
        double X = box.getX();
        System.out.println("X= "+X);
        double Y = box.getY();
        System.out.println("Y= "+Y);
        double width = box.getWidth();/* declares a variable "width" which
        is in the rectangle object*/
        System.out.println("Width= "+width);
        double height = box.getHeight();
        System.out.println("Height= "+height);
        //time to use modifiers!
        box.translate(10,15);//moves the box along the X and Y axis.
        System.out.println(box.getBounds());/*prints out the boundaries of
        the box*/
        box.resize(5,-5);//resize the box 
        System.out.println(box);
        box.grow(15,25);//resizes vertically and horizontally.
        System.out.println(box);
        box.setBounds(30,45,10,15);
        System.out.println(box);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    } //end main
}
