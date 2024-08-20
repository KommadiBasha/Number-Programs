package ExceptionDemo;

public class DriverDemo {

	public static void main(String[] args) throws Exception{

		int i=9;
		
		if(i!=10)
		{
			throw new ExceptionDemo("exception occured");
		}

	}

}
