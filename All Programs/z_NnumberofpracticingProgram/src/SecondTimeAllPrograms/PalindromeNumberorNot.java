package SecondTimeAllPrograms;

import java.util.Scanner;

public class PalindromeNumberorNot {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int last;
		boolean b=false;
	
		for(int i=0;i<=num;i++)
		{	
			last=num%10;
			sum=(sum*10)+last;
			num/=10;
		}
		if(sum==temp)
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");
	}

}