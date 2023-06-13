package com.tnsif.junit;

import org.junit.jupiter.api.RepeatedTest;
class RepeatedDemo {

	@RepeatedTest(3)
	void test() {
		System.out.println("Hello ");
	}

}
