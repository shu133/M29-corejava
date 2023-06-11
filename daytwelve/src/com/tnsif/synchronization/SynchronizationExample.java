//driver class
//program to demonstrate using synchronization

package com.tnsif.synchronization;

public class SynchronizationExample {

	public static void main(String[] args) {
		Power obj=new Power();
		Threadone t1=new Threadone(obj);
		ThreadTwo t2=new ThreadTwo(obj);
		t1.start();
		t2.start();


		

	}

}
