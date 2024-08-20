package Set1;

import java.util.Scanner;

public class CheckVoweloNot {

	public static void main(String[] args)
	{
	Scanner sc= new Scanner (System.in);
	System.out.println("enter a char");
			char c=sc.next().charAt(0);
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(" This alphabate is vowel.."); break;
				default :
					System.out.println("This alphabate is not a vowel...");
			}
	}

}
