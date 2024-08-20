package StringP;

import java.util.Scanner;

public class DuplicateWrodsInString {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string First word");
		String s1=sc.nextLine();
		int count;
		s1=s1.toLowerCase();
		
		String [] arr=s1.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i].equals(arr[j]))
				{
					count++;
				
				arr[j]="O";
			}
			}
			if(count>1 && arr[i]!="O")
			{
				System.out.print(arr[i]+" ");
			}
			
		}
		
	}

}
