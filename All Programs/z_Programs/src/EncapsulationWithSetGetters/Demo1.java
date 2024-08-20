package EncapsulationWithSetGetters;

public class Demo1
{
 private int id;
 private String name;
	
 public void set(int id,String name)
 {
	 this.id=id;
	 this.name=name;
 }
 
 public int getId()
 {
	return id; 
 }
public String getName()
{
	return name;
}
}
