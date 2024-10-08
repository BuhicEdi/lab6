package lab6;

import java.util.Arrays;

public class P6_4 {

	public static void main(String[] args) {
		
		int[] a = {1, 3, 5};
		int[] b = {2, 4, 6, 7, 8};
		
		
		System.out.println(Arrays.toString(StaticUtilityMethods.merge(a, b)));
		System.out.println(StaticUtilityMethods.merge("123  4   56789 ", "   98   654 2    42 4711"));

	}

}