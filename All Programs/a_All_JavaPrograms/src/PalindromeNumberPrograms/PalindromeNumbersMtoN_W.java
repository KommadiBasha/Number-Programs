package PalindromeNumberPrograms;

import java.util.Scanner;

public class PalindromeNumbersMtoN_W {
//pending..............................................................
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter m value...");
		int m=sc.nextInt();
		
		int temp=m;
		boolean b=false;
		int sum=0;
		while(temp>0)
		{
				int last=temp%10;
				sum=(sum*10)+last;
				temp/=10;
					
		}
		if(sum==m)
		{
			System.out.println("palindome...");
		}
		while(b==true)
		{
			System.out.print(m+" ");
			m++;
		}
		
	}

}
