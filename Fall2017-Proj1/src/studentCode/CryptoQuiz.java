package studentCode;
import java.util.Scanner;


public class CryptoQuiz {
	//NOTE: You MUST use these named constants.  The submit server will
	//      fail you on the Task 4 tests if you do not use these named
	//      constants in your code but rather use the actual values.
	static int NUM_BITS1 = 80, NUM_BITS2 = 128, NUM_BITS3 = 168;
	static String CRYPT1 = "Skipjack", CRYPT2 = "Rijndael", CRYPT3 = "TripleDES";



	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);


		//YOUR CODE IN HERE

		System.out.print("Enter 1 to guess a cryptographic system, 2 to guess how many BITs: ");
		int choiceOne = myScanner.nextInt();

		if(choiceOne == 1)
		{
			System.out.print("Choose number of BITs: ");
			int bitNumber = myScanner.nextInt();

			if(bitNumber == NUM_BITS1 || bitNumber == NUM_BITS2 || bitNumber == NUM_BITS3)
			{
				System.out.print("Which cryptographic system uses " + bitNumber + " BITs? ");
				String cryptName = myScanner.next();

				if(bitNumber == NUM_BITS1 && cryptName.equals(CRYPT1)|| (bitNumber == NUM_BITS2 && cryptName.equals(CRYPT2) || (bitNumber == NUM_BITS3 && cryptName.equals(CRYPT3))))
				{
					System.out.print("Correct!");						
				}
				else 
				{ 
					System.out.print("Incorrect!");
				}

			}
			else 
			{
				System.out.print("Invalid choice.");
			}
		}
		else if (choiceOne == 2)
		{
			System.out.print("Choose a cryptographic system: ");
			String cryptChoice = myScanner.next();

			if (cryptChoice.equals(CRYPT1) || cryptChoice.equals(CRYPT2) || cryptChoice.equals(CRYPT3))
			{
				System.out.print("How many BITs used in a " + cryptChoice + " system? ");
				int bitChoice = myScanner.nextInt();

				if((bitChoice == NUM_BITS1 && cryptChoice.equals(CRYPT1) || (bitChoice == NUM_BITS2 && cryptChoice.equals(CRYPT2) || (bitChoice == NUM_BITS3 && cryptChoice.equals(CRYPT3)))))
				{
					System.out.print("Correct!");						
				}
				else 
				{ 
					System.out.print("Incorrect!");
				}
			}
			else 
			{
				System.out.print("Invalid choice.");
			}

		}
		


		//YOUR CODE IN HERE		


		myScanner.close();
	}
}
