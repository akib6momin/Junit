package com.akib.learning.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.akib.learning.dao.JavaCourse;
import com.akib.learning.dao.SpringCourse;

class PurchaseCourseTest {

	@Test
	void test() {
		PurchaseCourse pc = new PurchaseCourse();
		assertTrue(pc.purchase(new JavaCourse()));
	}

}
