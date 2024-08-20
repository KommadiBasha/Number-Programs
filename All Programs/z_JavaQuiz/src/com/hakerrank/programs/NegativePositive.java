package com.hakerrank.programs;

public class NegativePositive {
	  public static void main(String [] args) 
	   {
	       int [] size={-4,3,-9,0,4,1};
	       int count=0;
	       
	       for(int i=0;i<size.length;i++)
	       {
	    	   count++; 
	       }
	       
	       int negCount=0;
	    	int posCount=0;
	    	 int zeroCount = 0;
	    	 for(int i=0;i<size.length;i++)
		       {
	    		 if(size[i]<0)
	    		 {
	    			 negCount++;
	    		 }
	    		 else if(size[i]>0)
	    		 {
	    			
	    			 posCount++;
	    		 }
	    		 else
	    		 {
	    			 zeroCount++;
	    		 }
	    		
		       }
	      negValue(count, negCount);
	      posValue(zeroCount, posCount);
	      zeroValue(count, zeroCount);
	       
	   }
	    public static void negValue(int count1, int negCount1)
	    {
	    	int storeNeg=0;
	    	if(count1!=0)
	    	{
	    		storeNeg=negCount1/count1;
	    	}
	    	System.out.println(storeNeg);
	    }
	    public static void posValue(int count1, int posCount1)
	    {
	    	int storePos=0;
	    }
	    public static void zeroValue(int count1, int zeroCount)
	    {
	    	int storeZero=0;
	    }
	}


