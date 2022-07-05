package studentCode;

import java.util.Scanner;

public class MaxOfTwoV2 {

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
		else if (first - second < 0)
		{
			System.out.print(second + " is greater than " + first);
		}
		else 
		{
			System.out.print(first + " is equal to " + second);
		}


		//YOUR CODE IN HERE
		
		
		myScanner.close();
	}
	
	
}
