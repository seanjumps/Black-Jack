import java.util.Arrays;

public class Dealer
{
	private Deck deckOfCards;
    private Card[] hand;	
    private int nextIndex;
    private int winCount;
    
    //constructor(s)
    public Dealer()
    {
    		deckOfCards = new Deck(); 
    		hand = new Card[11];
    		nextIndex = 0;
    		winCount = 0;
    		
    }
    
    //add temp to this player's hand
    public void addCardToHand( Card temp )
    {
        hand[nextIndex] = temp;
        nextIndex++;
    }
    
    //"discard" the Player's hand when a new round begins
    public  void resetHand( )
    {
        
    }
    
    //increment the player's win count
    public void countWin()
    {
        
    }
    
    //return this player's win count
    public int getWinCount()
    {
    		return -1;
    }
    
    //return the number of cards in hand
    public int getHandSize()
    {
    }
    
    //compute the value of your cards
    public int getHandValue()
    {
        int total=0;
        
        return total;
    }
    
    public String toString()
    {
        return "hand = " + Arrays.toString(hand) + " \n-  # wins " + winCount;
    }

	//shuffle the deck
    public void shuffleDeck()
    {
        
    }

	//get the next card from the deckOfCards and return it
    public Card dealCard()
    {
        
    }


    //return true if the dealer hits, false if not
	public boolean hit()
	{

	}
}