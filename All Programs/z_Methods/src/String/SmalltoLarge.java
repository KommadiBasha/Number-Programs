package String;

public class SmalltoLarge {

	public static void main(String[] args) 
	{
		String s1="good morning to every one";
		
		String str=stoU(s1);
	
		System.out.println(str);
		System.out.println();
		System.out.println(stoU(s1));
	}
	public static String stoU(String s)
	{
		String store="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch==' ') {
				store =store+' ';
			}
			else 
			{
				char c=(char)(ch-32);
				store=store+c;
			}
		}
		return store;
	}

}
