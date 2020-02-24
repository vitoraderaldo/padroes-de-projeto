package pizza;

public class LondrinaPizzaStore extends PizzaStore {

	public Pizza createPizza(String type) {	
		if(type == "pepperoni") return new PepperoniLondrinaPizza();		
		return null;
	}	
}
