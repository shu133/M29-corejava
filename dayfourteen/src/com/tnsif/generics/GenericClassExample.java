//program to demonstrate on generic class

package com.tnsif.generics;

//generic class
class GenericClass<T>{
	T x;
	void print(T x)
	{
		this.x=x;
	}
	T accept()
	{
		return x;
	}
}
//driver class

public class GenericClassExample {

	public static void main(String[] args) {
		GenericClass<String>obj=new GenericClass<>();
		obj.print("shubhangi");
		System.out.println(obj.accept());

	}

}
