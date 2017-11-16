package ch06;
// **********************************************************************
// Card.java
//
// Represents a Card with a face and a suit.
// **********************************************************************
public class Card
{
    private String face;
    private String suit;
    private int value;
    public Card (String cardFace, String cardSuit, int cardVal)
    {
        face = cardFace;
        suit = cardSuit;
        value = cardVal;
    }

    public String toString(){

        return face + " of " + suit;
    }
    
    public String getFace(){
        return face;
    }
    
    public int getValue(){
        return value;
    }
}
