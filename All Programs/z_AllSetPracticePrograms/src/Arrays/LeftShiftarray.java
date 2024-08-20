package Arrays;

import java.util.Scanner;

public class LeftShiftarray {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int [] arr= new int[size];
		System.out.println("enter values ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter how many times want to shift ...");
		int countshift=sc.nextInt();
		for(int i=1;i<=countshift;i++)
		{
			int temp=arr[0];
			for(int j=1;j<arr.length;j++)
			{
				arr[j-1]=arr[j];
			}
			arr[arr.length-1]=temp;	
			}
			
			for(int print:arr)
			{
				System.out.print(print+" ");
			}
			
		
	}

}
