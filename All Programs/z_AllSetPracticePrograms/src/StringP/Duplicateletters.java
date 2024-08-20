package StringP;

import java.util.Scanner;

public class Duplicateletters {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string First word");
		String s1=sc.nextLine();
		int count=0;
		char c[]=s1.toCharArray();
		for(int i=0;i<=c.length;i++)
		{
			count=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j] && c[i]!=' ')
				{
					count++;
					c[j]='0';
				}
			}
			if(count>1 && c[i]!='0')
			{
				System.out.print(c[i]+" ");
			}
		}

	}

}
