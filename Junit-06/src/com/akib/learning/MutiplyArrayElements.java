package com.akib.learning;

public class MutiplyArrayElements {
	
	public int[] multiply(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			arr[i] *= 2;
		}
		
		return arr;
	}
}
