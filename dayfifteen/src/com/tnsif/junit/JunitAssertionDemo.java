/*
 * program to demonstrate on JUnit Aseertion methods
 */
package com.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

class JunitAssertionDemo {
	@Test
	void test() {
		/*
		 * fails if expression is not true
		 */
		assertTrue(10>5);
	}
	
	@Test
	void display() {
		/*
		 * fails when expression is not false
		 */
		assertFalse(10>5);
	}
	
	@Test
	void accept() {
		/*
		 * fails when actual is not null
		 */
		assertNull(null);
	}

	

}
