package String;

public class DisplayallCountSeparetely {

	public static void main(String[] args) 
	{
		String s="Za#@#$h090eer91Ro999hi^%$%^";
		String num = numCount(s);
		System.out.println("total couny"+num);
		
		String small=smallAlphaCount(s);
		System.out.println("total count"+small);
		
		String capital=capitalAlphaCount(s);
		System.out.println("total count"+capital);
		
		String special=onlySpecialCharaters(s);
		System.out.println("total count"+special);
	}
	public static String numCount(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				count++;
			}
		}
		return " "+ count;
	}
	public static String smallAlphaCount(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z')
			{
				count++;
			}
		}
		return " "+ count;
	}
	public static String capitalAlphaCount(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				count++;
			}
		}
		return " "+ count;
}
	public static String onlySpecialCharaters(String s)
	{
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(!(ch==' ' || ch>='A' &&ch<='Z'|| ch>='a' && ch<='z' || ch>='0' &&ch<='9'))
			{
				
				count++;
			}
		}
		return " "+ count;
	}
}