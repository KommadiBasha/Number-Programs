package String;

public class DisplayAllSeparateNumALphaSpecial {

	public static void main(String[] args) 
	{
		String str="SA^&NIso19hil99@#$%";
		String num=onlyNumber(str);
		System.out.println(num);
		
		String capitalAlpha=onlyCapitalAlphabets(str);
		System.out.println(capitalAlpha);
		
		String smallAlpha=onlySmallAlphabets(str);
		System.out.println(smallAlpha);
		
		String specialChar=onlySpecialCharaters(str);
		System.out.println(specialChar);

	}
	public static String onlyNumber(String s)
	{
		String store="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				char c1=(char)ch;
				store=store+c1;
				count++;
			}
		}
		System.out.println("count of num"+count);
		return store;
	}
	public static String onlyCapitalAlphabets(String s)
	{
		String store="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				store=store+ch;
				count++;
			}
		}
		System.out.println("count of capitalalpha"+count);
		return store;
	}
	public static String onlySmallAlphabets(String s)
	{
		String store="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z')
			{
				store=store+ch;
				count++;
			}
		}
		System.out.println("count of smallalpha"+count);
		return store;
		
	}
	public static String onlySpecialCharaters(String s)
	{
		String store="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(!(ch==' ' || ch>='A' &&ch<='Z'|| ch>='a' && ch<='z' || ch>='0' &&ch<='9'))
			{
				store =store+ch;
				count++;
			}
		}
		System.out.println("count of special"+count);
		return store;
	}
}
