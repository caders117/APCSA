import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.util.*;
import java.awt.Color;
/**
 * This program allows the user to play simon says with the finch.
 * 
 * @author Jonathon and  Cade
 * @version 12/5/17
 */

public class FinchSimon {

    static final String[] COMMANDS = {"Beak Up", "Beak Down", "Left Wing Down", "Right Wing Down"};
    static Finch finch = new Finch();

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String ans = "";

        ArrayList<String> sequence = new ArrayList<String>();
        long startTime;
        long stopTime;
        long elapsedTime;
        System.out.println("\f");
        System.out.println("Ready?");
        ans = scan.nextLine();
        boolean correct;
        int correctMoves;

        while(ans.equals("y")){
            sequence.clear();
            correctMoves = 0;
            elapsedTime = 0;
            correct = true;

            while(correct) {
                sequence.add(COMMANDS[(int) (Math.random() * 4)]);
                //      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println(sequence.get(sequence.size() - 1));
                System.out.println("Repeat all moves done so far.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                System.out.println("Start!");

                startTime = System.currentTimeMillis();
                for(int i = 0; i < sequence.size(); i++) {
                    if(correct){
                        //      System.out.println(sequence.toString());

                        while(elapsedTime <= 5000){
                            stopTime = System.currentTimeMillis();
                            elapsedTime = stopTime - startTime;
                            correct = moveCorrect(sequence.get(i));
                            if(correct){
                                correctMoves++;
                                finch.setLED(Color.GREEN, 225);
                                finch.buzz(800, 225); 
                                finch.setLED(Color.GREEN, 225);
                                finch.buzz(1500, 225); 
                                break;
                            }
                        }

                    } else {
                        break;
                    }
                }
            }

            if(correctMoves < 4)
                System.out.println("You scored " + correctMoves + ".  A memory only a mother could love.");
            else if (correctMoves < 9)
                System.out.println("You scored " + correctMoves + ".  Try harder next time.");
            else 
                System.out.println("You scored " + correctMoves + ".  Great job!");
            System.out.println(sequence.toString());
            System.out.println("Play again?");
            ans = scan.nextLine();
        }
    }

    /**
     * This method checks to see if the move the user made with the finch isimport edu.cmu.ri.createlab.terk.robot.finch.Finch;
    import java.util.*;
    import java.awt.Color;

    correct.
     * 
     * @params move - user move
     * @return true if user move is correct
     */
    static boolean moveCorrect(String move) {

        /*  System.out.println("Up: " + finch.isBeakUp());
        System.out.println("Down: " + finch.isBeakDown());
        System.out.println("Left: " + finch.isLeftWingDown());
        System.out.println("Right: " + finch.isRightWingDown()); 
         */
        if (COMMANDS[0].equals(move))
            return finch.isBeakUp();
        else if (COMMANDS[1].equals(move))
            return finch.isBeakDown();
        else if (COMMANDS[2].equals(move))
            return finch.isLeftWingDown();
        else if (COMMANDS[3].equals(move))
            return finch.isRightWingDown();
        else
            return false;
    }
}
