package ArmstrongNumberPrograms;

import java.util.Scanner;

public class ArmstrongNumberM_N {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter start number");
		int start=sc.nextInt();
		
		System.out.println("enter end number");
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			int num=i;
			int count=0;
			int rem;
			int sum=0;
			while(num!=0)
			{
				count++;
				num/=10;
			}
			int num1=i;
			while(num1>0)
			{
				rem=num1%10; 
				int fact=1;
				for(int j=1;j<=count;j++)
				{
				fact*=rem;
				}
				num1/=10;
				sum+=fact;
			}
			if(sum==i)
			{
				System.out.print(i+" ");
			}
			
		}

	}

}
