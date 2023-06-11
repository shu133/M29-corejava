//program to demonstrate on filtering

package com.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList("shubhangi","rahul","umesh");
		obj.stream().filter((i->i.length()>5)).forEach((i)->
		System.out.println(i+" "));
		
		obj.stream().distinct().forEach((i)->
		System.out.println(i+" "));
		
		obj.stream().limit(2).forEach((i)->
		System.out.println(i+" "));
		
		obj.stream().skip(3).forEach((i)->
		System.out.println(i+" "));

	}

}
