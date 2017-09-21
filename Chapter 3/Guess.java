/****************************************************************
//   This program simulates a game where the user 
     uesses a number from 1 to 10
     
     @author Cade
     @version 9/21/2017
//          
// ****************************************************************/
import java.util.Scanner;
import java.util.Random;

public class Guess
{
    public static void main(String[] args)
    {
        int numToGuess;       //Number the user tries to guess
        int guess;            //The user's guess
        int guesses = 0;
        int high = 0, low = 0;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        //randomly generate the  number to guess
        numToGuess = generator.nextInt(10) + 1;

        //print message asking user to enter a guess
        System.out.print("\fGuess a number between 1 and 10: ");

        //read in guess
        guess = scan.nextInt();

        while ( guess != numToGuess )  //keep going as long as the guess is wrong
        {
            if(guess > numToGuess){
                high++;
            } else {
                low++;
            }
            System.out.println(guess > numToGuess ? "Wrong guess lower: " : "Wrong guess higher: ");
            guesses++;
            //read in guess
            guess = scan.nextInt();
        }

        //print message saying guess is right
        System.out.println("Hey you got it in " + guesses + " guesses!");
        System.out.println(high + " were too high.");
        System.out.println(low + " were too low.");
    }
}
