package Forloop;

public class ASCOrderNormal {

	public static void main(String[] args) 
	{
		int [] a=new int []{23,33,43,4,34245,213,35354,434,3,544,331};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
