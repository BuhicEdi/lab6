package lab6;
/**
 * Klass som räknar ut diverse volymer på en burk (cylinder) med felhantering
 * 
 * @author Edi Buhic
 * @version 2024-10-11
 */

public class SodaCanWithEx {

	// Klassattribut som lagrar burkens radie samt höjd
	private double height;
	private double radius;

	// Klassens konstruktor som tar emot och lagrar burkens höjd samt radie ifall värdena är korrekta
	public SodaCanWithEx(double height, double radius) {

		if (height > 0) {		
			this.height = height;
		} else {
			throw new IllegalArgumentException("Height cant be negative!");
		}

		if (radius > 0) {
			this.radius = radius;
		} else {
			throw new IllegalArgumentException("Radius cant be negative!");
		}
	}

	// Metod som returnerar burkens höjd
	public double getHeight() {
		return height;
	}

	// Metod som returnerar burkens radie
	public double getRadius() {
		return radius;
	}

	// Metod som räknar ut samt returnerar burkens volym
	public double getVolume() {
		double canVolume;
		canVolume = Math.PI * Math.pow(radius, 2) * height;

		return canVolume;
	}

	// Metod som räknar ut samt returnerar burkens mantelarea
	public double getSurfaceArea() {
		double canSurfArea;
		canSurfArea = (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height);

		return canSurfArea;

	}

	// Metod som räknar ut samt returnerar burkens bottenarea
	public double getBottomArea() {
		double canBaseArea;
		canBaseArea = (Math.PI * Math.pow(radius, 2));

		return canBaseArea;
	}

	// Metod som räknar ut samt returnerar burkens omkrets
	public double getCircumference() {
		double canCircumference;
		canCircumference = 2 * Math.PI * radius;

		return canCircumference;	
	}
}
