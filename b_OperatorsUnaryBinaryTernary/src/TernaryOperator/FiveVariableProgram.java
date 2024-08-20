package TernaryOperator;

public class FiveVariableProgram {

	public static void main(String[] args) 
	{
		short p=0464;
		short q=2229;
		short r=9985;
		
		short x,y,z;
		
		x=323;
		y=4345;
		z=383;
		
				 
String s=(p>q && p>r && p>x && p>y && p>z)?			("p is greater..."):
		 ((q>r && q>x && q>y && q>z && q>p)?		("q is grater"):
		 (((r>q && r>x && r>y && r>z && r>p)?		("r is grater "):		 
		 ((((x>q && x>r && x>y && x>z && x>p)?		("x is greater..."):
	     (((((y>q && y>r && y>x && y>p && y>z)?		("y is greater.."):		
	     ((((((z>q && z>r && z>x && z>p && z>y)?	("z is greater..."):("No lage number..."))))))))))))))));
	System.out.println(s);
	}

}
