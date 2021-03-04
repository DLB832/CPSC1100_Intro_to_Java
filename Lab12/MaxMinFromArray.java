//DLB832
//DEREK CAMPBELL
import java.util.Random;
import java.util.Arrays;
/**
 * Write a description of class MaxMinFromArray here.
 *
 * @author (Derek Campbell)
 * @version (04/25/2020)
 */
public class MaxMinFromArray
{
    // instance variables 
    final int LENGTH = 20;
    final int ROWS = 10;
    final int COLUMNS = 10;
    private int[] array1D;//1 dimensional array 
    private int[][] array2D;//2 dimensional array.
    Random rd = new Random();//creates a random object between 1-100. 
    /**
     * Constructor for objects of class MaxMinFromArray
     */
    public MaxMinFromArray()
    {
        // initialise instance variables
        array1D = new int[LENGTH];
         for (int i = 0; i < array1D.length;)
        {
            int randomNum = rd.nextInt(101);//generates a random number
            if (randomNum > 0) 
            {
                array1D[i] = randomNum;//makes the value in i the random number.
                System.out.println(array1D[i]);
                i++;
            }
        }
        System.out.println("");  
        
        array2D = new int[ROWS][COLUMNS];
        for(int i = 0; i < array2D.length; i++)
        {
            for (int h = 0; h < array2D[i].length; h++)
            {
                int randomNum = rd.nextInt(101);
                if(randomNum > 0)
                {
                    array2D[i][h] = randomNum;
                    System.out.println(array2D[i][h]);
                }
                
            }
        }
    }

    /**
     * An Accessor method which finds the larget number in an array.
     *
     * @return    the largest number in Array1D.
     */
    public int getMaxFromArray1D()
    {
        //enhanced loops work like (int i =0; i < legth; i++)
        int largest = 0;
        for (int element : array1D)//for every element in the array. 
        {                           //doesn't look at values, rather elements.
            if (element > largest)
            {
                largest = element;
            }
        }
        return largest;
    }
    
    /**
     * An Accessor method which finds the smallest number in an array.
     *
     * @return    the largest number in Array1D.
     */
    public int getMinFromArray1D()
    {
        // put your code here
        int smallest = 100;
        for (int element : array1D)
        {
            if (element < smallest)
            {
                smallest = element;
            }
        }
        return smallest;
    }
    
    /**
     * An Accessor method which finds the largest number in a 2D array.
     *
     * @return    the largest number in Array 2D.
     */
    public int getMaxFromArray2D()
    {
        // put your code here
        int largest = 0;
        for(int elementi[] : array2D)//need []. for element in row.
        {
            for (int elementh : elementi)//for element in column IN A row.
            {
                if (elementh > largest)//if that element is larger...
                {
                    largest = elementh;//becomes new largest value.
                }
            }
        }
        return largest;
    }
    
    /**
     * An Accessor method which finds the smallest number in a 2D array.
     *
     * @return    the smallest number in Array 2D.
     */
    public int getMinFromArray2D()
    {
        // put your code here
        int smallest = 100;
        for(int elementi[] : array2D)
        {
            for (int elementh : elementi)
            {
                if (elementh < smallest)
                {
                    smallest = elementh;
                }
            }
        }
        return smallest;
    }
}
