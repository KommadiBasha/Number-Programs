package NumberPrograms;

import java.util.Scanner;

public class DuckNumberofNot {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter num...");
		int num=sc.nextInt();
		
		boolean b= false;
		while(num!=0)
		{
			int rev=num%10;	
			if(rev==0 )
			{
				b=true;
			}
			num/=10;
		}
		if(b==true)
		{
			System.out.println("Duck number...");
			
		}
		else
		{
			System.out.println("not a duck number...");
		}
		
	
	}

}
