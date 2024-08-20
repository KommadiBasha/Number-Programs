package com.ctp.methodhiding.only_static;

public class ParentStaticMethods {

	public static void methodNoArgument_NoReturn()
	{
		System.out.println(" methodOne ParentClass No-Argument _ No-return type...");
	}
	
	public static void methodWithArgument_NoReturn(int i, String s)
	{
		System.out.println(" methodWithArgument_NoReturn ParentClass");
		System.out.println(i + " "+ s);
	}
	public static String methodNoArgument_WithReturn()
	{
		System.out.println(" methodNoArgument_WithReturn ParentClass");
		System.out.println("Parent methodNoArgument_WithReturn() return type is String");
		return "methodNoArgument_WithReturn()  Parent class.";
	}
	public static String methodArgument_WithReturn(double d,String s)
	{
		System.out.println(" methodArgument_WithReturn ParentClass");
		System.out.println(d+"  "+s);
		System.out.println("Parent methodArgument_WithReturn() return type is String");
		return "methodArgument_WithReturn()  Parent- class.";
	}
	
}
