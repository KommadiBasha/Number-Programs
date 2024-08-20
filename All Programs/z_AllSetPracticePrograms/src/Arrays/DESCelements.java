package Arrays;

import java.util.Scanner;

public class DESCelements {

	public static void main(String[] args) 
	{	Scanner sc= new Scanner(System.in);
	System.out.println("enter size");
	int size=sc.nextInt();
	int [] arr= new int[size];
	System.out.println("enter values ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("elements printing...");
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		
		}}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
	}

	}

}
