package MtoNPrintProgams;

import java.util.Scanner;

public class SunnyMtoN {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the start number...");
		int m=sc.nextInt();
		System.out.println("Enter end Number...");
		int n=sc.nextInt();
		
		for(int i=m;i<=n;i++)
		{
			int num=i;
			int square=num+1;
			boolean flag=false;
			for(int j=1;j<=square/2;j++)
			{
				if(j*j==square)
				{
					flag=true;
				}
			}
			if(flag==true)
			{
				System.out.println(num);
			}
		}

	}

}
