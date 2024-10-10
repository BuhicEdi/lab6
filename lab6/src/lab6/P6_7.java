package lab6;
/**
 * Detta program testar att generera ett felmeddelande från klassen CarWithEx.
 * 
 * @author Edi Buhic
 * @version 2024-10-10
 */

public class P6_7 {

	public static void main(String[] args) {
		try {
			CarWithEx lambo = new CarWithEx(-54);
			
			lambo.addFuel(-69);
			lambo.drive(-13);
		} catch (IllegalArgumentException err) {
			System.out.println("Error while Generating car: " + err.getLocalizedMessage());
		}
	}
}
