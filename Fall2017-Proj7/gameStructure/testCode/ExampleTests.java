package testCode;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import studentCode.Movie;
import studentCode.CardsAgainstCriticsDeck;
import studentCode.Novel;
import studentCode.Critiqueable;
import studentCode.Novelization;
import studentCode.Universe.Outcomes;

public class ExampleTests {

	@Test
	public void testOne() {
		CardsAgainstCriticsDeck<Novel> cacd = new CardsAgainstCriticsDeck<Novel>();
		cacd.add(new Novel("one", 1));
		cacd.add(new Novel("two", 2));
		cacd.add(new Novel("three", 3));
		cacd.add(new Novel("four", 4));
		assertEquals(
				"Contents: [ Novel<Title: three  Fans: 3  Stars: 2>, Novel<Title: one  Fans: 1  Stars: 2>, Novel<Title: two  Fans: 2  Stars: 2>, Novel<Title: four  Fans: 4  Stars: 2> ]"
				,
				cacd.toString()
				);
	}
    

	@Test
	public void testTwo() {
		CardsAgainstCriticsDeck<Novel> cacd = new CardsAgainstCriticsDeck<Novel>();
		cacd.add(new Novel("one", 11));
		cacd.add(new Novel("two", 12));
		cacd.add(new Novel("three", 13));
		cacd.add(new Novel("four", 14));

		assertEquals(
				"Contents: [ Novel<Title: three  Fans: 13  Stars: 2>, Novel<Title: one  Fans: 11  Stars: 2>, Novel<Title: two  Fans: 12  Stars: 2>, Novel<Title: four  Fans: 14  Stars: 2> ]",
				cacd.toString()
				);

		assertEquals(
				"Novel<Title: four  Fans: 14  Stars: 2>",
				cacd.solitaireCritique().toString()
				);

		assertEquals(
				"Novel<Title: two  Fans: 12  Stars: 2>",
				cacd.solitaireCritique().toString()
				);
	}


	@Test
	public void testThree() {
		CardsAgainstCriticsDeck<Novel> cacd = new CardsAgainstCriticsDeck<Novel>();
		cacd.add(new Novel("four", 14));
		cacd.add(new Novel("three", 13));
		cacd.add(new Novel("two", 12));
		cacd.add(new Novel("one", 11));

		assertEquals(
				"Contents: [ Novel<Title: two  Fans: 12  Stars: 2>, Novel<Title: four  Fans: 14  Stars: 2>, Novel<Title: three  Fans: 13  Stars: 2>, Novel<Title: one  Fans: 11  Stars: 2> ]",
				cacd.toString()
				);

		assertEquals(
				"Novel<Title: two  Fans: 12  Stars: 2>",
				cacd.solitaireCritique().toString()
				);

		assertEquals(
				"Novel<Title: four  Fans: 14  Stars: 2>",
				cacd.solitaireCritique().toString()
				);

	}


	@Test
	public void testFour() {
		CardsAgainstCriticsDeck<Novel> cacd = new CardsAgainstCriticsDeck<Novel>();
		cacd.add(new Novel("one", 1));
		cacd.add(new Novel("two", 2));
		cacd.add(new Novel("three", 3));
		cacd.add(new Novel("one", 1));
		cacd.add(new Novel("two", 2));

		assertEquals(
				"Contents: [ Novel<Title: two  Fans: 2  Stars: 2>, Novel<Title: three  Fans: 3  Stars: 2>, Novel<Title: one  Fans: 1  Stars: 2>, Novel<Title: two  Fans: 2  Stars: 2>, Novel<Title: one  Fans: 1  Stars: 2> ]",
				cacd.toString()
				);

		assertEquals(
				"Novel<Title: two  Fans: 2  Stars: 2>",
				cacd.solitaireCritique().toString()
				);


		assertEquals(
				"Contents: [ Novel<Title: three  Fans: 3  Stars: 2>, Novel<Title: two  Fans: 2  Stars: 2> ]",
				cacd.toString()
				);

		assertEquals(
				"Novel<Title: three  Fans: 3  Stars: 2>",
				cacd.solitaireCritique().toString()
				);

		assertEquals(
				"Contents: [  ]",
				cacd.toString()
				);

		assertEquals(
				null,
				cacd.solitaireCritique()
				);

	}


	@Test
	public void testFive() {
		CardsAgainstCriticsDeck<Critiqueable> cacd = new CardsAgainstCriticsDeck<Critiqueable>();

		cacd.add(new Movie("one", 11));
		cacd.add(new Novel("two", 12));
		cacd.add(new Movie("three", 13));
		cacd.add(new Novel("four", 14));

		assertEquals(
				"Contents: [ Movie<Title: three  Fans: 13  Stars: 7>, Movie<Title: one  Fans: 11  Stars: 7>, Novel<Title: two  Fans: 12  Stars: 2>, Novel<Title: four  Fans: 14  Stars: 2> ]",
				cacd.toString()
				);

		assertEquals(
				"Movie<Title: three  Fans: 13  Stars: 7>",
				cacd.solitaireCritique().toString()
				);

		assertEquals(
				"Movie<Title: one  Fans: 11  Stars: 7>",
				cacd.solitaireCritique().toString()
				);
	}



	@Test
	public void testSix() {
		CardsAgainstCriticsDeck<Critiqueable> cacd = new CardsAgainstCriticsDeck<Critiqueable>();

		cacd.add(new Movie("one", 11));
		cacd.add(new Novelization("A", 7));
		cacd.add(new Novel("two", 12));
		cacd.add(new Novelization("Z", 7));
		cacd.add(new Movie("three", 13));
		cacd.add(new Novelization("L", 7));
		cacd.add(new Novel("four", 14));

		assertEquals(
				"Contents: [ Novel<Title: four  Fans: 14  Stars: 2>, Movie<Title: three  Fans: 13  Stars: 7>, Novel<Title: two  Fans: 12  Stars: 2>, Movie<Title: one  Fans: 11  Stars: 7>, Novelization<Title: A  Fans: 7  Stars: 5>, Novelization<Title: Z  Fans: 7  Stars: 0>, Novelization<Title: L  Fans: 7  Stars: 6> ]",
				cacd.toString()
				);

		assertEquals(
				"Novelization<Title: L  Fans: 7  Stars: 6>",
				cacd.solitaireCritique().toString()
				);

		assertEquals(
				"Movie<Title: three  Fans: 13  Stars: 7>",
				cacd.solitaireCritique().toString()
				);	

		assertEquals(
				"Novelization<Title: A  Fans: 7  Stars: 5>",
				cacd.solitaireCritique().toString()
				);

	}


	@Test
	public void testSeven() {
		CardsAgainstCriticsDeck<Critiqueable> cacd = new CardsAgainstCriticsDeck<Critiqueable>();

		cacd.add(new Movie("one", 11));
		cacd.add(new Novelization("A", 7));
		cacd.add(new Novel("two", 12));
		cacd.add(new Novelization("Z", 7));
		cacd.add(new Movie("three", 13));
		cacd.add(new Novelization("L", 7));
		cacd.add(new Novel("four", 14));

		assertEquals(
				"[Novelization<Title: Z  Fans: 7  Stars: 0>]",
				Arrays.toString(cacd.export2Darray()[0])
				);
		assertEquals(
				"[]",
				Arrays.toString(cacd.export2Darray()[1])
				);
		assertEquals(
				"[Novel<Title: four  Fans: 14  Stars: 2>, Novel<Title: two  Fans: 12  Stars: 2>]",
				Arrays.toString(cacd.export2Darray()[2])
				);	
		assertEquals(
				"[]",
				Arrays.toString(cacd.export2Darray()[3])
				);	
		assertEquals(
				"[]",
				Arrays.toString(cacd.export2Darray()[4])
				);	
		assertEquals(
				"[Novelization<Title: A  Fans: 7  Stars: 5>]",
				Arrays.toString(cacd.export2Darray()[5])
				);	
		assertEquals(
				"[Novelization<Title: L  Fans: 7  Stars: 6>]",
				Arrays.toString(cacd.export2Darray()[6])
				);	
		assertEquals(
				"[]",
				Arrays.toString(cacd.export2Darray()[8])
				);	
		assertEquals(
				"[]",
				Arrays.toString(cacd.export2Darray()[9])
				);	
	}

	@Test
	public void testEight() {
		CardsAgainstCriticsDeck<Critiqueable> cacd = new CardsAgainstCriticsDeck<Critiqueable>();


		Critiqueable thing1 = new Novel("A", 5);
		for (int i=0; i<10000; i++) {
			thing1.inform(Outcomes.FRESH);
		}
		Critiqueable thing2 = new Novel("B", 5);
		for (int i=0; i<500; i++) {
			thing2.inform(Outcomes.FRESH);
		}
		Critiqueable thing3 = new Novel("C", 5);
		for (int i=0; i<20; i++) {
			thing3.inform(Outcomes.FRESH);
		}

		cacd.add(thing1);
		cacd.add(thing2);
		cacd.add(thing3);

		assertEquals(
				"[Novel<Title: C  Fans: 5  Stars: 3>]",
				Arrays.toString(cacd.export2Darray()[3])
				);	

		assertEquals(
				"[Novel<Title: A  Fans: 5  Stars: 835>, Novel<Title: B  Fans: 5  Stars: 43>]",
				Arrays.toString(cacd.export2Darray()[10])
				);	
	}


}
