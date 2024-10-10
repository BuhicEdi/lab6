package lab6;
/**
 * Detta program testar metoden calculateSum ur klassen StaticUtilityMethods.
 * 
 * @author Edi Buhic
 * @version 2024-10-10
 */

public class P6_2 {

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {3, 2, 1}, {2, 1, 3}};

		System.out.println(StaticUtilityMethods.calculateSum(arr));
	}
}
