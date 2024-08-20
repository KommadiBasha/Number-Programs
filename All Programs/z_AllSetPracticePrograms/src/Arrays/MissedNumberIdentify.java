package Arrays;

import java.util.Scanner;

public class MissedNumberIdentify {

	public static void main(String[] args) 
	{
		
		int [] num= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,16};
		int size=num.length;
		int sum= size*(size+1)/2;
		int actualsum=0;
		for(int i=0;i<num.length-1;i++)
		{
			actualsum=actualsum+num[i];
			
		}
		System.out.println("missing number :"+ (sum-actualsum));

	}

}
