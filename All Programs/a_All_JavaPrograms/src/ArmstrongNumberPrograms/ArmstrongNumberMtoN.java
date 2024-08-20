package ArmstrongNumberPrograms;

import java.util.Scanner;

public class ArmstrongNumberMtoN {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter start number");
		int start=sc.nextInt();
		
		System.out.println("enter end number");
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			int sum=0;
			int count=0;
			int rem=0;
			for(int j=i;j!=0;)
			{
				count++;
				j=j/10;
			}
			for(int k=i; k!=0;)
			{
				int fact=1;
				rem=k%10;
				for(int l=1;l<=count;l++)
				{
					fact*=rem;
				}
				sum+=fact;
				k/=10;
			}
			if(i==sum)
			{
				System.out.print(i+" ");
			}
			
		}
		

	}

}
