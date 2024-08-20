package Arrays;

import java.util.Scanner;

public class ArrayMinNumber {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size...");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter elements...");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min =arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(min);

	}

}
