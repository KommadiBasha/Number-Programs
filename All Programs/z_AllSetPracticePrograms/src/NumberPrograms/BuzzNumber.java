package NumberPrograms;

import java.util.Scanner;

public class BuzzNumber 
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter digits");
		int num=sc.nextInt();
		boolean b=false;
		while(num!=0)
		{
			int rev=num%10;
			if(rev==7)
			{
				b=true;
			}
			num/=10;
		}
		if(b==true)
		{
			System.out.println("Buzz number bz's 7 is present ");
		}
		else
		{
			System.out.println("not a buzz number...");
		}
	}

}
