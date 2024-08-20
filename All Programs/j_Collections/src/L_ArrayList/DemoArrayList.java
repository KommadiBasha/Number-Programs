package L_ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class DemoArrayList 
{

	public static void main(String[] args) 
	{
		
		//DemoArrayList d= new DemoArrayList	(new ComparatorClass());
		ArrayList al= new ArrayList ( );
		ArrayList al1= new ArrayList();
		al.add("Marker Interface");
		al.add("Fubctional interface");
		al.add("interface");
		al.add("adapter Class");
		al.add("SingleTon Class");
		al.add("Abstarct keyword ");
		al.add("Abstarct class");
		al.add("Comparable interface");
		al.add("comparator interface");
		al.add("String");
		al.add("Object class");
		al.add("system");
		al.add("exception class");
		al.add("Throwable");
		al.add(2229);
		al.add(199.0);
		al.add("abcdefghijklmnopqrstuvwxyz");
		//System.out.println(al+" ");
		al1.addAll(al);
		
//		for(Object o:al)
//		{
//			System.out.print(al+" ");
//			
//		}
		System.out.println(al1);
	
	}

}
