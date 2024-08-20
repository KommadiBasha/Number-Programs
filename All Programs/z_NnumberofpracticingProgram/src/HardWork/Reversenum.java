package HardWork;

import java.util.Scanner;

public class Reversenum {

	public static void main(String[] args) 
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		
		while(num!=0)
		{
		 int last=num%10;
		 System.out.print(last);
		 num/=10;
		}
	}

}
