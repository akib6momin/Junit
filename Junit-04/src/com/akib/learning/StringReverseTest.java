package com.akib.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringReverseTest {
	
	StringReverse sr = new StringReverse();
	
	@Test
	void testStringReverse_oneWord() {
		assertEquals("avaJ", sr.rev("Java"));
	}
	
	@Test
	void testStringReverse_multiWord() {
		assertEquals("elpmiS sI avaJ", sr.rev("Java Is Simple"));
	}

}
