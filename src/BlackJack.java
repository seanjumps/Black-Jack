import java.util.Scanner;

public class BlackJack
{
    private Player player;
    private Dealer dealer;
    
	public BlackJack()
	{
		player = new Player();
		dealer = new Dealer();
	}

    //play a game of blackjack with one player and one dealer
	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		
		//while (want to play again)
		//{
			//shuffle the cards
			//deal cards (2 cards each)
			//(only 1 dealer card is visible)
			//while (player hand < 21 && choose hit)
			//ask player hit or stay?
			//if (player hand > 21)
				//game over, dealer wins
			//dealer hit or stay?
			//determine a winner
				//if (neither player > 21)
					//comparison
			//update win count
			//play again?
		//}

	}
	
	public static void main(String[] args)
	{
		BlackJack game = new BlackJack();
		game.playGame();
	}
}