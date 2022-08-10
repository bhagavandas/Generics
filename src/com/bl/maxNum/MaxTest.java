package com.bl.maxNum;

public class MaxTest<T extends Comparable<T>> {
	
	T x, y, z;

	/**
	 * @param x
	 * @param y
	 * @param z
	 */
	public MaxTest(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T maximum() {
		return MaxTest.maximum(x, y, z);
	}

	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;

	}
	
	public static String testMaximum(String x, String y, String z) {
		String max = x;
		if(y.compareTo(max) > 0) {
			max = y;
		}
		if(z.compareTo(max) > 0) {
			max = z;
	}
		if(x.compareTo(max) > 0) {
			max = x;
	}
		printMax(x, y, z, max);
		return max;
	}
	
	
	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("Max of %s, %s and %s is %s\n", x, y, z, max);
	}
	

	public static void main(String[] args) {

		Integer xInt = 100, yInt = 200, zInt = 50;
		Float xF = 10.5f, yF = 7.5f, zF = 12.5f;
		String xStr = "Apple", yStr = "Orange", zStr = "PineApple";

		new MaxTest(xInt, yInt, zInt).maximum();
		new MaxTest(xF, yF, zF).maximum();
		new MaxTest(xStr, yStr, zStr).maximum();
		
		MaxTest.testMaximum(xStr, yStr, zStr);
	}
	

}
	
	
