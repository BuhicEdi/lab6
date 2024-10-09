package lab6;

public class P6_6 {

	public static void main(String[] args) {
		try {
			SodaCanWithEx can = new SodaCanWithEx(-5, -3);
			can.getBottomArea();
		} catch(IllegalArgumentException err) {
			System.out.println("Error generating can: " + err.getLocalizedMessage());
		}
	}
}
