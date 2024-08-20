package Set2;

import java.util.Scanner;

public class SwappingNumber {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter  a values");
		int a=77;
		System.out.println("b value");
		int b=43;
	
		if(a>b ||a<b)
		{
			int temp=a;
			a=b;
			b=temp;
		}
		System.out.println("a value "+a);
		System.out.println("b value "+b);
	}

}
