package String;

public class LargetoSmall {

	public static void main(String[] args) 
	{
		;
		System.out.println(ltoSmall("HAPPY WEEKEND"));
	}
	public static String ltoSmall(String s)
	{
		String store="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch==' ')
			{
				store=store+' ';
			}
			else
			{
				char c1=(char)(ch+32);
				store=store+c1;
			}
			
		}
		return store;
	}

}
