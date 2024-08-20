package NumberPrograms;

import java.util.Scanner;

public class UniqueNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number...");
		int number =sc.nextInt();
		
		int num1=number;
		int num2=number;
		
	
		
		int count=0;
		
		while(num1>0)
		{
			int rev1=num1%10;
				while(num2>0)
				{
					int rev2=num2%10;
					if(rev1==rev2)
					{
						count++;
						
					}
				num2/=10;
				}
		num1/=10;
		}
		
		if(count==1 )
		{
			System.out.println("unique");
			
		}
		else
		{
			System.out.println("not unique...");
		}
	}

}
