package com.bl.maxNum;

public class MaxNum {
	
	static Integer xInt = new Integer("700");
	static Integer yInt = new Integer("20");
	static Integer zInt = new Integer("500");
	static Integer max;
	
	static Float xF = new Float(120.5f);
	static Float yF = new Float(200.5f);
	static Float zF = new Float(5.5f);
	static Float max1;
	
	static String xStr = new String("Apple");
	static String yStr = new String("PineApple");
	static String zStr = new String("Banana");
	static int max2;

	
	public static void main(String[] args) {
		getMaxInt();
		getMaxFloat();
		getMaxString();
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
	
	public static void getMaxString() {
		String max2 = xStr;
		
		int res = (yStr).compareTo(max2);
		int res1 = zStr.compareTo(max2);
		int res2 = xStr.compareTo(max2);
	
		if (res > 0) {
			max2 = yStr;
			System.out.println("Maximum Float number is: " + max2);
			
		} else if (res1 > 0) {
			max2 = zStr;
			System.out.println("Maximum Float number is: " + max2);
		}
		
		else  {
			max2 = xStr;
			System.out.println("Maximum Float number is: " + max2);
		}
		
		}
	
}


