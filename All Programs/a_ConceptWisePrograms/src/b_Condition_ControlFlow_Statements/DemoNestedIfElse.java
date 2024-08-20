package b_Condition_ControlFlow_Statements;

public class DemoNestedIfElse {

	public static void main(String[] args) 
	{
		System.out.println("check age and weight ");
		int age=22;
		int weight=60;
		if(age >20)
		{
			if(weight>50)
			{
				System.out.println("Elligible for donate blood");
			}
			else
			{
				System.out.println("weight is not elligible");
			}
		}
		else
		{
			System.out.println("age is not elligible ");
		}
	}

}
