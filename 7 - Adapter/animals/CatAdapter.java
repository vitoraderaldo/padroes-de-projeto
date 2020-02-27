package animals;

public class CatAdapter implements Tigger{
	
	private Cat cat;
	
	public CatAdapter(Cat cat) {
		this.cat =  cat;
	}

	public void roar() {		
		this.cat.meow();
	}

	
	public void walk() {		
		this.cat.walk();
		this.cat.walk();
	}

	

	

	

}
