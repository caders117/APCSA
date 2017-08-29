/***************************************************************
 * Circle.java
 * This class represents a Circle object.  Circle objects
 * "know their radius and can "do" two things.  They can
 * calculate and return their area and circumference.
 * @author Cade
 * @versi0n Augus 29, 2017
****************************************************************/
public class Circle
{
    private double radius;
    
    /**
     * Constructor method to create a Circle object.
     * @param r The radius
     */
    public Circle(double r)
    {
        radius = r;
    }

    /**
     * This method calculates and returns the circumference
     * of a circle.
     * @return The circumference of the circle.
     */
    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }
  
    /**
     * This method calculates and returns the area
     * of a circle.
     * @return The area of the circle.
     */
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
}
