package HardWork;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		int rev=0;
		while(num>0)
		{
			int a=num%10;
			rev=(rev*10)+a;
			num/=10;
		}
		System.out.println(rev);
	}

}
