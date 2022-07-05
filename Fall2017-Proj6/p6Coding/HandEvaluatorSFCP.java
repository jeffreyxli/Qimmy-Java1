package p6Coding;

import java.util.Arrays;

public class HandEvaluatorSFCP {
	//ALL OF THESE ARE PASSED AN ARRAY OF LENGTH 5



	//Cluster 1: Think about how a helper might be useful for these...
	public static boolean hasPair(Card[] cards) 
	{
		int count = 0;

		for (int i = 0; i <= 4 ;i++)
		{ 
			count = 0;
			for (int j = i+1 ; j <= 4 ; j++)
			{
				if (cards[i].getValue() == (cards[j].getValue()))
				{ 
					count++;
				}

				if (count >= 1)
				{
					return true;
				}
			}
		}
		return false;
	}

	public static boolean hasThreeOfAKind(Card[] cards)
	{
		int count = 0;

		for (int i = 0; i <= 4 ;i++)
		{ 
			count = 0;
			for (int j = i+1 ; j <= 4 ; j++)
			{
				if (cards[i].getValue() == (cards[j].getValue()))
				{ 
					count++;
				}

				if (count >= 2)
				{
					return true;
				}
			}
		}
		return false;
	}


	public static boolean hasFourOfAKind(Card[] cards) {
		int count = 0;

		for (int i = 0; i <= 4 ;i++)
		{ 
			count = 0;
			for (int j = i+1 ; j <= 4 ; j++)
			{
				if (cards[i].getValue() == (cards[j].getValue()))
				{ 
					count++;
				}

				if (count >= 3)
				{
					return true;
				}
			}
		}
		return false;
	}


	public static boolean hasFiveOfAKind(Card[] cards) 
	{
		int count = 0;

		for (int i = 0; i <= 4 ;i++)
		{ 
			count = 0;
			for (int j = i+1 ; j <= 4 ; j++)
			{
				if (cards[i].getValue() == (cards[j].getValue()))
				{ 
					count++;
				}

				if (count >= 4)
				{
					return true;
				}
			}
		}
		return false;
	}




	//Cluster 2
	public static boolean hasRainbow(Card[] cards) {
		{
			int count = 0;

			for (int i = 0; i <= 4 ;i++)
			{ 
				count = 0;
				for (int j = i+1 ; j <= 4 ; j++)
				{
					if (cards[i].getSuit() == (cards[j].getSuit()))
					{ 
						count++;
					}

					if (count >= 1)
					{
						return false;
					}
				}
			}
			return true;
		}
	}

	public static boolean hasStraight(Card [] cards) {
		Card low = cards[0];
		Card high = cards[0];
		for(int a = 1; a < cards.length; a++)
		{
			if(cards[a].getValue() > high.getValue())
			{
				high = cards[a];
			}
		}
		for(int a = 1; a < cards.length; a++)
		{
			if(cards[a].getValue() < low.getValue())
			{
				low = cards[a];
			}
		}
		int first = high.getValue() - 1;
		int second = high.getValue() - 2;
		int third = high.getValue() - 3;
		int firstC = 0;
		int secondC = 0;
		int thirdC = 0;
		for(int a = 0; a < cards.length; a++)
		{
			if(cards[a].getValue() == first) 
			{
				firstC++;
			}
			else if(cards[a].getValue() == second)
			{
				secondC++;
			}
			else if(cards[a].getValue() == third)
			{
				thirdC++;
			}
		}
		if(firstC == 1 && secondC == 1 && thirdC == 1 && high.getValue() == low.getValue() + 4)
		{
			return true;
		}
		else if(high.getValue() == 9 && low.getValue() == 1 && firstC == 1 && secondC == 1 && thirdC == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

	public static boolean hasFlush(Card[] cards) {
		int counter = 1;


		for (int i = 0; i < cards.length - 1; i++) {
			if (cards[i].getSuit() == cards[i+1].getSuit()) {
				counter++;
			}
		}
		if (counter == 5) {
			return true;
		}

		return false;
	}




	//Cluster 3: Think about how to make use of existing methods to
	//           make the following ones easier to write...
	public static boolean hasStraightRainbow(Card[] cards) {
		if(hasRainbow(cards) == true && hasStraight(cards) == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean hasStraightFlush(Card[] cards) {
		if(hasFlush(cards) == true && hasStraight(cards) == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean hasTwoPair(Card[] cards) {
		int count = 0;
		int stored = 0;
		for (int i = 0; i <= 4 ;i++)
		{
			for (int j = i+1 ; j <= 4 ; j++)
			{
				if (cards[i].getValue() == (cards[j].getValue()) && cards[i].getValue() != stored)
				{ 
					count++;
					stored = cards[i].getValue();
				}
				if(count == 2)
				{
					return true;
				}
			}
		}
		return false;
	}




	//Challenge
	public static boolean hasFullHouse(Card[] cards) {
		throw new RuntimeException("You need to implement this...");
	}




}

