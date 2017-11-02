import java.util.Arrays;

public class Deck
{
	private int topCardIndex;
	private Card[] stack;

	public Deck ()
	{
		//initialize data - stackOfCards - topCardIndex
		
		
		//loop through suits
			//loop through faces
				//add in a new card
		
	}

	//shuffle the stack of cards
    public void shuffle ()
	{
		//shuffle the deck
		//reset variables as needed
	}

    //return how many cards remain undealt
	public int numCardsLeft()
	{
		
	}

    //"deals" a Card from the stack
	public Card nextCard()
	{
        Card next = stack[topCardIndex];
        topCardIndex--;
		return next;
	}

	public String toString()
	{
		return Arrays.toString(stackOfCards) + "   topCardIndex = " + topCardIndex;
	} 
}