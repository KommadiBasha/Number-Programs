package Arrays;

import java.util.Scanner;

public class ArraysLargestnum2Normal {

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
			for(int j=0;j<arr.length;j++)
			{
			if(arr[i]==arr[j] && arr[1]!=0 && arr[j]!=0)
			{
				arr[j]=0;
			}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				int temp =arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				}
			}
		}
		int [] domi=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				domi[k++]= domi[i];
			}
		
		if(arr.length>1)
		{
			System.out.println(arr[arr.length-2]);
			break;
		}
		else {
		System.out.println("no number...");
		}
		}
		
	}

}
