package AbstarctClassExam1;

public class Utilizationxm1 extends Exam1
{
	
	int p;
	int q;
	int r;
	public Utilizationxm1(int x, int y, int z, int p, int q, int r) 
	{
		super(x,y,z);
		this.p=p;
		this.q=q;
		this.r=r;
	}
	public void display()
	{
		System.out.println(x+" "+y+" "+z+" "+p+" "+q+" "+r);
	}
	@Override
	public void method()
	{
		System.out.println("hello every one...");
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		Utilizationxm1 u = new Utilizationxm1(10,11,12,20,21,22);
		u.display();
		u.method();
		int numbers=u.hashCode();
		System.out.println(u);
		
		
		
	}
}
