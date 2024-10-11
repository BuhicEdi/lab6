package lab6;

import java.util.Random;
/**
 * Denna klass genererar ett yatzybord med x antal tärningar och lagrar sedan samtliga i en array, med funktioner som att kasta tärningarna, hämta totala värden och mata ut varje tärnings separata värde.
 * 
 * @author Edi Buhic
 * @version 2024-10-11
 */

public class Yatzy2 {
	
	// Klassattribut
	private Dice2[] dice;

	// Konstruktor som tar emot antalet tärningar samt deras sidor.
	public Yatzy2(int... dices) {
		
		// Ifall inget värde inmatas så ska 5 st 6-sidiga tärningar genereras
		if (dices.length == 0) {
			this.dice = new Dice2[5];
			
			for (int i = 0; i < 5; i++) {
				this.dice[i] = new Dice2();
			}	
		} else {
			this.dice = new Dice2[dices.length];
			
			for (int i = 0; i < dices.length; i++) {
				try {
					this.dice[i] = new Dice2(dices[i]);
				} catch (IllegalArgumentException err) {
					throw new IllegalArgumentException(err.getLocalizedMessage());
				}
			}	
		}
	}

	// Kastar alla tärningar
	public void roll() {
		for(int i = 0; i < dice.length; i++) {
			this.dice[i].roll();
		}
	}

	// Returnerar summan av alla tärningars värden som en int
	public int getTotalValue() {
		int diceSum = 0;

		for (int i = 0; i < dice.length; i++) {
			diceSum += dice[i].getValue();
		}
		return diceSum;
	}

	// Returnerar alla tärningar samt deras värde i en sträng
	public String toString() {
		String diceString = "";

		for (int i = 0; i < dice.length; i++) {
			diceString += dice[i].toString() + " ";
		}
		return diceString.trim();
	}

	// Intern klass som genererar en ny tärning
	private class Dice2 {

		// Klassattribut som lagrar senaste slaget
		private int value = 0;
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
}
