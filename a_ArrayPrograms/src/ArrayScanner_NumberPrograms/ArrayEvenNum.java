package ArrayScanner_NumberPrograms;

import java.util.Scanner;

public class ArrayEvenNum 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length...");
		int len= sc.nextInt();
		
		int [] arr= new int[len];
		
		for(int i=0;i<len;i++)
		{
			arr[i]=i;
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
