package Set3;

import java.util.Scanner;

public class ArmStrongNumberMtoN {

	public static void main(String[] args) 
	{

		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a number.");
		int num1 = sc.nextInt();
		System.out.println("Enter a end number.");
		int num2 = sc.nextInt();
		
		for(int i=num1;i<=num2;i++)
		{
			int count=0;
			int num=0;
			int sum=0;
			for(int j=i;j!=0;j/=10)
			{
				count++;
		    }
			for(int k=i;k!=0;k/=10)
			{
				int pow=1;
				num=k%10;
				for(int l=1;l<=count;l++)
				{
					pow*=num;
				}
				sum+=pow;
			}
		if(sum==i)
		{
			System.out.print(sum+" ");
		}
		
		
	}
	}
}
