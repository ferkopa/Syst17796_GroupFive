public class Dealer{
                
        private int stack;
        private final Hand hand;
        
        // Create Dealer
        public Dealer() {
                stack = 5000;
                hand = new Hand();    
        }
        
        // Dealer takes pot
        public void win() {
                stack += Player.bet;
        }

        // Dealer blackjack takes pot
        public void blackJack() {
                stack += Player.bet;
        }
        
        // Dealer pays out
        public void loss() {
                stack -= Player.bet;
        }
        
        // Hand total is greater than 21 Dealer pays out
        public void bust() {
                stack -= Player.bet;
        }
        
        // Dealer's stack amount
        public int getStack() {
                return stack;
        }
        
        // Adds a card to a Dealers hand
        public void addCard(Card card) {
                hand.addCard(card);
        }
        
        // Display Dealers cards
        public String seeHand() {
                String dlrHand = "Cards:" + hand.toString();

                return dlrHand;
        }
        
        // Gets a Dealers card total
        public int getTotal() {
                return hand.calcTot();
        }
                 
        // Clear Dealers hand
        public void clear() {
                hand.clear();
        }             
} 