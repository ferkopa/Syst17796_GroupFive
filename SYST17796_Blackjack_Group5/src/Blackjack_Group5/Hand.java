/**
 * SYST 17796 Project Summer 2021 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * 
 * Main class to display the cards to the user. There is no user feedback
 * as to properly simulate a blackjack game in real life, you get random cards.
 * Cards are generated as soon as the user presses run program.
 * @modifier Paulina Ferko, August 19 2021
 */

package Blackjack_Group5;

public class Hand {
        
    public static void main(String[] args){
        //initializes temporary variables
        String suit = "";
        int number = 0;
        int total = 0;
        
        //holds values from the methods it calls
        String suitType = suitSet(suit);
        String cardName = cardSet(number);
        String suitType2 = suitSet(suit);
        String cardName2 = cardSet(number);
        
        //print out method to show generated cards to user.
       printOut(suitType, cardName, suitType2, cardName2);
        
    }
    //method to generate a random integer to assign to a random suit set
    public static String suitSet(String suitType){
        int suitNumber = (int)(Math.random() * 4);
        if(suitNumber == 0){
            suitType = "Hearts";
        }else if(suitNumber == 1){
            suitType = "Diamonds";
        }else if(suitNumber == 2){
            suitType = "Spades"; 
        }else{
            suitType = "Clubs";
        }
      return suitType;  
    }
    //method to assign a card value - displayed as a string to user
    public static String cardSet(int cardNum){
        String cardName = "";
        cardNum = (int)(Math.random() * 14) + 1;
        
        if(cardNum == 1 || cardNum == 11){
            cardName = "Ace";
        }else if(cardNum == 12){
            cardName = "Jack";
        }else if(cardNum == 13){
            cardName = "Queen";
        }else if(cardNum == 14){
            cardName = "King";
        }else{
            cardName = String.valueOf(cardNum);
        }
        
        return cardName;
    }
    //print out method for the user to see on screen
    public static void printOut(String suitType, String cardName, 
        String suitType2, String cardName2){
        
        Card card1 = new Card(suitType, cardName);
        Card card2 = new Card(suitType2, cardName2);
        
        System.out.println("Your cards have been randomly generated.");
        System.out.println("Here they are!\n");
        
        System.out.print(card1.toString() + ", and ");
        System.out.println(card2.toString());
        
    }
	
}
