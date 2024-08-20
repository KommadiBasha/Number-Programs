package HardWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ASCsortmethod {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("enter size..");
		int size =sc.nextInt();
		
		
		int [] arr= new int [size];
		System.out.println("enter elements....");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{ 
			Arrays.sort(arr);
			System.out.print(arr[i]+" ");
		}
	}

}
