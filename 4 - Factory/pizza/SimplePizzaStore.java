package pizza;

public class SimplePizzaStore extends PizzaStore{
	public Pizza createPizza(String type) {		
		if(type == "greek") return new GreekPizza();
		if(type == "pepperoni") return new PepperoniPizza();		
		return null;
	}	
}
