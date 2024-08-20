package MtoNPrintProgams;

import java.util.Scanner;
//Not worked...
public class LeapYear {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter start year number...");
		int start=sc.nextInt();
		
		System.out.println("enter end year number...");
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			if(i%4==0 && i%100==0 || i%400==0)
			{
				System.out.println(i +"leap year...................................................");
			}
			else
			{
				System.out.println(i+"not leap year...");
			}
		}
		

	}

}
