package SecondTimeAllPrograms;

import java.util.Scanner;

public class Palindromeee {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the start number...");
		int m=sc.nextInt();
		
		int orignal=m;
		int store=0;
		while(m!=0)
		{
			int extra=m%10;
			store =(store*10)+extra;
			m/=10;	
		}
		if(store==orignal)
		System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}

}
