package ConstrctorPrograms;

public class AnotherVarCls extends Variablescls
{
	int p;
	int q;
	int r;
	public AnotherVarCls(int x, int y, int z, int p, int q, int r) 
	{
		super(x, y, z);
		this.p = p;
		this.q = q;
		this.r = r;
	}
	@Override
	public String toString() 
	{
		
		return x+" "+y+" "+z+" "+p+" "+q+" "+r;
	}
	public static void main(String[] args) 
	{
		AnotherVarCls a= new AnotherVarCls(10,11,12,100,111,122);
		AnotherVarCls a1= new AnotherVarCls(1,2,3,4,5,6);
		System.out.println(a);
		System.out.println(a1);
	}
}
