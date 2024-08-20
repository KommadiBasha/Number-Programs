package com.string.immutable;

public final class ImmutableType 
{
	private String name;
	
	
	public ImmutableType(String n) 
	{
		this.name = n;
	}
	public ImmutableType contModify(String s)
	{
		
		if(this.name==s)
		{
			return this;
		}
		else
		{
			return (new ImmutableType(s));
		}
		
	}
	public static void main(String[] args)
	{
		
		ImmutableType i= new ImmutableType("Sani");
		
		ImmutableType i1= i.contModify("Sohil");
		ImmutableType i2= i.contModify("Sani");
		ImmutableType i3=i.contModify(".Sani");
		
		System.out.println(i==i);//f
		System.out.println(i1==i2);
		System.out.println(i2==i3);
		System.out.println(i3==i);
		System.out.println(i==i2);
		
		
		System.out.println(i.equals(i));
		System.out.println(i1.equals(i2));
		System.out.println(i2.equals(i3));
		System.out.println(i3.equals(i));
		System.out.println(i.equals(i2));
		
	}
}
