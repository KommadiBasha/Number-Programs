package EncapsulationWithSetGetters;

public class MainDriver {

	public static void main(String[] args) 
	{
		Demo1 d= new Demo1();
			  d.set(101,"Sani");
			  System.out.println(d.getId());
			  System.out.println(d.getName());
			  
			  System.out.println(d.getId()+"..."+d.getName());
	}

}
