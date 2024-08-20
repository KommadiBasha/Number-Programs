package Set3;

import java.util.Scanner;

public class XpowerN {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a Base number.");
		int m=sc.nextInt();
		
		System.out.println("Enter a Power number.");
		int n=sc.nextInt();
		
		int product=1;
		for(int i=1;i<=n;i++)
		{
			product=product*m;
		}
		System.out.println(product);
	}

}
