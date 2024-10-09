package lab6;
/**
 * Klass som agerar en bil med egenskaper som t.ex bränslenivå och förbrukning.
 * 
 * @author Edi Buhic
 * @version 2024-09-25
 */

public class CarWithEx {

	// Klassattribut som lagrar bilens maxolym i bränsletanken, nuvarande bränslenivå samt förbrukningen
	private static final double FUEL_TANK_VOLUME = 55.0;
	private double fuelLevel = 0.0;
	private double fuelPer10Km = 0.0;


	public CarWithEx() {
		this.fuelPer10Km = 0.5;
	}


	// Klassens konstruktor som efterfrågar bilens förbrukning
	public CarWithEx(double fuelEfficiency) {
		if (fuelEfficiency > 0) {
			this.fuelPer10Km = fuelEfficiency;
		} else {
			throw new IllegalArgumentException("Fuel Efficiency cant be negative!");
		}
	}

	// Metod som returnerar nuvarande bränslenivå
	public double getFuelLevel() {
		return fuelLevel;
	}

	// Metod som adderar bränsle i bilen beroende på om det finns utrymme
	public void addFuel(double fuel) {
		if (fuelLevel > FUEL_TANK_VOLUME) {
			this.fuelLevel = 55.0;
			throw new IllegalArgumentException("Fuel exceeds tank volume!");
		} else if (fuelLevel < 0){
			throw new IllegalArgumentException("Cannot add negative liters fuel!");
		} else {	
			this.fuelLevel += fuel;
		}
	}

	// Metod för att köra bilen som baseras på distans samt hur mycket bränsle som finns
	public void drive(double distance) {
		if (distance < 0) {
			distance = Math.abs(distance);
		}

		if ((fuelLevel/fuelPer10Km) >= distance) {
			this.fuelLevel = fuelLevel - (fuelPer10Km * distance);
		} else {
			this.fuelLevel = 0.0;
			throw new IllegalArgumentException("Fuel level too low!"); 
		}
	}
}