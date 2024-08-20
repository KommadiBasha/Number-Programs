package Arrays;

import java.util.Scanner;

public class RightShift {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter array size ");
		int size=sc.nextInt();
		System.out.println("elements");
		int [] arr= new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter how many time right shift");
		int rightcount=sc.nextInt();
		for(int i=1;i<=rightcount;i++)
		{
			int temp=arr[arr.length-1];
			for(int j=arr.length-2;j>=0;j--)
			{
				arr[j+1]=arr[j];
			}
			arr[0]=temp;
		}
		for(int print:arr)
		{
			System.out.print(print+" ");
		}

	}

}
