package Set3;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a  number.");
		int num = sc.nextInt();
		int square=num*num;
		int sum = 0;
		while(square>0)
		{
			int last =square%10;
			sum=sum+last;
			square=square/10;
		}
		if(sum==num)
		{
			System.out.println("neon number");
		}
		else
		{
			System.out.println("not a neon.");
		}
	}
}
