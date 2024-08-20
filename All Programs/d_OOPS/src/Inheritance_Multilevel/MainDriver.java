package Inheritance_Multilevel;

public class MainDriver {

	public static void main(String[] args) 
	{
		FirstClass f1= new FirstClass();
		SecondClass s1= new SecondClass();
		ThirdClass t1= new ThirdClass();
		FourthClass c1= new FourthClass();
		System.out.println("All above class created object...");
		System.out.println("==============================...");
		System.out.println(f1.fristNonStatic());
		f1.firstStatic();
		System.out.println("above statements are upto first class");
		System.out.println("......................................");
		System.out.println(s1.name);
		System.out.println(t1.name);
		System.out.println(c1.name);
		s1.secondStatic();
		t1.thirdStatic();
		System.out.println("===========1st,2nd,3rd class parent class for 4th class");
		
		c1.firstStatic();c1.secondStatic();c1.thirdStatic();c1.fourthStatic();

	}

}
