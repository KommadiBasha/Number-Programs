package Arrays;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter common size for every array ");
		int size=sc.nextInt();
		
		int [] a= new int[size];
		int [] b=new int[size];
		int [] c=new int[size*2];
		System.out.println("enter the elements of a array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the elements of b array");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("elements are ");
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		int j=0;
		for(int i=a.length;i<c.length;i++)
		{
			c[i]=b[j++];
		}
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		}

	}

}
//for(int i=0;i<a.length;i++)
//{
//	System.out.println(a[i]);
//}
//for(int i=0;i<b.length;i++)
//{
//	System.out.println(b[i]);
//}
