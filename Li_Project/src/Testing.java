
public class Testing {
	

	public static void main(String[] args)
	
	{
	
		String word = "CMSC131";
		
		for(int iter = 0; iter < word.length(); iter++)
		{
			//System.out.print(word.charAt(iter) + " ");
			char c = word.charAt(iter); 
			int i = (int)c; 
			//System.out.print(i + " ");
			i++;
			char d = (char)i; 
			System.out.print(d + " ");
		}
		
		for(int it = word.length()-1; it >= 0; it--)
		{
			System.out.print(word.charAt(it) + " ");
		}
	}
	
}
