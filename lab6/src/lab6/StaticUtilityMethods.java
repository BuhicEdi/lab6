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

	public static int calculateSum(int[][] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}

	public static boolean checkSweEmailAddress(String email) {
		if (email.contains(".se") == false || email.contains("@") == false) {
			return false;
		} else if (email.indexOf('@') == 0 || email.indexOf(".se") != (email.length() - 3)) {
			return false;
		}
		return true;
	}


	public static String convertToCamelCase(String str) {
		str = str.trim();
		String[] strSplit = str.split("|");
		String newStr = strSplit[0].toUpperCase();

		for (int i = 1; i < strSplit.length; i++) {
			if (strSplit[i - 1].isBlank() && strSplit[i].isBlank() == false) {
				newStr += strSplit[i].toUpperCase();
			} else if (strSplit[i].isBlank() == false){
				newStr += strSplit[i];
			}
		}

		return newStr;
	}

	public static int[] merge(int[] a, int[] b) {
		int len = Math.max(a.length, b.length);
		int[] mergedArr = new int[len];

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - 1; j = j + 2) {
				mergedArr[j] = Math.max(a[i], b[i]);
				mergedArr[j + 1] = Math.min(a[i], b[i]);
			}
		}
		return mergedArr;
	}

	public static String merge(String a, String b) {
		return null;
	}

}


