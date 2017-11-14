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
        System.out.println("Would you like to play BlackJack?");
        masterDeck.shuffle(); // put Card objects in random order
        ArrayList<Card> playerDeck = new ArrayList<>();
        ArrayList<Card> compDeck = new ArrayList<>();
        for(int i = 0; i < 2; i++){
            playerDeck.add(masterDeck.dealCard());
            compDeck.add(masterDeck.dealCard());
        }
        System.out.println("Your cards are: " + playerDeck.get(0) + " and " + playerDeck.get(1));

    }
}
