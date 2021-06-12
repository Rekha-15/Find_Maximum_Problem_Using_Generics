package com;
public class MaximumCheck  {
	
	/**
	 * @param element 1
	 * @param element 2
	 * @param element 3
	 * @return Maximum of 3 of any Type
	 */
	public  <T extends Comparable<T>> T maxOfAnything(T x ,T y , T z) {
		T max=x;
		if(y.compareTo(max)>0)
			max=y;
		if(z.compareTo(max)>0)
			max=z;
		return max;	
	}


	/**
	 * Main method
	 * MaximumCheck is a class and created a object called m 
	 */

	public static void main(String[] args) {
		MaximumCheck m = new MaximumCheck();
		System.out.println(m.maxOfAnything(12.5, 13.4, 22.0));
		System.out.println(m.maxOfAnything(10,23,15));
		System.out.println(m.maxOfAnything("Apple", "Peach", "Banana"));
		
		
	}

}