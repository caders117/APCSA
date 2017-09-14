import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args)
    {
      String isAre = "are ";
      Scanner scan = new Scanner(System.in);
      System.out.print("Please enter a positive integer: ");
      String input = scan.nextLine();
      int even = 0, odd = 0, zero = 0;
      for(int i = 0; i < input.length(); i++){
        if(Character.getNumericValue(input.charAt(i)) == 0)
          zero++;
        else if(Character.getNumericValue(input.charAt(i)) % 2 == 0)
          even++;
        else
          odd++;
      }
      if(even == 1)
        System.out.println("There is " + even + " even digit.");
      else 
        System.out.println("There are " + even + " even digits.");
      if(even == 1)
        System.out.println("There is " + odd + " even digit.");
      else 
        System.out.println("There are " + odd + " even digits.");
      if(even == 1)
        System.out.println("There is " + zero + " even digit.");
      else 
        System.out.println("There are " + zero + " even digits.");
     
    }
}
