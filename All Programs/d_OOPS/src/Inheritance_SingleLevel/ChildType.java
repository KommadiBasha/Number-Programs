package Inheritance_SingleLevel;

public class ChildType extends ParentType
{

	public void childMethod()
	{
		System.out.println("child class method...");
	}
	public static void main(String[] args) 
	{
		System.out.println("child obj");
		
		ChildType c= new ChildType();
		
		c.methodType11();
		c.methodType12();
		System.out.println(s);
		System.out.println(num);
		c.childMethod();
		
		System.out.println("============================================");
		System.out.println("parent refference.....");
		
		ParentType p =new ParentType();
		
		p.methodType11();
		p.methodType12();
		//we con't call child method
		System.out.println("==============================================");
		System.out.println("parent refference child obj");
		
		//upcasting.........................................................
		ParentType p1= new ChildType();
		
		p1.methodType11();
		p1.methodType12();
		//we con't call child method
	
		//downcasting.......................................................
		
		ChildType downcasting= (ChildType) p1;
		
		downcasting.childMethod();
		downcasting.methodType11();
		downcasting.methodType12();
		
		
		System.out.println(s);
		System.out.println(num);
		
		
		
	}

}
