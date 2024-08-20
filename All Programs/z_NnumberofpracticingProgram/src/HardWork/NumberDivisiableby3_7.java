package HardWork;

import java.util.Scanner;

public class NumberDivisiableby3_7 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num...");
		int num=sc.nextInt();
		if(num%3==0 && num%7==0)
		{
			System.out.println("This number is divisible by both number...");
		}
		else if(num%3==0 || num%7==0)
		{
			System.out.println("This number is divisible by only one number either 3 or 7");
		}
		else
		{
			System.out.println("This number not divisible by 3 and 7");
		}
	}

}
