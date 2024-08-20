package FirstRoundPractiesAllPrograms;

public class SwappingWithOut3rdVar {

	public static void main(String[] args) 
	{
		int num1=44;
		int num2=99;
		
		System.out.println(num1);
		System.out.println(num2);
		
		num1=num1+num2;// 44+99  ->143
		num2=num1-num2;//143-99 ->44
		num1=num1-num2;//143-44 -> 99
		
		System.out.println("after swaping num1 "+num1);
		System.out.println("after swaping num2 "+num2);
		
	}

}
