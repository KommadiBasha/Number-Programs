package com.StringBuffer.DefaultMethods;

public class DefaultMethods {
public static void main(String[] args) {
	String s="I am Using String in StringBuffer class";
	StringBuffer sbcapacity= new StringBuffer(1000);
	StringBuffer sb1= new StringBuffer(s);
	StringBuffer sb2= new StringBuffer("THis is StringBuffer Class");
	System.out.println(sbcapacity.capacity());
	sb1.append(false);
	System.out.println(sb1);
	StringBuilder sb= new StringBuilder();
	
}
}
