/****************************************************************
//   Simulates a rock paper scissors game between the player
//   and the computer.
//
//   @author Cade Richard
//   @version 9/7/2017
// ****************************************************************/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay = "U";  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number for computer play

        Scanner scan = new Scanner(System.in);
        while(true){
            //Get player's play -- note that this is stored as a string
            System.out.print("Enter your play (R, P, or S) (Q to quit): ");
            personPlay = scan.nextLine();

            //Make player's play uppercase for ease of comparison
            personPlay = personPlay.toUpperCase();
            if(personPlay.equals("Q"))
                break;
            System.out.println(personPlay);

            //Generate computer's play (0,1,2). Use the Math.random() method
            computerInt = (int)(Math.random() * 3);

            //Translate computer's randomly generated play to string
            if (computerInt == 0)
                computerPlay = "R";
            else if (computerInt == 1)
                computerPlay = "P";
            else if (computerInt == 2)
                computerPlay = "S";

            System.out.println("Computer plays " + computerPlay);

            if (personPlay.equals(computerPlay))  
                System.out.println("It's a tie!");
            else if (personPlay.equals("R"))
                if (computerPlay.equals("S"))
                    System.out.println("Rock crushes scissors.  You win!!");
                else
                    System.out.println("Paper covers rock.  You lost :(");
            else if (personPlay.equals("S"))
                if (computerPlay.equals("R"))
                    System.out.println("Rock crushes scissors.  You lost :(");
                else
                    System.out.println("Scissors cut paper.  You win!!");
            else 
                if (computerPlay.equals("R"))
                    System.out.println("Paper covers rock.  You win!!");
                else
                    System.out.println("Scissors cut paper.  You lost :(");
        }
        System.out.println("Thank you for playing!  Bye now.")
    }
}
