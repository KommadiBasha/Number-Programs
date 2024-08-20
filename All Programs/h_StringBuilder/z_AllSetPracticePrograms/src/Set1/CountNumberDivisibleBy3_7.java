package Set1;

import java.util.Scanner;

public class CountNumberDivisibleBy3_7 {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number m :");
	int m=sc.nextInt();
	System.out.println("Enter number n :");
	int n=sc.nextInt();
	int count =0;
	for(int i=m;i<n;i++)
	{
		if(i%3==0 && i%7==0)
		{
			System.out.print(i+" ");
			count++;
		}
	}
	System.out.print(count);
	}
}

//Enter number m :
//1
//Enter number n :
//50
//21 42 2
//21 42 63 84 105 126 147 168 189 210 231 252 273 294 315 336 357 378 399 (19)