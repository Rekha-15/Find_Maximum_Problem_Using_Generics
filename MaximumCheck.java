package com;

/**
 * MaximumCheck is a class of public type
 */

public class MaximumCheck {
	
	/**
	 * Calculating Maximum of 3 Integers, Floating point, Strings
	 * return max value
	 * @param elements
	 * @param x
	 * @param y
	 * @param z
	 */
	
	public static <T extends Comparable<T>> T checkMaximum(T x, T y, T z) {
		T max = x;
		if(y.compareTo(max) > 0) {
			max = y; // y is maximum now
		}
		if(z.compareTo(max) > 0) {
			max = z; // z is maximum now
		}
		return max; 
	}
	
	/**
	 * @param <T>
	 * @param elements
	 * @return
	 */
	public static <T extends Comparable<T>> T checkMaximum_With_MoreThan_ThreeParameters(T... elements) {
		T max = elements[0];
		for(T maximumParametereter : elements) {
			if(maximumParametereter.compareTo(max) > 0) {
				max = maximumParametereter;
			}
		}
		return max;
	}
	
	/**
	 * main method
	 * calling function checkMaximum
	 */

	public static void main(String[] args) {
		Integer c = checkMaximum(10,23,15);
		Double d = checkMaximum(12.5, 13.4, 22.0);
		String s = checkMaximum("Apple", "Peach", "Banana");
		Integer c1 = checkMaximum_With_MoreThan_ThreeParameters(10,23,15,20,24);
		Double d1 = checkMaximum_With_MoreThan_ThreeParameters(12.5, 13.4, 22.0,24.0,20.8);
		String s1 = checkMaximum_With_MoreThan_ThreeParameters("Apple", "Peach", "Banana", "Mango", "Orange"); 
		System.out.println("The maximum integer value in 10, 23, 15 is : " +c);
		System.out.println("The maximum float value in 12.5, 13.4, 22.0 is : " +d);
		System.out.println("The maximum float value in Apple ,Peach, Banana is: " +s);
		System.out.println("The maximum integer value is : " +c1);
		System.out.println("The maximum float value is : " +d1);
		System.out.println("The maximum string value is : " +s1);
	}

}