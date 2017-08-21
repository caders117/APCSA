//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls 
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;

public class Paint
{
    public static void main(String[] args)
    {
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal
        int length, width, height, numWindows, numDoors;
        double totalSqFt;
        double paintNeeded;
        Scanner scan = new Scanner(System.in);

        System.out.print("Length of room: ");
        length = scan.nextInt();

        System.out.print("Width of room: ");
        width = scan.nextInt();

        System.out.print("Height of room: ");
        height = scan.nextInt();
        
        System.out.print("Number of windows: ");
        numWindows = scan.nextInt();
        
        System.out.print("Number of Doors: ");
        numDoors = scan.nextInt();

        totalSqFt = (2 * width * height + 2 * length * height) - (20 * numDoors + 15 * numWindows);

        paintNeeded = totalSqFt / COVERAGE;
        
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height " + height);
        System.out.println("Windows: " + numWindows);
        System.out.println("Doors: " + numDoors);
        System.out.println("Gallons needed: " + paintNeeded);
        
    }
}

