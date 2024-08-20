package Constructors;

public class InitiallyGivenigCapacity_Constructor {

	public static void main(String[] args) 
	{
		StringBuffer sb= new StringBuffer(1111);
		sb.append("a");
		System.out.println(sb.capacity());


	}

}
