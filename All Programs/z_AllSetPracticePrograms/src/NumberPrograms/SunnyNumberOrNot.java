package NumberPrograms;

import java.util.Scanner;

public class SunnyNumberOrNot {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner (System.in);
		System.out.println("enter num...");
		int num1=sc.nextInt();
		int square=num1+1;
		boolean flag=false;
		for(int i=1;i<=square/2;i++)
		{
			if(i*i==square)
			{
				flag=true;
			}
		}
		if(flag==true)
		{
			System.out.println("sunny number...");
		}
		else
		{
			System.out.println("not sunny...");
		}
		
		
		
	}

}
