//program to demonstrate on generic method

package com.tnsif.generics;
class GenericMethod{
	//generic method
	public <E> void print(E[] arr1) {
		for(E itr:arr1) {
			System.out.println(itr+" ");
		}
		System.out.println();
	}
}

public class GenericMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericMethod g = new GenericMethod();
		Integer[] arr1 = {11, 22, 33};
		Character[] arr2 = {'f','k','a'};
		System.out.println("Integer array:- ");
		g.print(arr1);
		System.out.println("Character array:- ");
		g.print(arr2);

	}

}
