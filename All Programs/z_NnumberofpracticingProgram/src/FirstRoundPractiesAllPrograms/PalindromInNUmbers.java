package FirstRoundPractiesAllPrograms;

import java.util.Scanner;

public class PalindromInNUmbers {

	public static void main(String[] args) 
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("enter number....");
		int num=sc.nextInt();
		int store=num;
		//System.out.print(store+" ");
		//System.out.println();
		int rev=0;
		for(int i=1;i<=num;i++)
		{
			
			int last=num%10;
			rev=(rev*10)+last;
			//System.out.print("after rev and stored...."+ rev);
			num/=10;
			
		}
		if(rev==store)
		{
			System.out.println("palindrome....");
		
		}
		else
		{
			System.out.println("not a palindrome...");
		
		}
	}

}
