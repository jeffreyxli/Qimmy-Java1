package studentCode;

import java.util.ArrayList;

public class AlphaListV1 {

	//We are keeping this public for easier testing.
	public ArrayList<ArrayList<String>> list;  
	
	
	
	public AlphaListV1() {
		list = new ArrayList<ArrayList<String>>();
		for(int i = 0; i < 26; i++)
		{
			list.add(new ArrayList<String>());
		}
	}
	
	public void insert(String value) {
		for(int i = 0; i < 26; i++)
		{
			if((value.charAt(0) - 65) == i)
			{
				list.get(i).add(value);
			}
		}
	}
	
	public void remove(String value) {
		for(int i = 0; i < 26; i++)
		{
			if((value.charAt(0) - 65) == i)
			{
				list.get(i).remove(value);
			}
		}
	}
	
	public int count() {
		int count = 0;
		for(int i = 0; i < 26; i++)
		{
				count+=list.get(i).size();
		}
		return count;

	}

}
