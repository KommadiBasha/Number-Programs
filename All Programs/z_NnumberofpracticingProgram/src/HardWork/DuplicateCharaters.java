package HardWork;

import java.util.Scanner;

public class DuplicateCharaters {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string word");
		String s1=sc.nextLine();
		
		int count=0;
		char [] arr=s1.toCharArray();
		for(int i=0;i<=arr.length;i++)
		{
			count=1;
			for(int j=i+1;j<=arr.length;j++)
			{
				if(arr[i]==arr[j] && arr[i]!=' ')
				{
				count++;
				arr[j]=' ';
				}
			}
			if(count>1 && arr[i]!=' ')
			{
				System.out.println(arr[i]);
			}
		}
	}

}
