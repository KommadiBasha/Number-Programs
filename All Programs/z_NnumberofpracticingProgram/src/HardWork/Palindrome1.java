package HardWork;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number...");
		int m=sc.nextInt();
		System.out.println("enter numer last");
		int n=sc.nextInt();
		
		while(m>0)
			{
			int rev=m%10;
			System.out.print(rev+" ");
			m/=10;
			}
		
		

	}

}
