package com.bl.maxNum;

public class MaxNumber {
	public static void main(String[] args) {

		getMaxNum();
		

	}

	public static void getMaxNum() {

		Integer num1 = new Integer("100");
		Integer num2 = new Integer("200");
		Integer num3 = new Integer("50");

		int res = num1.compareTo(num2);
		if (res > 0) {
			System.out.println("obj1 is greater than obj2");
		} else if (res < 0) {
			System.out.println("obj1 is less than obj2");
		} else {
			System.out.println("obj1 is equal to obj2");
		}

		int res1 = num2.compareTo(num3);
		if (res1 > 0) {
			System.out.println("obj2 is greater than obj3");
		} else if (res1 < 0) {
			System.out.println("obj2 is less than obj3");
		} else {
			System.out.println("obj2 is equal to obj3");
		}

		int res2 = num1.compareTo(num3);
		if (res1 > 0) {
			System.out.println("obj1 is greater than obj3");
		} else if (res2 < 0) {
			System.out.println("obj1 is less than obj3");
		} else {
			System.out.println("obj1 is equal to obj3");
		}

		System.out.println();
		if (num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + " is the maximum Integer number.");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " is the maximum Integer number.");
		} else {
			System.out.println(num3 + " is the maximum Integer number.");
		}
		System.out.println();
	}

	
}

