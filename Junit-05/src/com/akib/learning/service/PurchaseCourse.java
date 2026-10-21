package com.akib.learning.service;

import com.akib.learning.dao.Course;

public class PurchaseCourse {
	
	public boolean purchase(Course course) {
		return course.coursePurchased();
	}
}
