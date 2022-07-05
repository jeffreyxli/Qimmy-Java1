package studentCode;

public class AlphaListV2 {

	//We are keeping this public for easier testing.
	public String[][] list;  




	public AlphaListV2() {
		list = new String[26][0];
	}

	public void insert(String value) {
		for(int i = 0; i < 26; i++)
		{
			if((value.charAt(0) - 65) == i)
			{
				String[] copy = new String[list[i].length+1];
				for(int a = 0; a < list[i].length; a++)
				{
					copy[a]=list[i][a];
				}
				copy[list[i].length]=value;
				list[i]=copy;
			}
		}
	}

	public void remove(String value) {
		int index = 0;
		for(int i = 0; i < 26; i++)
		{
			if((value.charAt(0) - 65) == i)
			{
				String[] copy = new String[list[i].length-1];
				for(int a = list[i].length-1; a >= 0; a--)
				{
					if(list[i][a].equals(value))
					{
						index = a;
					}
				}
				for(int b = 0; b < index; b++)
				{
					copy[b]=list[i][b];
				}
				for(int c = index; c < list[i].length-1; c++)
				{
					copy[c]=list[i][c+1];
				}
				list[i]=copy;
			}
		}
	}

	public int count() {
		int count = 0;
		for(int i = 0; i < 26; i++)
		{
			count+=list[i].length;
		}
		return count;
	}

}
