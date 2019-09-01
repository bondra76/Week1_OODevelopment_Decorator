package decoratorpattern;

//Main Class to enter Pastry orders
public class PastryShop {

	public static void main(String[] args) {
		// Customer first Order = 1 Cake (19.99)
		Bakedgood bakedgood = new Cake();
		System.out.println(bakedgood.getDescription() + " $" + bakedgood.cost());
		
		// Customer second order = 1 pie with candles ($10.98)
		Bakedgood bakedgood2 = new Pie();
		bakedgood2 = new Candles(bakedgood2);
		System.out.println(bakedgood2.getDescription() + " $" + bakedgood2.cost());
		
		// Customer third order = 1 pie with candles, frosting, and a custom msg ($18.96)
		Bakedgood bakedgood3 = new Pie();
		bakedgood3 = new Candles(bakedgood3);
		bakedgood3 = new Frosting(bakedgood3);
		bakedgood3 = new CustomMessage(bakedgood3);
		System.out.println(bakedgood3.getDescription() + " $" + bakedgood3.cost());
		
	}

}
