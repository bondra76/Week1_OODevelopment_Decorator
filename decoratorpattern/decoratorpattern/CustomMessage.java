package decoratorpattern;

public class CustomMessage extends BakedgoodDecorator {
	Bakedgood bakedgood;
	
	public CustomMessage(Bakedgood bakedgood) {
		this.bakedgood = bakedgood;
	}
	public String getDescription() {
		return bakedgood.getDescription() + ", Custom Message";
	}
	public double cost() {
		return 4.99 + bakedgood.cost();
	}
}
