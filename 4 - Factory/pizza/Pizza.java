package pizza;

import java.util.ArrayList;

public abstract class Pizza {	
	
	String name;
	String dough;
	String sauce;
	ArrayList toppings;
	
	public Pizza(){
		toppings = new ArrayList();
	}
	
	public void prepare() {
		System.out.println("Peparando " + name);
		System.out.println("Colocando a massa...");
		System.out.println("Adicionando molho...");
		System.out.println("Colocando recheio...");
		for(int i = 0; i < toppings.size(); i++) {
			System.out.println("	" + toppings.get(i));
		}
	}
	
	public void bake() {
		System.out.println("Assando...");
	}
	
	public void cut() {
		System.out.println("Cortando..");
	}
	
	public void box() {
		System.out.println("Colocando na caixa...");
	}	
	
	public String getName() {
		return name;
	}

}
