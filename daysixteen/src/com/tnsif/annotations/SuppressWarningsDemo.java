package com.tnsif.annotations;
import java.util.*;

public class SuppressWarningsDemo {
	/*
	 * we can remove the warnings using below annotations
	 */
	@SuppressWarnings("unchecked")

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		Set s=new TreeSet();
		s.add(12);
		s.add(23);
		s.add("shubhangi");
		System.out.println(s);

	}

}
