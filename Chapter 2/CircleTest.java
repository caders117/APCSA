import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = scan.nextDouble();
        Circle circle1 = new Circle(r);
        double area = circle1.getArea();
        System.out.println("circle1 // radius = " + r + " area = " + area);
        double circumference = circle1.getCircumference();
        System.out.println("circumference = " + circumference);
    
        System.out.println("Enter another radius: ");
        r = scan.nextDouble();
        Circle circle2 = new Circle(r);
        System.out.println("circle2 // area = " + circle2.getArea() + " circumference = " + circle2.getCircumference());
    }
}

