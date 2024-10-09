package lab6;

import java.util.Random;
/**
 * Klass som agerar 6-sidig tärning.
 * 
 * @author Edi Buhic
 * @version 2024-09-25
 */

public class Dice2 {

	// Klassattribut som lagrar senaste slaget
	private int value;
	Random randGenerator = new Random();
	private int nbrOfSides = 1;

	// Klassens konstruktor som generar samt slår tärningen
	public Dice2() {
		new Dice2(6);
	}

	public Dice2(int sides) {

			if (sides == 4 || sides == 6 || sides == 8 || sides == 10 || sides == 12 || sides == 20) {
				this.nbrOfSides = sides;
			} else {
				throw new IllegalArgumentException("Invalid amount of sides!");
			}
		}

	// Metod som slår tärningen
	public void roll() {
		this.value = randGenerator.nextInt(1, nbrOfSides);
	}

	// Metod som returnerar senaste slagets
	public int getValue() {
		return value;
	}

	// Metod som returnerar senaste slaget som en sträng
	public String toString() {
		return String.valueOf(value);
	}
}