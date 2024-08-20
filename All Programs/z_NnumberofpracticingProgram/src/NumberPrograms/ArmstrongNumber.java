package NumberPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number....");
		int num=sc.nextInt();
		
		int num1=num;
		int num2=num;
		int count=0;
		int sum=0;
		while(num1>0)
		{
			count++;
			num1/=10;
		}
		while(num2>0)
		{
			int last=num2%10;
			int fact=1;
			for(int i=1;i<=count;i++)
			{
				fact=fact*last;
				
			}
			sum+=fact;
			num2/=10;
		}
		System.out.println("sum ................"+sum  +"     "+"num.........."+num);
		if(num==sum)
		{
			System.out.println("Armstrong number");
		}
		else
			System.out.println("not a armstrong number");
	}

}
