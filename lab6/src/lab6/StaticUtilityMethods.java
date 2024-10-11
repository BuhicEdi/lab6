package lab6;
/**
 * Denna klass innehåller en massa olika metoder där man t.ex kan addera tal, sammanfläta arrayer/strängar, beräkna kumulativa summor med mera.
 * 
 * @author Edi Buhic
 * @version 2024-10-11
 */



public class StaticUtilityMethods {

	// Privat konstruktor
	private StaticUtilityMethods() {
	}

	// Adderar och returnerar summan av 2 heltal (P6_1)
	public static int calculateSum(int a, int b) {
		return a + b;
	}

	// Adderar och returnerar summan av 2 fyttal (P6_1)
	public static double calculateSum(double a, double b) {
		return a + b;
	}

	// Adderar och returnerar summan av 3 heltal (P6_1)
	public static int calculateSum(int a, int b, int c) {
		return a + b + c;
	}

	// Adderar och returnerar summan av 3 flyttal (P6_1)
	public static double calculateSum(double a, double b, double c) {
		return a + b + c;
	}

	// Adderar och returnerar summan av en hel array med heltal (P6_2)
	public static int calculateSum(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// Adderar och returnerar summan av en hel array med flyttal (P6_2)
	public static double calculateSum(double[] arr) {
		double sum = 0.0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// Adderar och returnerar summan av en hel matris med heltal (P6_2)
	public static int calculateSum(int[][] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}

	// Tar emot en e-postadress och kontrollerar ifall den följer standarden för en svensk e-postadress (P6_3)
	public static boolean checkSweEmailAddress(String email) {
		if (email.contains(".se") == false || email.contains("@") == false) {
			System.out.println("1");
			return false;
		} else if (email.indexOf('@') == 0 || email.indexOf(".se") != (email.length() - 3)) {
			System.out.println("2");
			return false;
		} 

		boolean containsAt = false;

		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@' && containsAt == false) {
				containsAt = true;
			} else if (email.charAt(i) == '@' && containsAt == true) {
				System.out.println("3");
				return false;
			}

			if (email.charAt(i) == '@' && Character.isLetter(email.charAt(i-1)) == false || Character.isDigit(email.charAt(i-1))) {
				System.out.println("4");
				return false;
			}
		}	
		return true;
	}

	// Tar emot en sträng och konverterar den till "camelcase"-format samt returnerar (P6_3)
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

	// Tar emot 2 arrayer av heltal och returnerar en sammanflätad version (P6_4)
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

	// Tar emot två strängar och returnerar en sammanflätad version (P6_4)
	public static String merge(String a, String b) {
		a = a.trim();
		b = b.trim();
		
		String[] aSplit = a.split("\\s+");
		String[] bSplit = b.split("\\s+");
		
		String[] max;
		String[] min;
		String mergedStr = "";

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

	// Tar emot ett heltal och returnerar en array med talets primtalfaktorer (P6_5)
	public static int[] integerFactorization(int a) {
		int index = 0;
		int[] intFactTemp = new int[a / 2];

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				intFactTemp[index] = i;
				index++;
			}
		}

		int[] intFactors = new int[index];

		for (int i = 0; i < index; i++) {
			intFactors[i] = intFactTemp[i];
		}
		return intFactors;
	}

	// Tar emot ett heltal och returnerar den kumulativa summan av talet med hjälp av en rekursiv funktion (P6_8)
	public static int recursiveCumulativeSum(int a) {
		int valSum = a;

		if (valSum < 0) {
			throw new IllegalArgumentException("Value can't be negative!");
		} else if ((a / 10) > 0) {
			valSum = (a % 10) + recursiveCumulativeSum(a / 10);
		}
		return valSum;
	}
} 
