package HardWork;

import java.util.Scanner;

public class Armstrongnum {

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
	int num1=num;
	int num2=num;
	int count=0;
	int sum=0;
	while(num>0)
	{
		count++;
		num/=10;
	}
	while(num1>0)
	{
		int last=num1%10;
		int pow=1;
		for(int i=1;i<=count;i++)
		{
			pow=pow*last;
		}
		sum=sum+pow;
		num1/=10;	
	}
	if(sum==num2)
	{
		System.out.println("armstrong...");
	}
	else
	{
		System.out.println("not a armstrong...");
	}
	}
}
