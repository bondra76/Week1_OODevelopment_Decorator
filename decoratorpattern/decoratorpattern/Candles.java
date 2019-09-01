package decoratorpattern;

public class Candles extends BakedgoodDecorator {
	Bakedgood bakedgood;
	
	public Candles(Bakedgood bakedgood) {
		this.bakedgood = bakedgood;
	}
	public String getDescription() {
		return bakedgood.getDescription() + ", Candles";
	}
	public double cost() {
		return .99 + bakedgood.cost();
	}
}
