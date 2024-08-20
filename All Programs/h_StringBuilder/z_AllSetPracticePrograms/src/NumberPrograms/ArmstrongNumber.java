package NumberPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the start number...");
		int m = sc.nextInt();
		int n=m;
		int original=m;
		int sum=0;
		int count=0;
		while(m>0)
		{
			count++;
			m/=10;
		}
		while(n>0)
		{
			int last=n%10;
			int fact=1;
			for(int i=1;i<=count;i++)
			{
				fact=fact*last;
			}
			sum=sum+fact;
				n/=10;	
		}
		if(sum==original)
		{
			System.out.println("armstrong");
		}
		else
			System.out.println("not a armstrong");

	}

}
