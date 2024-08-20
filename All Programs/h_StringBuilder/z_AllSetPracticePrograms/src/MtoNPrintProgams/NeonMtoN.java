package MtoNPrintProgams;

import java.util.Scanner;

public class NeonMtoN {

	public static void main(String[] args) 
	{

		Scanner sc =new Scanner(System.in);
		System.out.println("enter the start number...");
		int m=sc.nextInt();
		System.out.println("Enter end Number...");
		int n=sc.nextInt();
		
		
		for(int j=m;j<=n;j++)
		{	

			int product=1;
			int sum=0;
			int num=j;
			for(int i=1;i<=2;i++)
			{
				product=product*num;
			}
		//	System.out.println(product);
				while(product>0)
				{
					int last=product%10;
					sum=sum+last;
					product/=10;
				}
			//	System.out.println(sum);
					if(sum==num)
					{
						System.out.println(sum);
					}
					
			}
	}

}
