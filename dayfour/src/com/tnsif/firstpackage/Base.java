//program to demonstrate on package
package com.tnsif.firstpackage;

public class Base {
	//declaring all the access specifier with variable
	int varDefault=10;
	public String varpublic="john";
	private int vatprivate=221;
	protected float varprotected=34900.50f;
	//declaring all the access specifier with methods
	void methodDefault()
	{
		System.out.println("Default access method"+varDefault);
	}
	public void methodPublic()
	{
		System.out.println("public access method"+varpublic);
	}
	private void methodPrivat()
	{
		System.out.println("private access method"+vatprivate);
	}
	protected void methodProtected()
	{
		System.out.println("protected access method"+varprotected);
	}

	
}
