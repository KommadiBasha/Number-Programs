package Array_1D;

import java.util.Scanner;

public class Arrayinitialization {

	public static void main(String[] args) 
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
		arrayinitialization(elements);
		
	}
	public static void arrayinitialization(int [] arr)
	{
		System.out.print(arr[3]);
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		
			
		}
		
	}
}
