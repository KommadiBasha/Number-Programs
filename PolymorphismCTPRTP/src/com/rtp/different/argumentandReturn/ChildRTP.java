package com.rtp.different.argumentandReturn;

public class ChildRTP extends ParentRTP{
	
	@Override
	public String myName() {
		// TODO Auto-generated method stub
		return "child class ";
	}
	@Override
	public int nickName(String s) {
		System.out.println(s);
		return 123;
	}
}
