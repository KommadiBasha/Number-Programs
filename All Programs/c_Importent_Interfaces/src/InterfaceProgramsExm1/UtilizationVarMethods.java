package InterfaceProgramsExm1;

public class UtilizationVarMethods extends InitializingVarMethod
{
	public static void main(String[] args) 
	{
		//System.out.println(DeclaringVarMethods.db);
		//System.out.println(DeclaringVarMethods.age);
		
		InitializingVarMethod i= new InitializingVarMethod();
		

		System.out.println(i.db);
		System.out.println(i.age);
		i.study();
		i.skills();
		
	}
}
