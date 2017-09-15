import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      int num;
      int total = 0;
      
      System.out.print("Enter a positive integer: ");
      num = scan.nextInt();
      
      while(num <= 0){
      System.out.print("Enter a POSITIVE integer: ");
      num = scan.nextInt();
      }
      
      if(num != 0){
        total = 1;
        
        for(int i = 1; i <= num; i++)
          total *= i;
      }
      
      System.out.println(total);
    }
}