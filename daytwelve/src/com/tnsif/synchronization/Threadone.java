package com.tnsif.synchronization;

public class Threadone extends Thread {
	Power p;

	public Threadone(Power p) {
		super();
		this.p = p;
	}
	public void run()
	{
		p.printPower(5);
	}
	
	
}
