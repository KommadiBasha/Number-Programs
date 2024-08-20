package Set2;

import java.util.Scanner;

public class FactorialOfNumner {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Start number .");
		int a=sc.nextInt();
		int factor=1;
		while(a>0)
		{
			factor=factor*a;
			a--;
		}
		System.out.println(factor);
	}

}
