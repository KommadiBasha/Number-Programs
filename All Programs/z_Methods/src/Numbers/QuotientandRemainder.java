package Numbers;

import java.util.Scanner;

public class QuotientandRemainder {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		
		int last= toGetLastNum(num);
		System.out.println("remainder i.e extracting last num by using % symbol "+last);
		int remove= removeLastNum(num);
		System.out.println("remove last number by using / symbol "+remove);
	}
	public static int toGetLastNum(int  lastnum)
	{
		int rem=lastnum%10;
		return rem;
		
	}
	public static int removeLastNum(int removenum)
	{
		int remove=removenum/10;
		
		return remove;
		
	}

}
