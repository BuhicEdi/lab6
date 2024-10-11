package lab6;
/**
 * Detta program testar metoderna convertToCamelCase samt checkSweEmailAddress ur klassen StaticUtilityMethods.
 * 
 * @author Edi Buhic
 * @version 2024-10-11
 */

public class P6_3 {

	public static void main(String[] args) {
		System.out.println(StaticUtilityMethods.convertToCamelCase("  Kaka    baka "));
		System.out.println(StaticUtilityMethods.checkSweEmailAddress("a1@b.se"));
	}
}
