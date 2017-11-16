package ch06;
import java.util.*;
// **********************************************************************
// DeckOfCardsTest.java
//
// Tester program to shuffle and deal a deck of Card objects
// **********************************************************************

public class Blackjack
{
    public static void main (String[] args)
    {
        DeckOfCards masterDeck = new DeckOfCards();
        Scanner scan = new Scanner(System.in);
        int playerTotal = 0, compTotal = 0;
        String playerAction;
        System.out.println("\fWould you like to play BlackJack?");
        masterDeck.shuffle(); // put Card objects in random order
        ArrayList<Card> playerDeck = new ArrayList<>();
        ArrayList<Card> compDeck = new ArrayList<>();
        for(int i = 0; i < 2; i++){
            playerDeck.add(masterDeck.dealCard());
            System.out.println(masterDeck.dealCard().getValue());
            System.out.println(playerTotal += playerDeck.get(playerDeck.size() - 1).getValue());
            compDeck.add(masterDeck.dealCard());
            compTotal += compDeck.get(compDeck.size() - 1).getValue();
        }
        System.out.println("Your cards are: " + playerDeck.get(0) + " and " + playerDeck.get(1));
        if(playerTotal == 21)
            System.out.println("BlackJack!");
        System.out.print("(H)it or (S)tand: ");
        playerAction = scan.next();
        while(playerAction.equalsIgnoreCase("H")){
            if(playerAction.equalsIgnoreCase("H")){
                playerDeck.add(masterDeck.dealCard());
                playerTotal += playerDeck.get(playerDeck.size() - 1).getValue();
                System.out.print("Your cards are: ");
                for(int i = 0; i < playerDeck.size(); i++)
                    System.out.print(playerDeck.get(i) + (i != playerDeck.size() ? ", " : "\n"));
                System.out.println(playerTotal);
                if(playerTotal > 21){
                    System.out.println("Busted");
                    break;
                }
            } 
            System.out.print("(H)it or (S)tand: ");
            playerAction = scan.next();
        }
        
    }

}
