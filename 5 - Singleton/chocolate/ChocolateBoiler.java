package chocolate;

public class ChocolateBoiler{

	private boolean empty;
	private boolean boiled;

	private static ChocolateBoiler uniqueInstance;

	private ChocolateBoiler(){
		this.empty = true;
		this.boiled = false;
	}

	public static ChocolateBoiler getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new ChocolateBoiler();
		}
		return uniqueInstance;
	}

	public void fill(){
		if(isEmpty()){
			System.out.println("Preenchendo");
			this.empty = false;
			this.boiled = false;
		}
	}

	public void drain(){		
		if(!isEmpty() && isBoiled()){
			System.out.println("Retirando");
			this.empty = true;
		}
	}

	public void boil(){
		if(!isEmpty() && !isBoiled()){
			System.out.println("Fervendo");
			this.boiled = true;
		}
	}

	public boolean isEmpty(){
		return this.empty;
	}

	public boolean isBoiled(){
		return this.boiled;
	}

}