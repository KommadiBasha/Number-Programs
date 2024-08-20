package HardWork;

import java.util.Arrays;

public class Anagaram {

	public static void main(String[] args) 
	{
		String str1="listen";
		String str2="silent";
		
		if(str1.length()==str2.length())
		{
			char [] c1=str1.toCharArray();
			char [] c2=str2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			str1=new String(c1);
			str2=new String(c2);	
		}
		if(str1.equals(str2))
		{
			System.out.println("Anagaram");
		}
		else
		{
			System.out.println("Not Anagaram");
		}

	}

}
