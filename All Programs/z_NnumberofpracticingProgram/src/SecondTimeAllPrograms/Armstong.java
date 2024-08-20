package SecondTimeAllPrograms;

import java.util.Scanner;

public class Armstong {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number...");
		int num=sc.nextInt();
		
		int num1=num;
		int num2=num;
		int count=0;
		int sum=0;
		while(num1!=0)
		{
			count++;
			num1/=10;
		}
		while(num2!=0)
		{
			int revstore=num2%10;
			int pro=1;
			for(int i=1;i<=count;i++)
			{
				pro=pro*revstore;
			}
			sum +=pro;
			num2/=10;
		}
		if(sum==num)
		{
			System.out.println("Armstrong...");
		}
		else
			System.out.println("not a armstrong....");
	}

}
