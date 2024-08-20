package Array_1D;

import java.util.Scanner;

public class Positionevenelements {

	public static void main(String[] args) 
	{
		int [] main=elementsInitialization();
		printEvenValues(main);
		for(int i=1;i<main.length;i+=2)
		{
				System.out.println(main[i]);
		}
		
	}
	public static int[] elementsInitialization()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter array size....");
		int size=sc.nextInt();
		System.out.println("enter values....");
		int [] elements=new int[size];
		for(int i=0;i<elements.length;i++)
		{
			elements[i]=sc.nextInt();
		}
		return elements;
		
	}
	public static void printEvenValues(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			
		}
		
	}
}
