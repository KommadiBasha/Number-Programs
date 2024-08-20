package StringArray;

import java.util.Scanner;

public class StringRemoveSpace {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string...");
		String s=sc.nextLine();
		
		String store="";
		for(int i=0;i<s.length();i++)
		{
			
			if(i>=0 && s.charAt(i)!=' ')
			{
				store=store+s.charAt(i);
			}
		}
		System.out.println(store);
	}

}
