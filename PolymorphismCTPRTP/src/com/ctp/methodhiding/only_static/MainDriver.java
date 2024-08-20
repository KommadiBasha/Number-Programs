package com.ctp.methodhiding.only_static;

public class MainDriver {

	
	public static void main(String[] args) {
		
		
		ParentStaticMethods p= new ParentStaticMethods();
		p.methodNoArgument_NoReturn();System.out.println();
		p.methodWithArgument_NoReturn(404, "parent ref...");System.out.println();
		p.methodNoArgument_WithReturn();System.out.println();
		p.methodArgument_WithReturn(199.0, "parent with A_R");System.out.println();
		
		
		
		System.out.println();System.out.println("======= End parent refference=======");
		
		ChildStaticMethods c= new ChildStaticMethods();
		c.methodNoArgument_NoReturn();System.out.println();
		c.methodWithArgument_NoReturn(544, "child class ");System.out.println();
		c.methodNoArgument_WithReturn();System.out.println();
		c.methodArgument_WithReturn(458.5, "child class");
		
		System.out.println();System.out.println("======= End child refference=======");
		
		
		ParentStaticMethods p1=new ChildStaticMethods();
		p1.methodNoArgument_NoReturn();System.out.println();
		p1.methodWithArgument_NoReturn(404, "parent ref...");System.out.println();
		p1.methodNoArgument_WithReturn();System.out.println();
		p1.methodArgument_WithReturn(199.0, "parent with A_R");System.out.println();
		
		System.out.println();System.out.println("======= End parent refference=======");
		
		ParentStaticMethods p2=new ChildStaticMethods();
		ChildStaticMethods c2=(ChildStaticMethods)p2;
		c2.methodNoArgument_NoReturn();System.out.println();
		c2.methodWithArgument_NoReturn(544, "child class ");System.out.println();
		c2.methodNoArgument_WithReturn();System.out.println();
		c2.methodArgument_WithReturn(458.5, "child class");
		System.out.println();System.out.println("======= End child refference=======");
		
	}
}
