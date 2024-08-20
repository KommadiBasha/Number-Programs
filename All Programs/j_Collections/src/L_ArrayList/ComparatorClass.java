package L_ArrayList;

import java.util.Collection;
import java.util.Comparator;

public class ComparatorClass implements Comparator
{
 @Override
 public int compare(Object o1, Object o2) 
 	{
	String i1=(String)o1;
	String i2=(String)o2;
	 
	return i2.compareTo(i1);
 	}
}
