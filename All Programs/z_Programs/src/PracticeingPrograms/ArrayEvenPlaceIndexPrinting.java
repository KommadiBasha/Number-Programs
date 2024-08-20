package PracticeingPrograms;

import java.util.Scanner;

public class ArrayEvenPlaceIndexPrinting {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size..");
		int size=sc.nextInt();
		int [] arr= new int[size];
		System.out.println("enter array values..");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("array values are...");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==1)
			{
			System.out.print(arr[i]+" ");
			}
		}
	}

}
