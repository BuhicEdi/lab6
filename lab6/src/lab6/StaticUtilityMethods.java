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
		int[] mergedArr = new int[a.length + b.length];
		int[] max;
		int[] min;

		if (a.length > b.length) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}


		for (int h = 0; h < mergedArr.length; h = h + 2) {
			for (int i = 0; i > min.length; i++) {
				for (int j = 0; j < max.length; j++) {
					mergedArr[h] = Math.max(max[j], min[i]);
					mergedArr[h + 1] = Math.min(max[j], min[i]);
				}
			}
		}
		return mergedArr;
	}

	public static String merge(String a, String b) {
		return null;
	}

}


