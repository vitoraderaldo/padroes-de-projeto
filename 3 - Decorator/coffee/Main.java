package coffee;

public class Main{

	public static void main(String[] args) {
		Beverage beverage = new Expresso();		
		System.out.println(beverage.getDescription() + ": $" +  beverage.cost());
		
		Beverage beverage2 = new HouseBlend();		
		System.out.println(beverage2.getDescription() + ": $" + beverage2.cost());
		
		Beverage beverage3 = new Mocha(beverage2);
		System.out.println(beverage3.getDescription() + ": $" + beverage3.cost());	
		
		Beverage beverage4 = new Mocha(beverage3);
		System.out.println(beverage4.getDescription() + ": $" + beverage4.cost());
	}
}