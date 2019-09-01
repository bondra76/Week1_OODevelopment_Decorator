package decoratorpattern;

public class Cake extends Bakedgood {
	public Cake() {
		description = "Cake";
	}
	public double cost() {
		return 19.99;
	}
}
