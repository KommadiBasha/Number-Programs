package Set3;

import java.util.Scanner;

public class StrongNumberMtoN {

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
		
			for(int j=i ;j!=0;j/=10)
			{
			int last=j%10;
			int fact=1;
			for(int k=1;k<=last;k++)
			{
				fact*=k;
			}
			sum+=fact;
		}
		if(sum==i)
		{
		System.out.println(sum);		
		}
		}	
	}

}
