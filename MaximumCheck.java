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
		 * checkMaximum is a method to check the maximum in 3 strings.
		 * calculating Maximum in 3 string using CompareTo method
		 *returning max string value
		 */
		// Calculating maximum of 3 Strings
		public static String checkMaximum(String s1, String s2, String s3) {
			String max = s1;
			if(s2.compareTo(max) > 0) {
				max = s2; // s2 is Maximum now 
			}
			if(s3.compareTo(max) > 0) {
				max = s3; // s3 is Maximum now
			}
			return max; // returns maximum value
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
			String s = checkMaximum("Apple", "Peach", "Banana");
			System.out.println("The Maximum int value is : " +c);
			System.out.println("The Maximum float value is : " +d);
			System.out.println("The Maximum String value is : " +s);
		}

}