package NumberPrograms;

import java.util.Scanner;

public class FibanaciiSeries {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);

		System.out.println("enter the number...");
		int m=sc.nextInt();
		int a=0;
		int b=1;
		for(int i=0;i<=m;i++)
		{
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
			
		}
	

	}

}
