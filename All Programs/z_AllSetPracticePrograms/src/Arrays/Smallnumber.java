package Arrays;

public class Smallnumber {

	public static void main(String[] args) 
	{
		int [] a= {22,4,5,26,50};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
