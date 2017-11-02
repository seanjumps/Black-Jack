import java.util.Arrays;

public class Player
{
    private Card[] hand;
    private int nextIndex;
    private int winCount;
    
    //constructor(s)
    //you write it
    
    //add temp to this player's hand
    public  void addCardToHand( Card temp )
    {
        hand[i] = temp;
        i++;
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
    		return -1;
    }
    
    //compute the value of cards in hand
    public int getHandValue()
    {
        int total=0;
        
        return total;
    }
    
    public String toString()
    {
        return "hand = " + Arrays.toString(hand) + " \n-  # wins " + winCount;
    }
}