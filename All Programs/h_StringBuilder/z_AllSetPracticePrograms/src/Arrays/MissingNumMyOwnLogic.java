package Arrays;

public class MissingNumMyOwnLogic {

	public static void main(String[] args) 
	{
		int [] arr=new int[] {1,2,3,4,6,7,8,9,};
		int arrsize=arr.length;
		int arrsizesum= arrsize*(arrsize+1)/2;
		int totalsum=0;
		int actualnum=0;
		for(int i=0;i<arr.length-1;i++)
		{
			totalsum=totalsum+arr[i];
			actualnum=arrsizesum-totalsum;
		}
		System.out.println(actualnum);
	}

}
