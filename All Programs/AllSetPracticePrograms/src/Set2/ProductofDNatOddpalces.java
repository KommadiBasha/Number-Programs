package Set2;

import java.util.Scanner;

public class ProductofDNatOddpalces {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Start number .");
		long a=sc.nextLong();
		System.out.println("end number .");
		long b= sc.nextLong();
		long product=1;
		
		for(long i=a;i<=b;i++)
		{
			if(i%2==1)
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
