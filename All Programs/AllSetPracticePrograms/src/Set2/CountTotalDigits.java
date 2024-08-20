package Set2;

import java.util.Scanner;

public class CountTotalDigits 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		int i=1234569;
		int count=0;
		while(i>0)
		{
			count++;
			i=i/10;
		}
		System.out.println(count);		
	}

}
/*123456789


*/
