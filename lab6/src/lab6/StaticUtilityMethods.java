package lab6;

import java.util.Arrays;

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
		int index = 0;

		if (a.length > b.length) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}

		for (int i = 0; i < min.length; i++) {
			mergedArr[index] = a[i];
			mergedArr[index + 1] = b[i];
			index = index + 2;
		}

		for (int i = index / 2; i < max.length; i++) {
			mergedArr[index] = max[i];
			index++;
		}

		return mergedArr;
	}

	public static String merge(String a, String b) {
		a = a.trim();
		b = b.trim();
		String[] aSplit = a.split("\\s+");
		String[] bSplit = b.split("\\s+");
		String[] max;
		String[] min;
		String mergedStr = "";

		System.out.println(b);
		System.out.println(Arrays.toString(aSplit));
		System.out.println(Arrays.toString(bSplit));

		if (a.length() > b.length()) {
			max = aSplit;
			min = bSplit;
		} else {
			max = bSplit;
			min = aSplit;
		}

		for (int i = 0; i < min.length; i++) {
			mergedStr += aSplit[i] + " ";
			mergedStr += bSplit[i] + " ";
		}

		for (int i = min.length; i < max.length; i++) {
			mergedStr += max[i] + " ";
		}
		return mergedStr.trim();		
	}

	public static int[] integerFactorization(int a) {
		int index = 0;
		int[] intFactors = new int[a / 2];

		if (a % 2 == 0) {
			intFactors[index] = 2;
			index++;
		}

		for (int i = 3; i <= 11; i += 2) {

			if (i == 7) {
				i = 11;
			}

			if (a % i == 0) {
				intFactors[index] = i;
				index++;
			}
		}

		return intFactors;
	}
}


