package PracticeingPrograms;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		int i=12345;
		int rev=0;
		while(i>0)
		{
			int last=i%10;
			rev=(rev*10)+last;
			i/=10;
		}
		System.out.println(rev);
	}

}
