package EvenOddNumbers;

import java.util.Scanner;

public class EvenNumberMtoN {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter Start number...");
		int m=sc.nextInt();
		System.out.println("Enter End Number...");
		int n=sc.nextInt();
		
		for(int i=m;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
