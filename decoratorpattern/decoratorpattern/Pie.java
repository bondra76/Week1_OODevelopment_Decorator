package decoratorpattern;

public class Pie extends Bakedgood {
	public Pie() {
		description = "Pie";
	}
	public double cost() {
		return 9.99;
	}
}
