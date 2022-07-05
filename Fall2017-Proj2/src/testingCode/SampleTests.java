package testingCode;
import org.junit.Test;
import junit.framework.TestCase;


public class SampleTests extends TestCase {
	
	@Test
	public void isItSafe() {
		assertTrue(studentCode.CryptoCode.safeToUse("CMSC131"));
	}
	
	@Test
	public void testRotate32() {
		String plaintext = "CMSC 131";
		String ciphertext = "#-3#@QSQ";
		assertEquals(
			ciphertext,
			studentCode.CryptoCode.rot32(plaintext)
		);
	}
		
	@Test
	public void testCaesar() {
		String plaintext = "Computer Science";
		int shift = 131;
		String ciphertext = "FRPSXWHU#VFLHQFH";

		assertEquals(
			ciphertext,
			studentCode.CryptoCode.toCaesar(plaintext, shift)
		);
	}

	@Test
	public void testBellaso() {
		String plaintext = "Computer Science";
		String keyword = "CMSC131";
		String ciphertext = "&<@3&'V5MF&ZX_&2";

		assertEquals(
			ciphertext,
			studentCode.CryptoCode.toBellaso(plaintext, keyword)
		);
	}

	
	

}
