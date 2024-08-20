package Arrays;

import java.util.Scanner;

public class DuplicatesRemove {

	public static void main(String[] args) 
	{
	int [] arr= {2,3,4,8,8,8,9,7,2,5,1,1,4,5};

	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	for(int i=0;i<arr.length;i++)
	{
		
		for(int j=i+1;j<arr.length;j++)
		{
			
			if(arr[i]>arr[j])
			{
			int order =arr[j];
				arr[j]=arr[i];
				arr[i]=order;
			}
		}
	}
	
	int count=0;
	for(int i=0;i<arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	
		if(arr[i]!=arr[i+1])
		{
			arr[count]=arr[i];
			count++;
		}	
	}	
	System.out.println();
	arr[count]=arr[arr.length-1];
	for(int i=0;i<count+1;i++)
	{
		System.out.print(arr[i]+" ");
	}

	
		
		
	}
}
