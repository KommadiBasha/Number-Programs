package Forloop;

import java.util.Scanner;

public class ReverseLongNun {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter a number...");
		long num=123456789l;
		
		long rev=0;
		for(int i=0;i<=num;i++)
		{
			long last =num%10;
			rev=(rev*10)+last;
			num/=10;
		}
		System.out.println(rev);

	}

}
