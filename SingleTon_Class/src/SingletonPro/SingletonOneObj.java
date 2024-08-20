package SingletonPro;

public class SingletonOneObj {

	static SingletonOneObj singletonOneObj=null;
	
	private SingletonOneObj() {
		
	}
	
	public static SingletonOneObj objectcreate()
	{
		if (singletonOneObj==null)
		{
		singletonOneObj=new SingletonOneObj();	
		}
		return singletonOneObj;
	}
	
	public static void main(String[] args) {
		System.out.println(singletonOneObj.objectcreate());
		SingletonOneObj s1=new SingletonOneObj();
		SingletonOneObj s2=new SingletonOneObj();
		
		
		System.out.println(s1);
		
		
		System.out.println(s1.objectcreate());
		System.out.println(s2.objectcreate());
	}
}
