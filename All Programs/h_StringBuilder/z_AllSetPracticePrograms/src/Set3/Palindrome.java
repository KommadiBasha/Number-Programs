package Set3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a start number.");
		int num1 = sc.nextInt();
		System.out.println("Enter a end number.");
		int num2 = sc.nextInt();
		
		for(int i=num1;i<=num2;i++)
		{
			int rev=0;
			for(int j=i;j>0;j/=10)
			{
				int last=j%10;
				rev=(rev*10)+last;
			}
			if(rev==i)	
			{
				System.out.print(rev+" ");
			}
			}	
		
	}

}
