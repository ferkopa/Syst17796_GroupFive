/**
 * SYST 17796 Project Summer 2021 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * The purpose of the card game is to generate the user's card randomly
 * and assign a card number/face to a suit type i.e. Ace of Spades
 *
 * @modifier Paulina Ferko, August 19 2021
 */
package Blackjack_Group5;

public class Card {

    //suits set in place so that no other values can be displayed
    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", 
        "Clubs"};
    
    //variables to be used to set values from main class
    private String suit; //clubs, spades, diamonds, hearts
    private String cardNum; //1-14
    
    
    public Card(){} //no args constructor
    public Card(String suit, String cardNum){ //constructor with args
        this.suit = suit;
        this.cardNum = cardNum;
    } 
    
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {  
        //sets the string variable suit to one of the SUITS final array values
        
        if(suit.equals(SUITS[0]) || suit.equals(SUITS[1]) || 
                suit.equals(SUITS[2]) || suit.equals(SUITS[3])){
            this.suit = suit;   
        }else{
            throw new IllegalArgumentException("Invalid suit type!");
        }
    }

    public String getCardNum() {
        return cardNum;
    }
    public void setCardNum(String cardNum) {
        //check card values to see if string is null or empty
        if(cardNum.equals("") || cardNum == null){
            throw new IllegalArgumentException("Invalid Number!");
        }else{
            this.cardNum = cardNum;
        }
    }
    public String toString(){
        return String.format("%s of %s", this.cardNum, this.suit);
    }    
    
}
