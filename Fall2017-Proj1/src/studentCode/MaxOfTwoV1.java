package studentCode;

import java.util.Scanner;

public class MaxOfTwoV1 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		
		//YOUR CODE IN HERE
		
		int first, second;
		first = myScanner.nextInt();
		second = myScanner.nextInt();
		
		if (first - second > 0)
		{
			System.out.print(first + " is greater than " + second);
		}
		else 
		{
			System.out.print(second + " is greater than or equal to " + first);
		}

		//YOUR CODE IN HERE
		
		
		myScanner.close();
	}
	
	
}
