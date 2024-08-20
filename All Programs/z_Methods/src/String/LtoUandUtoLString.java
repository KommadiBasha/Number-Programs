package String;
//wrong program...............................................
public class LtoUandUtoLString {

	public static void main(String[] args) 
	{
		String s ="hI hELLO how are YOU";
		ltou(s);
			System.out.println(ltou(s));	
	}
	public static String ltou(String s1)
	{
		String store="";
		
		
		for(int i=0;i<s1.length();i++)
		{
			char capital='A';
			char small='a';
			char capitals=' ';
			char smalls=' ';
		
			while(capital>='Z')
			{
				capitals=capital++;
			}
			while(small>='z')
			{
				smalls=small++;
			}
			
			if(s1.charAt(i)==capitals || s1.charAt(i)==' ')
			{
				char c=(char)smalls;
				store= store + c;
			}
			else if(s1.charAt(i)==smalls ||s1.charAt(i)==' ')
			{
				char c=(char)capitals;
				store=store+c;
			}
			else
			{
				System.out.println("not converted");
				break;
			}
		}
		return store;
		
	}

}
