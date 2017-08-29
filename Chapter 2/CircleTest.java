import java.util.Scanner;
/***************************************************************
 * This is the driver program to test our Circle class
 * Create 3 different circle objects with the radius supplied 
 * by the user.
 * @author Cade
 * @versi0n August 29, 2017
****************************************************************/
public class CircleTest
{
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        /*
         * Prompt user for radius and create Circle 
         * object.  Print area and circumference.
         */
        System.out.print("\fEnter the radius: ");
        double r = scan.nextDouble();
        Circle circle1 = new Circle(r);
        double area = circle1.getArea();
        System.out.println("circle1 // radius = " + r + " area = " + area + " sq. units");
        double circumference = circle1.getCircumference();
        System.out.println("circumference = " + circumference + " units\n");
    
        /*
         * Prompt user for radius and create Circle 
         * object.  Print area and circumference.
         */
        System.out.print("Enter another radius: ");
        r = scan.nextDouble();
        Circle circle2 = new Circle(r);
        System.out.println("circle2 // area = " + circle2.getArea() + " sq. units\ncircumference = " 
                            + circle2.getCircumference() + " units\n");
        
        /*
         * Prompt user for radius and create Circle 
         * object.  Print area and circumference.
         */
        System.out.print("Enter another radius: ");
        r = scan.nextDouble();
        Circle circle3 = new Circle(r);
        System.out.println("circle3 // area = " + circle3.getArea() + " sq. units\ncircumference = " 
                            + circle3.getCircumference() + " units\n");
    }
}

