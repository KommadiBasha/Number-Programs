package Set3;

import java.util.Scanner;

public class Swapping
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("enter a number one...");
		int num1=sc.nextInt();
		
		System.out.println("enter a number two...");
		int num2=sc.nextInt();
		System.out.println(num1 );
		System.out.println(num2);
		System.out.println("swapped...");
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println(num1);
		System.out.println(num2);
	}
}
