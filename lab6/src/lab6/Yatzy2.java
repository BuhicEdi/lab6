package lab6;

public class Yatzy2 {
	private Dice2[] dice;

	public Yatzy2(int ... dices) {
		for (int i: dices) {
			try {
				this.dice[i] = new Dice2(i);
			} catch (IllegalArgumentException err) {
				throw new IllegalArgumentException(err.getLocalizedMessage());
			}
		}	
	}

	public void roll() {
		for(int i = 0; i < dice.length; i++) {
			dice[i].roll();
		}
	}

	public int getValue() {
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



}
