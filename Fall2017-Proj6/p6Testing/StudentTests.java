package p6Testing;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

import p6Coding.Card;
import p6Coding.Deck;
import p6Coding.HandEvaluatorSFCP;
import p6Coding.HandEvaluatorPatrickjack;

public class StudentTests {

	@Test
	public void testExampleTest_SinglePairTest() {
		Card[] testHand = new Card[5];
		testHand[0] = new Card(1,1);
		testHand[1] = new Card(2,1);
		testHand[2] = new Card(3,1);
		testHand[3] = new Card(4,1);
		testHand[4] = new Card(5,1);
		assertFalse(HandEvaluatorSFCP.hasPair(testHand));
	}


	@Test
	public void testExampleTest_SingleRainbowTest() {
		Card testHand[] = new Card[5];

		testHand[0] = new Card(4,0);
		testHand[1] = new Card(5,1);
		testHand[2] = new Card(5,2);
		testHand[3] = new Card(5,3);
		testHand[4] = new Card(9,4);
		assertTrue(HandEvaluatorSFCP.hasRainbow(testHand));
	}


	@Test
	public void testExampleTest_SinglePatrickjackEvalTest() {
		ArrayList<Card> player = new ArrayList<Card>();
		player.add(new Card(3,1));
		player.add(new Card(2,1));

		assertEquals(5, HandEvaluatorPatrickjack.eval(player));
	}
	@Test
	public void testExampleTest_houseWinsTest() {
		ArrayList<Card> player = new ArrayList<Card>();
		ArrayList<Card> dealer = new ArrayList<Card>();
		
		player.add(new Card(4,0));
		player.add(new Card(2,0));
		dealer.add(new Card(6,0));
		dealer.add(new Card(9,0));
		
		assertFalse(HandEvaluatorPatrickjack.houseWins(player, dealer));
	}


	@Test
	public void testExampleTest_DeckDealCardsLengthTest() {
		Deck theDeck = new Deck();
		Card[] cards = theDeck.deal(10);
		assertEquals(10, cards.length);
	}
	
	@Test
	public void testExampleTest_DeckCutTest()
	{
		Deck theDeck = new Deck();
		theDeck.cut(4);
		assertEquals(45, theDeck.getNumCards());
	}

	//You will add many other tests here.  You can also modify the ones above.
	@Test
	public void testExampleTest_ThreeOfAKindTest() {
		Card testHand[] = new Card[5];

		testHand[0] = new Card(4,0);
		testHand[1] = new Card(5,1);
		testHand[2] = new Card(5,2);
		testHand[3] = new Card(5,3);
		testHand[4] = new Card(9,4);
		assertTrue(HandEvaluatorSFCP.hasThreeOfAKind(testHand));
	}
	@Test
	public void testExampleTest_StraightTest() {
		Card testHand[] = new Card[5];

		testHand[0] = new Card(1,0);
		testHand[1] = new Card(3,1);
		testHand[2] = new Card(2,2);
		testHand[3] = new Card(4,3);
		testHand[4] = new Card(5,4);
		assertTrue(HandEvaluatorSFCP.hasStraight(testHand));
	}
	@Test
	public void testExampleTest_TwoPairTest() {
		Card testHand[] = new Card[5];

		testHand[0] = new Card(4,0);
		testHand[1] = new Card(5,1);
		testHand[2] = new Card(5,2);
		testHand[3] = new Card(9,3);
		testHand[4] = new Card(9,4);
		assertTrue(HandEvaluatorSFCP.hasTwoPair(testHand));
	}
	@Test
	public void testExampleTest_FlushTest() {
		Card testHand[] = new Card[5];

		testHand[0] = new Card(4,1);
		testHand[1] = new Card(5,1);
		testHand[2] = new Card(3,1);
		testHand[3] = new Card(2,1);
		testHand[4] = new Card(9,1);
		assertTrue(HandEvaluatorSFCP.hasFlush(testHand));
	}
	@Test
	public void testExampleTest_FourOfAKind() {
		Card testHand[] = new Card[5];

		testHand[0] = new Card(5,0);
		testHand[1] = new Card(5,1);
		testHand[2] = new Card(5,2);
		testHand[3] = new Card(5,3);
		testHand[4] = new Card(9,4);
		assertTrue(HandEvaluatorSFCP.hasFourOfAKind(testHand));
	}
	@Test
	public void testExampleTest_StraightRainbowTest() {
		Card testHand[] = new Card[5];

		testHand[0] = new Card(1,0);
		testHand[1] = new Card(2,1);
		testHand[2] = new Card(3,2);
		testHand[3] = new Card(4,3);
		testHand[4] = new Card(5,4);
		assertTrue(HandEvaluatorSFCP.hasStraightRainbow(testHand));
	}
	@Test
	public void testExampleTest_StraightFlushTest() {
		Card testHand[] = new Card[5];

		testHand[0] = new Card(1,0);
		testHand[1] = new Card(2,0);
		testHand[2] = new Card(3,0);
		testHand[3] = new Card(4,0);
		testHand[4] = new Card(5,0);
		assertTrue(HandEvaluatorSFCP.hasStraightFlush(testHand));
	}
	@Test
	public void testExampleTest_FiveOfAKind() {
		Card testHand[] = new Card[5];

		testHand[0] = new Card(5,0);
		testHand[1] = new Card(5,1);
		testHand[2] = new Card(5,2);
		testHand[3] = new Card(5,3);
		testHand[4] = new Card(5,4);
		assertTrue(HandEvaluatorSFCP.hasFiveOfAKind(testHand));
	}




	







}
