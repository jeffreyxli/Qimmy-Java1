import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;


public class PublicTests {

	@Test
	public void testL5ConstructorAndGetters() {
		Rational rationalVal = new Rational(3, 4);
		assertEquals(3, rationalVal.getNumer());
		assertEquals(4, rationalVal.getDenom());
	}

	@Test
	public void testL5ToString() {
		Rational rationalVal = new Rational(7,11);
		assertEquals("7/11", rationalVal.toString());
	}

	@Test
	public void testL5Add() {
		Random rnd = new Random(7);

		Rational rationalValueA;
		Rational rationalValueB;
		Rational rationalAnswer;

		int v1, v2, v3, v4;
		for (int i=0; i<1000; i++) {
			v1 = rnd.nextInt(500);
			v2 = rnd.nextInt(500);
			v3 = rnd.nextInt(500);
			v4 = rnd.nextInt(500);
			rationalValueA = new Rational(v1, v2);
			rationalValueB = new Rational(v3, v4);
			rationalAnswer = rationalValueA.add(rationalValueB);

			assertEquals("Trying " + rationalValueA + " plus " + rationalValueB,
					v1*v4 + v2*v3, rationalAnswer.getNumer());
			assertEquals("Trying " + rationalValueA + " plus " + rationalValueB,
					v2 * v4, rationalAnswer.getDenom());
		}
	}
	
	@Test
	public void testL5Multiply() {
		Random rnd = new Random(7);

		Rational rationalValueA;
		Rational rationalValueB;
		Rational rationalAnswer;

		int v1, v2, v3, v4;
		for (int i=0; i<1000; i++) {
			v1 = rnd.nextInt(500);
			v2 = rnd.nextInt(500);
			v3 = rnd.nextInt(500);
			v4 = rnd.nextInt(500);
			rationalValueA = new Rational(v1, v2);
			rationalValueB = new Rational(v3, v4);
			rationalAnswer = Rational.multiply(rationalValueA, rationalValueB);

			assertEquals("Trying " + rationalValueA + " times " + rationalValueB,
					v1*v3, rationalAnswer.getNumer());
			assertEquals("Trying " + rationalValueA + " times " + rationalValueB,
					v2*v4, rationalAnswer.getDenom());
		}
	}

	@Test
	public void testL5Divide() {
		Random rnd = new Random(7);

		Rational rationalValueA;
		Rational rationalValueB;
		Rational rationalAnswer;

		int v1, v2, v3, v4;
		for (int i=0; i<1000; i++) {
			v1 = rnd.nextInt(500);
			v2 = rnd.nextInt(500);
			v3 = rnd.nextInt(500);
			v4 = rnd.nextInt(500);
			rationalValueA = new Rational(v1, v2);
			rationalValueB = new Rational(v3, v4);
			rationalAnswer = rationalValueA.divide(rationalValueB);

			assertEquals("Numer for " + rationalValueA + " divided by " + rationalValueB,
					v1*v4, rationalAnswer.getNumer());
			assertEquals("Denom for " + rationalValueA + " divided by " + rationalValueB,
					v2*v3, rationalAnswer.getDenom());
		}
	}


}
