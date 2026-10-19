package com.akib.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	
	Shapes s = new Shapes();
	@Test
	void testAreaSquare() {
		assertEquals(25, s.areaSquare(5), "areSquare is failing");
	}
	
	@Test
	void testAreaRectangle() {
		assertEquals(15, s.areaRectangle(5, 3), "areaRectangle is failing");
	}

}
