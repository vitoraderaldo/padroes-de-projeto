package restaurant;

public class MenuItem {
	
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;
	
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;		
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public boolean isVegetarian() {
		return this.vegetarian;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void show() {		
		System.out.println("Name: " + this.name);
		System.out.println("Description: " + this.description);
		System.out.println("Vegeratian: " + this.vegetarian);
		System.out.println("Price: " + this.price);
		System.out.println("----------------------------");				
	}

}
