package EvenOddNumbers;

import java.util.Scanner;

public class CountEvenOddNumber {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter Start number...");
		int m=sc.nextInt();
		System.out.println("Enter End Number...");
		int n=sc.nextInt();
		int countEven=0;
		int countOdd=0;
		for(int i=m;i<=n;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
				countEven++;
			}
			else
			{
				System.out.println(i);
				countOdd++;
			}
		}
		System.out.println(" total even  number count"+countEven);
		System.out.println(" total odd  number count"+countOdd);
	}

}