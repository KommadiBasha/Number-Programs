package HardWork;

import java.util.Scanner;

public class FibanacciSeries {

	public static void main(String[] args) 
	{
		int num1=0;
		int num2=1;
		int num3;
	Scanner sc =new Scanner(System.in);
	int number=sc.nextInt();
	for(int i=1;i<=number;i++)
	{
		System.out.println(num1);
		num3=num1+num2;
		num1=num2;
		num2=num3;
		
	}
	}

}
