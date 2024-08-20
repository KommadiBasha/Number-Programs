package Arrays;

import java.util.Scanner;

public class ArrayLargest3rdNormalway {

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
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
			count++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && arr[i]!=0 && arr[j]!=0) 
				{
					arr[j]=0;
				}		
			}
		}
		int extra [] =new int[arr.length-count];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				extra[k++]=arr[i];
			}
		}
		for(int i=0;i<extra.length;i++)
		{
			for(int j=i+1;j<extra.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=extra[j];
					extra[j]=extra[i];
					extra[i]=temp;
				}
			}
		}
		if(arr.length>2)
		{
			System.out.println("3rd largest :"+arr[arr.length-3]);
		}
		else
		{
			System.out.println("No largest num...");
		}
		
	}

}
