package com.tnsif.junit;


import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;



class JunitAssumptionDemo {

	@Test
	void test() {
		Assumptions.assumeTrue(12==12);
	}
	
	@Test
	void display() {
		Assumptions.assumeFalse(12==12);
	}
}
