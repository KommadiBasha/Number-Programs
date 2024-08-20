package Set2;

import java.util.Scanner;

public class ProductofDNatEvenplaces {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Start number .");
		long a=sc.nextLong();
		System.out.println("end number .");
		long b= sc.nextLong();
		long product=1;
		
		for(long i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
				long take=i%1000;
				product=product*take;
			}
		}
		System.out.println();
		System.out.println(product);
	}

}
