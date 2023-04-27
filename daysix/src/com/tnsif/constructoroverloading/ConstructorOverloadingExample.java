package com.tnsif.constructoroverloading;

public class ConstructorOverloadingExample {

	private int x;
	private int y;
	
	//constructor overloading
	public ConstructorOverloadingExample()
	{
		System.out.println("default constructor");
	}
	public ConstructorOverloadingExample(int x)
	{
		System.out.println("parameterized constructor"+x);
	}
	public ConstructorOverloadingExample(int x,int y)
	{
		System.out.println("parameterized constructor"+x+""+y);
	}

}
