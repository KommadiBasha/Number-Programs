package PerfectSquare;

import java.util.Scanner;

public class PerfectSquareM_N {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter m number");
		int m=sc.nextInt();
		
		System.out.println("enter n number");
		int n=sc.nextInt();
		
		for(int i=m;i<=n;i++)
		{
			int temp=i;
			int num=1;
			while(num<=i)
			{
				int square=num*num;
				num++;
				if(square==temp)
				{
					System.out.print(temp+" ");
					break;
				}
			}
		}
	}

}
