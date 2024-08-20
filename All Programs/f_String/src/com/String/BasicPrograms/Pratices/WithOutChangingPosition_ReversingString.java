package com.String.BasicPrograms.Pratices;

public class WithOutChangingPosition_ReversingString {

	public static void main(String[] args) throws InterruptedException{
		
		
		String s= "the sky is blue";
		String str="";
		for (int i=0;i<s.length();i++)
		{
			int j=i;
			System.out.print(" j value "+ j);
			Thread.sleep(1000);
			System.out.println();
			while(i<s.length() && s.charAt(i)!=' ')
			{
				
				i++;
				Thread.sleep(1000);
				System.out.print(" i value "+i);
				
				
			}
			System.out.println();
			for(int k=i-1;k>=j;k--)
			{
				Thread.sleep(1000);
				System.out.print(" k value "+k);
				str=str+s.charAt(k);
			}
			System.out.println();
			//str=str+' ';
		}
      System.out.println(str);
//		System.out.println(s.length());
		
	}
}
// "t h e   s k y   i s    b   l   u   e";
//  0 1 2 3 4 5 6 7 8 9 10 11  12  13  14
//j value 0

//i value 1 i value 2 i value 3
//k value 2 k value 1 k value 0 eht

//j value 4
//i value 5 i value 6 i value 7 
//k value 6 k value 5 k value 4  yks

//j value 8
//i value 9 i value 10
//k value 9 k value 8  si

//j value 11
//i value 12 i value 13 i value 14 i value 15
//k value 14 k value 13 k value 12 k value 11 eulb

//				ehtykssieulb
//			eht   yks  si eulb
