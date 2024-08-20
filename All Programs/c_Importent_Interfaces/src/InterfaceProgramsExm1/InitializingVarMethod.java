package InterfaceProgramsExm1;

public class InitializingVarMethod implements DeclaringVarMethods
{
	@Override
	public void study() 
	{
		System.out.println("My schooling was completed in Nalanda LOyola and  RGM ");
		
	}
	public void skills()
	{
		System.out.println("I know java sql j2ee");
	}
	public static void main(String[] args) {
		DeclaringVarMethods d= new InitializingVarMethod();
		 		 System.out.println(d.db);
		 		 System.out.println(d.age);
		 		 d.study();
		 		 
	}
	
}
