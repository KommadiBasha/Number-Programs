package Numbers;

import java.util.Scanner;

public class FindingDigit {

	public static void main(String[] args) 
	{
		inputs();
	}
	public static void inputs()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number...");
		int enternum=sc.nextInt();
		
		System.out.println("search number");
		int searchnum=sc.nextInt();
		search(enternum,searchnum);
	}
	public static void search(int num,int digit)
	{
		boolean flag=true;
		while(num>0)
		{
			if(num%10==digit)
			{
				System.out.println("number founded ");
				flag=false;
				break;
			}
			num/=10;
		}
		if(flag)
		{
			System.out.println("not found...");
		}
	}
	
	
	
}
