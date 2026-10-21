package com.akib.learning;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortArrayTest {

	@Test
	void testSortArray_Exception() {
		// First Way
//		try {
//			SortArray sa = new SortArray();
//			int unsorted[] = {4,3,2,1};
//			int sorted[] = sa.sortArray(unsorted);
//			for(int ele : sorted) {
//				System.out.println(ele+" ");
//			}
//			fail();
//			
//		}catch(NullPointerException e) {
//			System.out.println("Exception Generated");
//		}
		
		// second Way
		SortArray sa = new SortArray();
		int unsorted[] = null;
		assertThrows(NullPointerException.class, () -> sa.sortArray(unsorted));
	}

}
