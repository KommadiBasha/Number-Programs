package Arrays;

import java.util.Scanner;

public class CopyArrayByScanner {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size ");
		int size= sc.nextInt();
		System.out.println("enter values...");
		int [] orgarray= new int[size];
		int [] copyarray= new int [size];
		for(int i=0;i<orgarray.length;i++)
		{
			orgarray[i]=sc.nextInt();
			
		}
		for(int i=0;i<orgarray.length;i++)
		{
			System.out.println(orgarray[i]);
			//copy of array initilizing here
			copyarray[i]=orgarray[i];
		}
		System.out.println();
		for(int i=0;i<orgarray.length;i++)
		{
				System.out.println(copyarray[i]);
		}
	}

}
