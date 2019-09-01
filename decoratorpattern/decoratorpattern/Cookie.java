package decoratorpattern;

public class Cookie extends Bakedgood {
	public Cookie() {
		description = "Cooking";
	}
	public double cost() {
		return .99;
	}
}
