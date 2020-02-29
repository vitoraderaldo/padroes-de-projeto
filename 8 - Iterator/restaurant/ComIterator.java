package restaurant;

public class ComIterator {

	public static void main(String[] args) {
		
		DinnerMenu dm = new DinnerMenu();		
		PancakeHouseMenu phm = new PancakeHouseMenu();
		
		Waitress waitress = new Waitress(dm, phm);
		waitress.printMenu();

	}

}
