package StringP;

public class CountNoofChars {

	public static void main(String[] args) 
	{
	String s= "Wlecomeon";
	int count =0;
	for(int i=1;i<=s.length();i++)
	{
		if(i!=0)
		{
			count++;
		}
		System.out.print(count);
	}
	}

}
