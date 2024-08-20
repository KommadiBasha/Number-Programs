package com.singleton.demo;

public class CreatingSingletonCLass {

	 static CreatingSingletonCLass  obj;
	private CreatingSingletonCLass() {
	
	}
	public static CreatingSingletonCLass creatingObject()
	{
		if(obj==null)
		{
			obj= new CreatingSingletonCLass();
		}
		return obj;
	}
	public static void main(String[] args) {
		System.out.println(obj.creatingObject());
		CreatingSingletonCLass c1= new CreatingSingletonCLass();
		CreatingSingletonCLass c2= new CreatingSingletonCLass();
		CreatingSingletonCLass c3= new CreatingSingletonCLass();
		System.out.println(c1.creatingObject());
		System.out.println(c2.creatingObject());
		System.out.println(c3.creatingObject());
		CreatingSingletonCLass c4= obj.creatingObject();
		CreatingSingletonCLass c5= obj.creatingObject();
		System.out.println(c4);
		System.out.println(c5);
	}
}
