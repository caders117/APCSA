public class Circle
{
    private double radius;

    public Circle(double r)
    {
        radius = r;
    }

    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }
  
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
}

