package Set2;

import java.util.Scanner;

public class SunofDNatOdd {

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner (System.in);
	System.out.println("Start number .");
	int a=sc.nextInt();
	System.out.println("end number .");
	int b= sc.nextInt();
	int sum=0;
	for (int i=a;i<=b;i++)
	{
		if(i%2==1)
		{
			System.out.print(i+" ");
			int extract=i%100;
			sum=extract+sum;
		}
	}
	System.out.println();
	System.out.print(sum);
	}

}
