package Set3;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a  number.");
		int num = sc.nextInt();
		int num1=num;
		int sum=0;
		while(num>0)
		{
			int last= num%10;
			int factor=1;
			for(int i=1;i<=last;i++)
			{
				factor=factor*i;
			}
			sum=sum+factor;
			num/=10;
		}
		if(num1==sum)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not a strong number");
		}
	

	}
}
