package com.akib.learning.dao;

public class SpringCourse implements Course{
	
	public boolean coursePurchased() {
		System.out.println("Spring Boot Course Purchased");
		return true;
	}
}
