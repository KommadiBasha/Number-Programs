package HardWork;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a number.");
		int num=sc.nextInt();
		int num1=num;
		int num2=num;
		int sum=0;
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		while(num1>0)
		{
			int last=num1%10;
			int power=1;
			for(int i=1;i<=count;i++)
			{
				power=power*last;
			}
			sum=sum+power;
			num1/=10;
		}
		if(num2==sum)
		{
			System.out.println("Armstrong number..");
		}
		else
		{
			System.out.println("Not a Armstrong ");
		}
	}

}
