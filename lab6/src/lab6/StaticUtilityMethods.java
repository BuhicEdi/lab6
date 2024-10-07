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
		if (email.contains(".se") && email.contains("@") && email.indexOf("@") != 0) {
			if (email.substring((email.indexOf("@") - 1), email.indexOf("@")).isEmpty() == false) {
				return false;
			}
		}
		return true;
	}

	public static String convertToCamelCase(String str) {
		String[] strSplit = str.split("|");
		String newStr = "";

		System.out.println(strSplit.length);

		for (int i = 0; i < strSplit.length; i++) {

			if (strSplit[i].isBlank()) {
				newStr += strSplit[i + 1].toUpperCase();
				i++;
			} else {
				newStr += strSplit[i];
			}
		}

		return newStr;
	}
}


