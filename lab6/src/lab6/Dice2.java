package lab6;

import java.util.Random;
/**
 * Klass som genererar en tärning beroende på antal sidor samt med felhantering
 * 
 * @author Edi Buhic
 * @version 2024-10-11
 */

public class Dice2 {

	// Klassattribut som lagrar senaste slaget
	private int value;
	Random randGenerator = new Random();
	private int nbrOfSides;

	// Klassens konstruktor som generar samt slår tärningen
	public Dice2() {
		this(6);
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
		String diceString = "[" + value + "]";
		return diceString;
	}
}