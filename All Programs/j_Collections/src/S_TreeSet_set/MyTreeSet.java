package S_TreeSet_set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet 
{
	public static void main(String[] args) {
		TreeSet al=new TreeSet(new MyComparator());
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
		
		System.out.println(al);
	}
}
