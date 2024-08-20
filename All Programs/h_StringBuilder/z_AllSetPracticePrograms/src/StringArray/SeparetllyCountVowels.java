package StringArray;

public class SeparetllyCountVowels 
{

	public static void main(String[] args) 
	{
		String [] str= {"welcome","onboard u"};
		String vowels="aeiouAEIOU";
		int a=0,e=0,i=0,o=0,u=0;
		for(String s:str)
		{
			for(int p=0;p<s.length();p++)
			{
				
				if(s.charAt(p)=='a' )
				{
					a++;
				}
				else if(s.charAt(p)=='e')
				{
					e++;
				}
				else if(s.charAt(p)=='i')
				{
					i++;
				}
				else if(s.charAt(p)=='o')
				{
					o++;
				}
				else if(s.charAt(p)=='u')
				{
					u++;
				}
			}
		}
		System.out.println(a);
		System.out.println(e);
		System.out.println(i);
		System.out.println(o);
		System.out.println(u);
	}
	}


