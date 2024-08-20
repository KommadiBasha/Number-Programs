package Set2;

import java.util.Scanner;

public class SumofDNatEven {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number...");
		int num =sc.nextInt();
		System.out.println("upto number .");
		int num1=sc.nextInt();
		int sum=0;
		for(int i=num;i<=num1;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
				int extract=i%1000;
				sum=sum+extract;
			}
		}
		System.out.println();
		System.out.println(sum);
	}

}
