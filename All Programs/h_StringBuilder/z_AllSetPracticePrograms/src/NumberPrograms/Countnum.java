package NumberPrograms;

import java.util.Scanner;

public class Countnum {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number...");
		int number=sc.nextInt();
		int count=0;
		while(number!=0)
		{
			count++;
			number/=10;
		}
		System.out.println(count);
	}

}
