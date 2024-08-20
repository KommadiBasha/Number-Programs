package String;

import java.util.Scanner;

public class DefaultMethod_ReplaceMultipleSpaceWithSingleSpace {

	public static void main(String[] args)
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("enter string...");
		String str=sc.nextLine();
	/*
	 enter string...
                   public         static  void   main                
	after triming....
	public         static  void   main
	 
	 trim is just used for from start and end points it trims remaning same....
	 */
		
		
		 str= str.trim();
		 System.out.println("after triming....");
		System.out.println(str);
	}

}
