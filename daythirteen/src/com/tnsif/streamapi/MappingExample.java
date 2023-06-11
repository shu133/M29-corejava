//program to demonstrate map operation

package com.tnsif.streamapi;
import java.util.Arrays;
import java.util.List;


public class MappingExample {

	public static void main(String[] args) {
		//using collection
		List<String>obj=Arrays.asList("shubhangi","rahul","umesh");
		obj.stream().map(i->i.length()).forEach((i)->System.out.print(i+" "));

	}

}
