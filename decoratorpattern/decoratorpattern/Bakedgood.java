package decoratorpattern;


//Abstract class
public abstract class Bakedgood {
	String description = "Unknown Baked Good";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();	
}




