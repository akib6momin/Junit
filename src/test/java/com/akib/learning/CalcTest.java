package com.akib.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		Calc c = new Calc();
		int actual = c.add(5, 3);
		int expected = 8;
		assertEquals(expected, actual);
	}

}
