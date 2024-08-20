package StringArray;

public class VowelCount
{
 public static void main(String[] args)
 {
	String [] s= {"welcome onboard"};
	int count=0;
	for(int i=0;i<s.length;i++)
	{
		//System.out.println(s[i]);
	}
	for(int i=0;i<s.length;i++)
	{
		
		if(s[i].charAt(i)=='a' ||s[i].charAt(i)=='e' ||s[i].charAt(i)=='i' ||s[i].charAt(i)=='o' ||
				s[i].charAt(i)=='u')
		{
			System.out.println(s[i].charAt(i));
			count++;
		}
	}
	System.out.println(count);
}
}
