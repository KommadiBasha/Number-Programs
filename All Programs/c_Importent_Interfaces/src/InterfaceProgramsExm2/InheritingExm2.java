package InterfaceProgramsExm2;

import javax.tools.DocumentationTool.Location;

public class InheritingExm2 implements Exm2
{
	@Override
	public void location() 
	{
		System.out.println("Bangalore.....");
	}
	
	@Override
	public void job() 
	{
	System.out.println("Web development BackEnd");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(s);
		System.out.println(money);
		Exm2  e= new  InheritingExm2();
		e.location();
		e.job();
	
	}
}
