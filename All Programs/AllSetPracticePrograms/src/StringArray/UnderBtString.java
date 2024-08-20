package StringArray;

import java.util.Scanner;

public class UnderBtString {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter String size");
		String [] arr=new String [sc.nextInt()];
		System.out.println("Enter string");
		sc.nextLine();
		String under="-";
		String space="";
		String store="";
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextLine();
		}
		for(int i=0;i<arr.length;i++)
		{
			store=arr[i];
			//System.out.print(arr[i]);
			//arr[i].length()!=' ' && 
			if(store.length()!=0 && store.charAt(i)!=' ')
			{
				space=space+arr[i].charAt(i);
			}
			

		}
		System.out.print(space);
	}

}
