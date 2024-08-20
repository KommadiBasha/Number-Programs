package Set1;

public class SmallAlphabets {

	public static void main(String[] args) 
	{
		char c='a';
		char c1='A';
		int count=0;
		do
		{
			System.out.print(c+" ");
			count++;
			c++;
		}while(c<='z');
		System.out.print(count+" ");
		System.out.println();
		while(c1<='Z')
			{
			System.out.print(c1);
			c1++;
		}
		
		
	}

}
