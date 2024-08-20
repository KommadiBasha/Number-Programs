package NumberPrograms;

import java.util.Scanner;

public class X_power_N {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the base number...");
		int x=sc.nextInt();
		System.out.println("Enter power Number...");
		int n=sc.nextInt();
		int product=1;
		for(int i=1;i<=n;i++)
		{
			product=product*x;
		}
		System.out.println(product);
	}

}
