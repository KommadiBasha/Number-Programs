package MtoNPrintProgams;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the start number...");
		int m=sc.nextInt();
		System.out.println("Enter end Number...");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			int temp=i;
			for(int j=1;j<=i;j++)
			{
				int square=j*j;
				if(square==temp)
				{
					System.out.println(temp);
					break;
				}
			}
		}
	}

}
