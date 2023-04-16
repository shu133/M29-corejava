package com.tnsif.firstpackage;

public class AccessSpecifierExecutor {

	public static void main(String[] args) {
		Base b=new Base();
		b.methodDefault();
		b.methodPublic();
		b.methodProtected();
		/*
		 * private member we cant access into another class
		 */
		//b.varPrivate;
		//b.methodPrivate();
		

	}

}
