package Arrays;

import java.util.Scanner;

public class UserinputSum {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array ");
		int size=sc.nextInt();
		int [] num=new int[size];
		System.out.println("Enter the elements ");
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		for(int j=0;j<num.length;j++)
		{
			
			sum=sum+num[j];
			
		}
		System.out.println("total sum "+sum);
	}

}
