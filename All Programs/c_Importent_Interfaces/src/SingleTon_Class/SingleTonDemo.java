package SingleTon_Class;

public class SingleTonDemo {
	static SingleTonDemo s = null;

	private SingleTonDemo() {

	}

	public static SingleTonDemo getInstance() {
		if (s == null) {
			s = new SingleTonDemo();
		}
		return s;
	}

	public static void main(String[] args) 
	{
		System.out.println(s.getInstance());
		System.out.println("..............");
		SingleTonDemo s1= new SingleTonDemo();
		
		System.out.println(s1.getInstance());
		
SingleTonDemo s2= new SingleTonDemo();
		
		System.out.println(s2.getInstance());
		
	}
}
