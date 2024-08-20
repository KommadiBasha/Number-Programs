package NumberPrograms;

import java.util.Scanner;

public class Armstrongpro 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number..........");
		int enternumber =sc.nextInt();
		int number1=enternumber;
		int numbersum=enternumber;
		int count=0;
		int sum=0;
		while(enternumber>0)
		{
			count++;
			enternumber/=10;
		}
		while(number1>0)
		{
			int last=number1%10;
			int fact=1;
			for(int i=1;i<=count;i++)
			{
				fact=fact*last;
			}
			
			sum=sum+fact;
			number1/=10;
		}
		if(numbersum==sum)
		{
			System.out.println("Armstong");
		}
		else
		{
		System.out.println("Not Armstong");
		}
		
	}
}
