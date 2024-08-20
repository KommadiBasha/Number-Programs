package Array_1D;

import java.util.Scanner;

public class ArrayProgram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter length");
		int len=sc.nextInt();
		int [] arr=new int[len];
		System.out.println("enter values");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
 		for(int i:arr)
 		{
 			System.out.print(i+" ");
 		}
	}

}
