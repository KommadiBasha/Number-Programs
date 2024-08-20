package Encapsulation;

import java.util.Scanner;

public class DemoPro {

	
	private String name;
	private int id;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		DemoPro d=new DemoPro();
		System.out.println("enter value to set name");
		String s=sc.nextLine();
		d.setName(s);
		
		System.out.println("enter value to set id");
		int i=sc.nextInt();
		d.setId(i);

		
		System.out.println(d.getName()+"  "+d.getId());
	}

}
