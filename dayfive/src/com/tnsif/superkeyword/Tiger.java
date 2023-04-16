package com.tnsif.superkeyword;

public class Tiger extends Animal{

	//private data members
    public String animalType="Tiger-wild";
    public int noOfLegs=4;
    
    public void display()
    {
    	//super keyword method
    	super.display();
    	//super keyword with variable
    	System.out.println(super.animalType);
    	System.out.println(super.noOfLegs);
  	  System.out.println("Animal Type: "+animalType);
  	  System.out.println("No. of Legs are: "+noOfLegs);
  	  
  	   }

	     
//default constructor
	public Tiger() {
		//invoking the parent class contructor
		//it calls parents class default constructor
		super();
		System.out.println("Tiger class constructor-Child");
	}



	@Override
	public String toString() {
		return "Tiger [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
	}
    

}



