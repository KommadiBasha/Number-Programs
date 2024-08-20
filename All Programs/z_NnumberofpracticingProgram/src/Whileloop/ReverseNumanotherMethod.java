package Whileloop;

import java.util.Scanner;

public class ReverseNumanotherMethod {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("enter a number...");
		int num=sc.nextInt();
		int rev=0;
		while(num!=0)
		{
			int last=num%10;
			System.out.print(last+" ");
			num/=10;
		}
		//System.out.println(rev);

	}

}
