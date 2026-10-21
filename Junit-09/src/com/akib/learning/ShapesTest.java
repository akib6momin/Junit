package com.akib.learning;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapesTest {
	
	Shapes s;
	@BeforeEach
	void init() {
		s = new Shapes();
		System.out.println("Before Test");
	}
	

	@Test
	void testAreaRectangle() {
		assertEquals(15, s.areaRectangle(5, 3));
		System.out.println("Test Running");
	}
	
	@Test
	void testAreaCircle() {
		assertEquals(50.24, s.areaCircle(4), 0.001);
		System.out.println("Test Running");
	}
	
	@AfterEach
	void destroy() {
		System.out.println("Test Resources Cleaned");
	}

}
