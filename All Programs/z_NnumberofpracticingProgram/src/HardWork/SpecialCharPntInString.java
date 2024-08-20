package HardWork;

public class SpecialCharPntInString {

	public static void main(String[] args) 
	{
		String s="welcom       e Bro";
		String special="@";
		String store="";
		for(int i=0;i<s.length();i++)
		{
			
			
			if(s.charAt(i)!=' ')
			{
				store=store+s.charAt(i);
				
			}
			else {
				store=store+special;
			}
		}
		System.out.println(store);
	}

}
