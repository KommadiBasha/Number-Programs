package Set2;

import java.util.Scanner;

public class SumAndProductIsEqualorNot {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number...");
		int num =sc.nextInt();
		int product=1;
		int sum=0;
		int count=0;
	while(num>0)
	{
		int last =num%10;
		
		product=product*last;
		sum=sum+last;
		
		num/=10;
		count++;
	}
	System.out.println(product);
	System.out.println(sum);
	if(product==sum)
	{
		System.out.println("The number is SPY number");
	}
	else
		System.out.println("Not a spy number");
	}

}
