package com.akib.learning;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MutiplyArrayElementsTest {

	@Test
	void testMutilply() {
		MutiplyArrayElements ma = new MutiplyArrayElements();
		int arr[] = {1, 2, 3, 4, 5};
		int expected[] = {2, 4, 6, 8, 10}; 
		assertArrayEquals(expected, ma.multiply(arr));
	}

}
