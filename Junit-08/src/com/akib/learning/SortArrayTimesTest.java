package com.akib.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class SortArrayTimesTest {

	@Test
	void testSortArrayTimes() {
		SortArrayTimes sat = new SortArrayTimes();
		int arr[] = {4,3,2,1};
		assertTimeout(Duration.ofMillis(100), ()-> sat.sortArray(arr));
	}

}
