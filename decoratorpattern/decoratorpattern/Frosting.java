package decoratorpattern;

public class Frosting extends BakedgoodDecorator {
	Bakedgood bakedgood;
	
	public Frosting(Bakedgood bakedgood) {
		this.bakedgood = bakedgood;
	}
	public String getDescription() {
		return bakedgood.getDescription() + ", Frosting";
	}
	public double cost() {
		return 2.99 + bakedgood.cost();
	}
}
