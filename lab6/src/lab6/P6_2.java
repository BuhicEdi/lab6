package lab6;


public class P6_2 {

	public static void main(String[] args) {
		
		
		int[][] arr = {{1, 2, 3}, {3, 2, 1}, {2, 1, 3}};
		

		System.out.println(StaticUtilityMethods.calculateSum(arr));
		
		String test = "edi@buhic.se";
		
		System.out.println(test.indexOf(".se"));
		System.out.println(test.length());
		
		if (test.indexOf(".se") == (test.length()-3)) {
			System.out.println("a");
		}

	}

}
