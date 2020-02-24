package coffee;

public class Mocha extends CondimentDecorator {
	
	private String description;
	private double cost;
	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.description = "Mocha";
		this.cost = 1.32;
		this.beverage = beverage;
	}
	
	public String getDescription() {		
		return this.beverage.getDescription() + " with " + this.description;
	}
	
	public double cost() {		
		return this.cost + this.beverage.cost(); 
	}
}
