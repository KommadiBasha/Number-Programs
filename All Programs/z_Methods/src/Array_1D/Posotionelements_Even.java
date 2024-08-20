package Array_1D;

import java.util.Scanner;

public class Posotionelements_Even {

	public static void main(String[] args) 
	{
		int [] main=elementsInitialization();
		printEvenValues(main);
		for(int i=0;i<main.length;i++)
		{
			if(main[i]%2==0)
			{
				System.out.println(main[i]);
			}
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
