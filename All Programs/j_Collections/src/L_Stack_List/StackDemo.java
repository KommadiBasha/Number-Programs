package L_Stack_List;

import java.util.Stack;

public class StackDemo implements Comparable
{
	public static void main(String[] args) {
		Stack s= new Stack();
		
		s.add("sani");
		s.push("Sohil");
		s.push("2999");
		s.push(120.00);
		s.push(true);
		s.push(null);
		
		
		System.out.println(s);
	}
	@Override
	public int compareTo(Object o) {
		Integer i= (Integer)o;
		
		return i;
	}
	
}
