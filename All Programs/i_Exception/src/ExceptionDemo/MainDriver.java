package ExceptionDemo;

import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args)
	{
		System.out.println("Hello...");
		
		try {
			m2();
		}
		catch(ProgramForException p)
		{
			System.out.println("Exception Handled...");
		}
	}
	public static void m1() throws ProgramForException
	{
		throw new ProgramForException("m1 method ");
	}
	public static void m2() throws ProgramForException
	{
		m1();
	}

}
