package Set3;

import java.util.Scanner;

public class FibanacciSeries {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a  number.");
		int num = sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		for(int i=1;i<=num;i++)
		{
			int c=a+b;
			System.out.print(" "+c+" ");
			a=b;
			b=c;
		}
	}
}
