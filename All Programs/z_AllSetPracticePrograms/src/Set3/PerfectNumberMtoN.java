package Set3;

import java.util.Scanner;

public class PerfectNumberMtoN {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a start number.");
		int num1 = sc.nextInt();
		System.out.println("Enter a end number.");
		int num2 = sc.nextInt();
		for(int i=num1;i<=num2;i++)
		{
			int sum=0;
			for(int j=1;j<=i/2;j++)
			{
				if(i%j==0)
				{
					sum+=j;
				}
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}		

	}

}
