package Set3;

import java.util.Scanner;

public class Fibanacci {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number.");
		int num = sc.nextInt();
		int f1=0;
		int f2=1;
		int f3;
		for(int i=1;i<=num;i++)
		{
			System.out.print(f1+" ");
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}

	}

}
