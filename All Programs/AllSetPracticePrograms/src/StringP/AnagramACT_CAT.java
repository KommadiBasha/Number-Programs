package StringP;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramACT_CAT {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string First word");
		String s1=sc.nextLine();
		System.out.println("Enter a string second word");
		String s2=sc.nextLine();
		char [] c1=s1.toCharArray();
		char [] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("not a anagram");
			}
		}
	

}
