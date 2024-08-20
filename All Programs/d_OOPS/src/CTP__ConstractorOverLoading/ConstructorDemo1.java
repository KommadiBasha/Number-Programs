package CTP__ConstractorOverLoading;

public class ConstructorDemo1 
{
	String name;
	int id;
	long phonenumber;
	ConstructorDemo1(String name, int id, long phonenumber)
	{
		this.name=name;
		this.id=id;
		this.phonenumber=phonenumber;
	}
	public static void main(String[] args) 
	{
		ConstructorDemo1 c= new ConstructorDemo1("Sani",12,9985270826l);
		ConstructorDemo1 c1= new ConstructorDemo1("Sohil",16,9704432352l);
		System.out.println(c);
		System.out.println(c1);	
	}
	public String toString()
	{
		return name +" "+ id +" "+phonenumber;
	}
	
}