package ConvertingDecimal_to_Binary;

import java.util.Scanner;

public class ConDecimal_to_Binary {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number...");
		int num=sc.nextInt();
		
		String bin="";
		int rem=0;
		while(num!=0)
		{
			rem =num%2;
			bin = rem+bin;
			num=num/2;
		}
		System.out.println(bin);
		

	}

}
