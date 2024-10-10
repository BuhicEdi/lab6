package lab6;
/**
 * Detta program testar att generera ett yatsyspel med hjälp utav klassen Yatzy2.
 * 
 * @author Edi Buhic
 * @version 2024-10-10
 */

public class P6_10 {

	public static void main(String[] args) {
		try {
			Yatzy2 y = new Yatzy2(4, 6, 8, 10);
			y.roll();
			
			System.out.println(y.getTotalValue());
			System.out.println(y.toString());
		} catch (IllegalArgumentException err) {
			System.out.println("Error generating Yatzy-table: " + err.getLocalizedMessage());
		}
	}
}
