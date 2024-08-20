package TernaryOperator;

public class PracticingProgram {

	public static void main(String[] args) 
	{
		long x,y,z;
		x=323l;
		y=6543454l;
		z=2229l;
		
		String s=(x>y && y>z)?("x is greater..."):((y>x && y>z)?("y is greater"):("z is greater..."));
	
		System.out.println(s);
	}

}
