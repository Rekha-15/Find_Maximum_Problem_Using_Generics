package com;

/**
 * MaximumCheck is an class of public type
 * @author rekha
 *
 */
public class MaximumCheck {
	
	/**
	 * checkMaximum is a method to check the maximum value in integer.
	 * calculating Maximum of Three Numbers using CompareTo method
	 *returning int max value
	 */
	
		public static int checkMaximum(Integer x, Integer y, Integer z) {
			Integer max = x;
			if(y.compareTo(max) > 0) {
				max = y; // y is largest now
			}
			if(z.compareTo(max) > 0) {
				max = z; // z is largest now
			}
			return max; // returns maximum number
		}
		
		/**
		 * checkMaximum is a method to check the maximum value in float.
		 * calculating Maximum of Three Numbers using CompareTo method
		 *returning float max value
		 */
		
		public static Double checkMaximum(Double d, Double e, Double f) {
			Double max = d;
			if(e.compareTo(max) > 0) {
				max = e; // e is largest now
			}
			if(f.compareTo(max) > 0) {
				max = f; // f is largest
			}
			return max; // returns maximum number
		}
		
		/**
		 * main method
		 *calling checkMaximum integer and float function
		 *printing max int value
		 *printing max float value
		 */
		
		public static void main(String[] args) {
			
			int c = checkMaximum(10,23,15);
			Double d = checkMaximum(12.5, 13.4, 22.0);
			System.out.println("The Maximum int value is : " +c);
			System.out.println("The Maximum float value is : " +d);
		}

}