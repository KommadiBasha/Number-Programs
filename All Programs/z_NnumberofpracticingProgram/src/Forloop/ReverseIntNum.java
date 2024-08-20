package Forloop;

import java.util.Scanner;

public class ReverseIntNum {

	public static void main(String[] args) 
	{
	Scanner sc =new Scanner (System.in);
	System.out.println("enter a number...");
	int num=sc.nextInt();
	int rev=0;
	for(int i=0;i<=num;i++)
	{
		int last =num%10;
		rev=(rev*10)+last;
		num/=10;
	}
	System.out.println(rev);

	}

}
