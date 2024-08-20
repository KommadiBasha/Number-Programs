package Arrays;

import java.util.Scanner;

public class TotalNoofElementsinArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int [] num=new int [size];
		System.out.println("enter elements ");
		int count=0;
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		for(int j=0;j<num.length;j++)
		{
			count++;
			//System.out.println(num[j]);
		}
		System.out.println(num.length+"     "+"countvar "+count );
	}

}
