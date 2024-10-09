package lab6;

public class P6_10 {

	public static void main(String[] args) {
		try {
			Yatzy2 y = new Yatzy2(4, 6, 8, 10);
			y.roll();
		} catch (IllegalArgumentException err) {
			
		}

	}

}
