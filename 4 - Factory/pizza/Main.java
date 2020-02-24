package pizza;

public class Main{
	public static void main(String args[]) {		 
		PizzaStore pz = new SimplePizzaStore();
		pz.orderPizza("greek");
		pz.orderPizza("pepperoni");
		
		PizzaStore ps = new LondrinaPizzaStore();		
		ps.orderPizza("pepperoni");
		
		
		
	
	}
}