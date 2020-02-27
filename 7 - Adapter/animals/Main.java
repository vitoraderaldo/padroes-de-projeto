package animals;

public class Main{
	public static void main(String args[]) {		
				
		Tigger siberianTiger = new SiberianTiger();
		siberianTiger.roar();
		siberianTiger.walk();
		
		Tigger catAsTigger = new CatAdapter(new PersianCat());
		catAsTigger.roar();
		catAsTigger.walk();
		
	}
}