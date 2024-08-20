package com.ctp.methodhiding.only_static;

public class ChildStaticMethods extends ParentStaticMethods
{

	public static void methodNoArgument_NoReturn()
	{
		System.out.println(" methodOne ChildClass No-Argument _ No-return type...");
	}
	public static void methodWithArgument_NoReturn(int i, String s)
	{
		System.out.println(" methodWithArgument_NoReturn ChildClass");
		System.out.println(i + " "+ s);
	}
	public static String methodNoArgument_WithReturn()
	{
		System.out.println(" methodNoArgument_WithReturn ChildClass");
		System.out.println("Child methodNoArgument_WithReturn() return type is String");
		return "methodNoArgument_WithReturn()  Child- class.";
	}
	
	public static String methodArgument_WithReturn(double d,String s)
	{
		System.out.println(" methodArgument_WithReturn ChildClass");
		System.out.println(d+"  "+s);
		System.out.println("child methodArgument_WithReturn() return type is String");
		return "methodArgument_WithReturn()  Child- class.";
	}
}
