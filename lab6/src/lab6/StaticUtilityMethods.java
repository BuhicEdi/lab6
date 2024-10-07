package lab6;

public class StaticUtilityMethods {

	private StaticUtilityMethods() {
		
	}
	
	public int calculateSum(int a, int b) {
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
}
