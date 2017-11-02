public class StringStuff {
	public static void main(String[]args)
	{
		for(char c = 0;c < 65000;c++)
		{
			System.out.print(c);
			if (c % 50 == 0)
				System.out.println();
		}
		int spade = '♠';
		System.out.println(spade);
		
		//♠♡♢♣♤♥♦♧
	}
}