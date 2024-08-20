package b_Condition_ControlFlow_Statements;

import java.util.Scanner;

public class DemoSwitch {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number b/w 1 to 5 we will get in string format");
		int num=sc.nextInt();
		switch(num)
		{
		case 1:
		{
			System.out.println("One");
			break;
		}
		case 2:
		{
			System.out.println("Two");
			break;
		}
		case 3:
		{
			System.out.println("Three");
			break;
		}
		case 4:
		{
			System.out.println("Four");
			break;
		}
		case 5:
		{
			System.out.println("Five");
			break;
		}
		default:
		{
			System.out.println("out of range");
			break;
		}
		}
	}

}
