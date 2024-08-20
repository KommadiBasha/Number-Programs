package Array_1D;

import java.util.Scanner;

public class AddingElementAtFirstIndex {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int [] main=elementsInitialization();
		printAllValues(main);
		System.out.println("Enter the element to add first index");
		int newElement1=sc.nextInt();
		int [] modifiedElement1=addelementatposition1(main,newElement1);
		System.out.println("After adding...");
		printAllValues(modifiedElement1);
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
	public static void printAllValues(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static int[] addelementatposition1( int [] arr,int newElement)
	{
		int [] resArr=new int[arr.length+1];
		
		resArr[0]=newElement;
		
		for(int i=0;i<arr.length;i++)
		{
			resArr[i+1]=arr[i];
		}
		return resArr;
	}
	
}
