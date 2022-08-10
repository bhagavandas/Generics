package com.bl.maxNum;

public class MaxNum {
	
	static Integer xInt = new Integer("700");
	static Integer yInt = new Integer("2000");
	static Integer zInt = new Integer("500");
	static Integer max;

	
	public static void main(String[] args) {
		getMaxInt();
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
}

