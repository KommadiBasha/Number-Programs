package Set3;

import java.util.Scanner;

public class PrimeNumorNot 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a start number.");
		int num=sc.nextInt();
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				if(i==num)
				{
					System.out.println("prime number");
					break;
				}
				else
				{
					System.out.println("not a prime");
					break;
				}
			}
			
		}

}}
