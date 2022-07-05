package p6Coding;

import java.util.ArrayList;

public class HandEvaluatorPatrickjack {
	//Each of these is passed a reference to an ArrayList<Card> object 
	//  with "UNKNOWN" length (so you'll need to "ask" it).

	public static int eval(ArrayList<Card> hand) {
		int value = 0;
		for(int a = 0; a < hand.size(); a++)
		{
			if(hand.get(a).getValue() == 5)
			{
				value += 15;
			}
			else 
			{
			value += hand.get(a).getValue();
			}
		}
		if(hand.size() == 2 && value == 6 && (hand.get(0).getValue() == 2 || hand.get(0).getValue() == 4)) 
		{
			return 22;
		}
		else if(hand.size() == 2 && value == 15 && (hand.get(0).getValue() == 9 || hand.get(0).getValue() == 6))
		{
			return 21;
		}
		else if(value > 21)
		{
			for(int a = 0; a < hand.size(); a++)
			{
				if(value > 21 && hand.get(a).getValue() == 5)
				{
					value -= 10;
				}
			}
			if(value > 21)
			{
				return 0;
			}
			else 
			{
				return value;
			}
		}
		else 
		{
			return value;
		}
	}


	public static boolean houseWins(ArrayList<Card> player, ArrayList<Card> dealer) {
		int playerV = eval(player);
		int houseV = eval(dealer);
		if(playerV == houseV)
		{
			return false;
		}
		else if(playerV > houseV)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}
