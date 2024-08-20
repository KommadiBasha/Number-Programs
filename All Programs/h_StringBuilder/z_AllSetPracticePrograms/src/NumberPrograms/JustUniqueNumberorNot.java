package NumberPrograms;

import java.util.Scanner;

public class JustUniqueNumberorNot {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter numbers...");
		
		int number =sc.nextInt();
		int num=number;
		int num1=number;
		int count=0;
		while(num>0)
		{
			int rev= num%10;
			while(num1>0)
			{
				int rev1=num1%10;
				if(rev==rev1)
				{
					count++;
				}
				num1/=10;
			}
			num/=10;
			
		}
		if(count==1)
		{
			System.out.print("unique number are :"+number);
		}
		else
		{
			System.out.println("not unique :"+number);
		}
		
	}

}
