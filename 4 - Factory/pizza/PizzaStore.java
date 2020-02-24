package pizza;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		if(pizza instanceof Pizza) {			
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}
		return null;		
	}		
	protected abstract Pizza createPizza(String type);
}
