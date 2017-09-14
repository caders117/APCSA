import java.util.Scanner;

public class LoveCS
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      System.out.print("How many times repeated? ");
      int limit = scan.nextInt();

	    int count = 1;
	    int sum = 0;

	    while (count <= limit){
	      System.out.println(count + " I love Computer Science!!");
    	  sum += count;
	      count++;
	    }
	    System.out.println("Printed this message " + (count - 1) + " times.");
	    System.out.println("The sum of " + 1 + " to " + limit + " is " + sum + ".");
    }
}
