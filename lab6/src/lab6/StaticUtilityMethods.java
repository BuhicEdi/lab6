package lab6;

public class StaticUtilityMethods {

	private StaticUtilityMethods() {

	}

	public static int calculateSum(int a, int b) {
		return a + b;
	}

	public static double calculateSum(double a, double b) {
		return a + b;
	}

	public static int calculateSum(int a, int b, int c) {
		return a + b + c;
	}

	public static double calculateSum(double a, double b, double c) {
		return a + b + c;
	}

	public static int calculateSum(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static double calculateSum(double[] arr) {
		double sum = 0.0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static int calculateSum(int[] arrA, int[] arrB) {
		int sum = 0;

		for (int i = 0; i < arrA.length; i++) {
			sum += arrA[i];
		}

		for (int i = 0; i < arrB.length; i++) {
			sum += arrB[i];
		}
		return sum;
	}
}
