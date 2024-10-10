package lab6;

import java.util.Random;

public class Yatzy2 {
	private Dice2[] dice;

	public Yatzy2(int... dices) {
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

	public void roll() {
		for(int i = 0; i < dice.length; i++) {
			this.dice[i].roll();
		}
	}

	public int getTotalValue() {
		int diceSum = 0;

		for (int i = 0; i < dice.length; i++) {
			diceSum += dice[i].getValue();
		}

		return diceSum;
	}

	public String toString() {
		String diceString = "";

		for (int i = 0; i < dice.length; i++) {
			diceString = dice[i].toString() + " ";
		}

		return diceString.trim();
	}
	
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
