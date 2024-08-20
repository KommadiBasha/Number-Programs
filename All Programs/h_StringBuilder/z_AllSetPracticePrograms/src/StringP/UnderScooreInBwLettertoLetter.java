package StringP;

public class UnderScooreInBwLettertoLetter {

	public static void main(String[] args) 
	{
		String s="Welcome a";
		String space="";
		String under="-";
		int count=0;
		boolean b= true;
		for(int i=0;i<s.length();i++)
		{	
			if(s.charAt(i)!=' ')
			{
				
				count++;
				space=space+s.charAt(i);
				space=space+under;
			}
			else
			{
				System.out.println("space is occured");
			}
			
		}
		space=space.substring(0,space.length()-1);
		System.out.println(space);
		System.out.println(count);
	}

}
