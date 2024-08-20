package Numbers;

import java.util.Scanner;

public class FindingDigitisthereorNot 
{
	public static void main(String[] args) 
	{
		readInput();
	}
	public static void readInput()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		
		System.out.println("Enter search num");
		int digit=sc.nextInt();
		searchDigit(num,digit);
	}
	public static void searchDigit(int num, int digit)
	{
		boolean flag=true;
		while(num>0)
		{
			if(num%10==digit)
			{
				System.out.println("found digit...");
				flag=false;
				break;
			}
			num/=10;
		}
		if(flag)
		{
			System.out.println("digit is not found...");
		}
	}

}
