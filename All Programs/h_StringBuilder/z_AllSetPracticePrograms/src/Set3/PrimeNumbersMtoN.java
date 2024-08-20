package Set3;

import java.util.Scanner;

public class PrimeNumbersMtoN {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a start number.");
		int num1 = sc.nextInt();
		System.out.println("Enter a end number.");
		int num2 = sc.nextInt();
		
		for(int i=num1;i<=num2;i++)
		{
			
		boolean b=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					b=false;
				}
			}
			if(b==true)
			{
			System.out.print(i+" ");	
			}
					
			}	
	}
}
