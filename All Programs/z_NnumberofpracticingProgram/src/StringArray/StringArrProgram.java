package StringArray;

import java.util.Scanner;

public class StringArrProgram {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter words  ");
	String st=sc.nextLine();
	String rev="";
	for(int i=st.length();i>0;i--)
	{
		
		rev=rev+st.charAt(i-1);
		
	}
	System.out.print(rev);
}
}
