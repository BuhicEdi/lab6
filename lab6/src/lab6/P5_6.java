package lab6;

public class P5_6 {

	public static void main(String[] args) {
		try {
			SodaCanWithEx can = new SodaCanWithEx(-5, -3);	
		} catch(IllegalArgumentException err) {
			System.out.println("Error generating can: " + err.getLocalizedMessage());
		}
	}

}
