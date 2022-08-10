package com.bl.maxNum;

public class MaxNum {
	
	static Integer xInt = new Integer("70");
	static Integer yInt = new Integer("20");
	static Integer zInt = new Integer("500");
	static Integer max;
	
	static Float xF = new Float(120.5);
	static Float yF = new Float(20.5);
	static Float zF = new Float(5.5);
	static Float max1;

	
	public static void main(String[] args) {
		getMaxInt();
		getMaxFloat();
	}

	
	
	public static void getMaxInt() {
		max = xInt;
		int res = yInt.compareTo(max);
		int res1 = zInt.compareTo(max);
		int res2 = xInt.compareTo(max);
		
		if (res > 0) {
			max = yInt;
			System.out.println("Maximum Integer is: " + max);
		} else if (res1 > 0) {
			max = zInt;
			System.out.println("Maximum Integer is: " + max);
		}
		else  {
			max = xInt;
			System.out.println("Maximum Integer is: " + max);
		}
		
		}
	
	public static void getMaxFloat() {
		max1 = xF;
		int res = yF.compareTo(max1);
		int res1 = zF.compareTo(max1);
		int res2 = xF.compareTo(max1);
		
		if (res > 0) {
			max1 = yF;
			System.out.println("Maximum Float number is: " + max1);
		} else if (res1 > 0) {
			max1 = zF;
			System.out.println("Maximum Float number is: " + max1);
		}
		else  {
			max1 = xF;
			System.out.println("Maximum Float number is: " + max1);
		}
		
		}
}

