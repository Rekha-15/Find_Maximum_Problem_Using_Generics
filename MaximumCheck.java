package com;
public class MaximumCheck  {
	
	/**
	 * @param x
	 * @param y
	 * @param z
	 * @return Maximum of 3 of integer , float and string
	 */
	public  <T extends Comparable<T>> T maxOfAnything(T x ,T y , T z) {
		T max=x;
		if(y.compareTo(max)>0)
			max=y;
		if(z.compareTo(max)>0)
			max=z;
		return max;	
	}


	public static void main(String[] args) {
		MaximumCheck m = new MaximumCheck();
		System.out.println(m.maxOfAnything(10,23,15));
		System.out.println(m.maxOfAnything(12.5, 13.4, 22.0));
		System.out.println(m.maxOfAnything("Apple", "Peach", "Banana"));
	}

}