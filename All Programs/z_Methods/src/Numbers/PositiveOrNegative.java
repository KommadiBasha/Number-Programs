package Numbers;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		if(num>0)
		{
			System.out.println("positive");
		}
		else
		{
			System.out.println("negative");
		}

	}

}