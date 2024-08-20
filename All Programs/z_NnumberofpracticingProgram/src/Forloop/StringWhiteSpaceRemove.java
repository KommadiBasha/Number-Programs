package Forloop;

import java.util.Scanner;

public class StringWhiteSpaceRemove {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string...");
		String ref=sc.nextLine();
		String under="-";
		String space="";
		for(int i=ref.length()-1;i>=0;i--)
		{
			if(ref.charAt(i)!=0 && ref.charAt(i)!=' ')
			{
				space=space+ref.charAt(i);
				space=space+under;
			}
		}
		System.out.println(space);
		System.out.println();
		System.out.println(under);
	}

}
