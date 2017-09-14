import java.util.Scanner;

public class Chars
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      System.out.print("Give me a string of characters: ");
      String input = scan.nextLine();
      for(int i = 0; i < input.length(); i++){
        System.out.println(input.charAt(i));
      }
      
    }
}
