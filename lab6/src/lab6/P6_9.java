package lab6;

public class P6_9 {

	public static void main(String[] args) {
		try {
			Dice2 d = new Dice2(15);
			d.roll();
			System.out.println(d.getValue());
			System.out.println(d.toString());
		} catch (IllegalArgumentException err) {
			System.out.println("Error generating a dice: " + err.getLocalizedMessage());
		}
	}
}
