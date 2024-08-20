package String;

public class ConversionsCapital_to_Small 
{

	public static void main(String[] args) 
	{
		String s1 ="JAVA MAVA";
		
		String s2 ="i am strong in java";
		
		//System.out.println(capitaltosmall(s1));
		String upper=capitaltosmall(s1);
		System.out.println();
		System.out.println(upper);
		String lower=smalltoCapital(s2);
		System.out.println(lower);
	}
	public static String smalltoCapital(String s)
	{
		String store="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			
			if(c==' ')
			{
				store=store+' ';
			}
			else
			{
				char c1=(char)(c-32);
				store=store+c1;
			}
				
		}
		return store;
	}
	public static String capitaltosmall(String s)
	{
		String store="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			
			if(c==' ')
			{
				store=store+' ';
			}
			else
			{
				char c1=(char)(c+32);
				store=store+c1;
			}
				
		}
		return store;
	}
}
