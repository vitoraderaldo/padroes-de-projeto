package chocolate;

public class Main{
	public static void main(String args[]) {		 
		ChocolateBoiler cb = ChocolateBoiler.getInstance();
		ChocolateBoiler cb2 = ChocolateBoiler.getInstance();
		cb.fill();	
		cb.boil();
		cb.fill();	
		cb2.fill();	
		cb.drain();
	}
}