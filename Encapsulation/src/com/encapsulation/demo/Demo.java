package com.encapsulation.demo;

public class Demo {

	private String name;
	private int id;
	
	
	public void setName(String n, int i)
	{
		this.name=n;
		this.id=i;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public static void main(String[] args) {
		Demo d= new Demo();
		d.setName("Sani", 404);
		System.out.println(	d.getId());
		System.out.println(	d.getName());
	;
	}
}
