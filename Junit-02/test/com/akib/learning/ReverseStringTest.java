package com.akib.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString rv = new ReverseString();
		assertEquals(rv.rev("Java"), "avaJ");
		assertEquals(rv.rev("Akib"), "kib");
	}

}