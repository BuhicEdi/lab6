package lab6;

public class P6_7 {

	public static void main(String[] args) {
		try {
			CarWithEx lambo = new CarWithEx(-54);
		} catch (IllegalArgumentException err) {
			System.out.println("Error while Generating car: " + err.getLocalizedMessage());
		}
	}

}
