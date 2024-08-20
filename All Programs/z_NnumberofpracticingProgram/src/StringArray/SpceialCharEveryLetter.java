package StringArray;

import java.util.Scanner;

public class SpceialCharEveryLetter {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string...");
	String str=sc.nextLine();
	String store="";
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)!=' ')
		{
			store=store+str.charAt(i);
			store=store+'-';
		}
	}
	//store=store.substring(0, store.length()-1);
	System.out.println(store);
}
}
