package NumberPrograms;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the start number...");
		int m = sc.nextInt();
		
		int n = m;
		int sum=0;
		while(m>0)
		{
			int last =m%10;
			int fact=1;
			for(int i=1;i<=last;i++)
			{
				fact =fact*i;
			}
			sum=sum+fact;
			m/=10;
		}
		if(n==sum)
		{
			System.out.println("strong number...");
		}
		else
		{
			System.out.println("not a Strong....");
		}
	}

}
