package lab6;
/**
 * Detta program testar att generera ett felmeddelande från klassen Dice2.
 * 
 * @author Edi Buhic
 * @version 2024-10-11
 */

public class P6_9 {

	public static void main(String[] args) {
		try {
			Dice2 d = new Dice2();
			d.roll();
			
			System.out.println(d.getValue());
			System.out.println(d.toString());
		} catch (IllegalArgumentException err) {
			System.out.println("Error generating a dice: " + err.getLocalizedMessage());
		}
	}
}
