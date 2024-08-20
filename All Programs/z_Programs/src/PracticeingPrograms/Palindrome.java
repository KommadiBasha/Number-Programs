package PracticeingPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a numbver");
	int num  =sc.nextInt();
	int temp=num;
	int store=0;
	boolean b=false;
	while(num>0)
	{
		int last=num%10;
		store=store*10+last;
		if(store==temp)
		{
			b=true;
		}
		num/=10;
	}
	if(b==true)
	{
		System.out.println("palindrome...");
	}
	else
		
	System.out.println("not palindrome");
	

	}

}
