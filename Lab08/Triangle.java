//DEREK CAMPBELL
//DLB832
/**
 * Write a description of class Triangle here.
 *
 * @author (Derek Campbell)
 * @version (02/26/2020)
 */
public class Triangle
{
    // instance variables. Store the coordinates for the triangle's points.
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    /**
     * Constructor for objects of class Triangle
     */
    public Triangle(double _x1, double _y1, double _x2, double _y2, double _x3, double _y3)
    {
        // initialise instance variables
        x1 = _x1;
        y1 = _y1;
        x2 = _x2;
        y2 = _y2;
        x3 = _x3;
        y3 = _y3;
    }

    /**
     * Finds the length of side 1 from (x1,y1) to (x2,y2).
     * @return    the length of side 1
     */
    public double getSide1Length()
    {
        return Math.sqrt( Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2) );//a
    }
    
    /**
     * Finds the length of side 2 from (x2,y2) to (x3,y3).
     * @return    the length of side 2.
     */
    public double getSide2Length()
    {
        return Math.sqrt( Math.pow((x2 - x3),2) + Math.pow((y2 - y3),2) );//b
    }
    
    /**
     * Finds the length of side 3 from (x3,y3) to (x1,y1).
     * @return    the length of side 3.
     */
    public double getSide3Length()
    {
        return Math.sqrt( Math.pow((x3 - x1),2) + Math.pow((y3 - y1),2) );//c
    }
    
    /**
     * Finds the angle of the first point (x1,y1).
     * @return    the angle of point 1.
     */
    public double getAngle1()
    {
        //Math.acos calls the inverse Cosine.
        double cosA = Math.acos((Math.pow(getSide2Length(),2) + Math.pow(getSide3Length(),2)
               - Math.pow(getSide1Length(),2)) / (2 * getSide2Length() * getSide3Length()));
        return Math.toDegrees(cosA);
        //CosA= (b^2 + c^2 -a^2) / (2 * b * c)
    }
    
    /**
     * Finds the angle of the first point (x2,y2).
     * @return    the angle of point 2.
     */
    public double getAngle2()
    {
        //Math.acos calls the inverse Cosine.
        double cosB = Math.acos((Math.pow(getSide1Length(),2) + Math.pow(getSide3Length(),2)
               - Math.pow(getSide2Length(),2)) / (2 * getSide1Length() * getSide3Length()));
        return Math.toDegrees(cosB);
        //CosB= (a^2 + c^2 -b^2) / (2 * a * c)
    }
    
    /**
     * Finds the angle of the first point (x3,y3).
     * @return    the angle of point 3.
     */
    public double getAngle3()
    {
        //Math.acos calls the inverse Cosine.
        double cosC = Math.acos((Math.pow(getSide1Length(),2) + Math.pow(getSide2Length(),2)
               - Math.pow(getSide3Length(),2)) / (2 * getSide1Length() * getSide2Length()));
        return Math.toDegrees(cosC);
        //CosC= (a^2 + b^2 -c^2) / (2 * a * b)
    }
    
    /**
     * Finds the total of the lengths of all 3 sides.
     * @return    the perimeter of the triangle.
     */
    public double getPerimeter()
    {
        double perim = getSide1Length() + getSide2Length() + getSide3Length();
        return perim;//side 1 + side 2 + side 3
    }
    
    /**
     * Finds the total inside area of the triangle.
     * @return the area of the triangle.
     */
    public double getArea()
    {
        //Heron's theorum: s = (a+b+c)/c
                        //Area = sqrt(s(s-a)(s-b)(s-c))
        double s = (getPerimeter() / 2); 
        double area = Math.sqrt((s * (s - getSide1Length()) * (s - getSide2Length()) * (s - getSide3Length()))); 
        return area;
        //area = 1/2(base*height)
        //c needs to be the longest side which is side 2 in this case?
    }
}
