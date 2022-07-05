package p6Coding;

import java.util.ArrayList;

public class Deck {

	//You need to use this ArrayList<Card> structure to hold the deck
	//  
	//Your cannot use regular arrays in this class other than in the
	//  deal method, which needs to return an array
	private ArrayList<Card> cards;
	
	

	public Deck() {
		cards = new ArrayList<Card>(45);
		for(int suit = 0; suit < 5; suit++)
		{
			for(int value = 1; value < 10; value++)
			{
				cards.add(new Card(value, suit));
			}
		}
	}

	public Deck(Deck other) {
		ArrayList<Card> copied = new ArrayList<Card>(other.cards);
		cards = copied;
	}

	public Card getCardAt(int position) {
		return cards.get(position);
	}

	public int getNumCards() {
		return cards.size();
	}


	public Card[] deal(int numCards) {
		Card[] deal = new Card[numCards];
		for(int i = 0; i < numCards; i++)
		{
			deal[i] = cards.get(i);
		}
		for(int i = 0; i < numCards; i++)
		{
			cards.remove(0);
		}
		return deal;
	}


	public void cut(int position) throws StarDeckException {
		ArrayList<Card> top = new ArrayList<Card>();
		ArrayList<Card> bot = new ArrayList<Card>();
		ArrayList<Card> cut = new ArrayList<Card>(45);
		for (int i = 0; i < position; i++)
		{
			top.add(cards.get(i));
		}
		for (int a = position; a < cards.size(); a++)
		{
			bot.add(cards.get(a));
		}
		if(top.size() < 3 || bot.size() < 3)
		{
			throw new StarDeckException("Too few cards in one part of the cut.");
		}
		else 
		{
			for(int x = 0; x < bot.size(); x++)
			{
				cut.add(bot.get(x));
			}
			int topS = 0;
			while(topS < top.size())
			{
				cut.add(top.get(topS));
				topS++;
			}
			cards = cut;
		}
	}
	
	
	
	
	public void shuffle() {
		throw new RuntimeException("Challenge problem...");
	}
	

}
