package PerfectNumberPrograms;

import java.util.Scanner;

public class PerfectNumberMtoN_W {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter m number");
		int m=sc.nextInt();
		System.out.println("Enter n number");
		int n=sc.nextInt();
		
		for(int i=m;i<=n;i++)
		{
			int sum=0,divisible=1;
			int temp=i;
			while(divisible<=i/2)
			{
				if(i%divisible==0)
				{
					sum=sum+divisible;
				}
				divisible++;
			}
			if(temp==sum)
			{
				System.out.println(temp);
			}
			
		}

	}

}
