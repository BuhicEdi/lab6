package lab6;
/**
 * Detta program testar att generera ett felmeddelande från klassen SodaCanWithEx.
 * 
 * @author Edi Buhic
 * @version 2024-10-10
 */

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
