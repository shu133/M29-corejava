package com.tnsif.inheritance;

public class Android {

	//private data members
    private String brand;
    private String ownerName;
    //getters and setters method
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Android() {
		System.out.println("Dafault constructor");
		brand="Realme";
		ownerName="Li BingZhong";
	}
	public Android(String brand, String ownerName) {
		super();
		this.brand = brand;
		this.ownerName = ownerName;
	}
	
	
	
	
    
    
    
}
