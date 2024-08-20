package Arrays;

public class DuplicatesElements {

	public static void main(String[] args) 
	{
		int [] ele= {22,4,3,55,66,3,22};
		
		for(int i=0; i<ele.length;i++)
		{
			for(int j=i+1; j<ele.length;j++)
			{
		
			  if(ele[i]==ele[j])
			  {
				  System.out.print(ele[i]+" ");
			  }
			}
	}
	}
}
