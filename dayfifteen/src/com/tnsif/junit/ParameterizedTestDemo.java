package com.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


//import org.junit.jupiter.api.Test;

class ParameterizedTestDemo {

	/*
	 * to perform parameterized test
	 */
	@ParameterizedTest
	@ValueSource(strings= {"shubhangi","priti","Vishnavi"})
	void test() {
		System.out.println("Parameterized Test"+" Test");
	}

	@ParameterizedTest
	@ValueSource(strings= {"sonu","monu"})
	void accept(String str) {
		assertNotNull(str);
	}

}
