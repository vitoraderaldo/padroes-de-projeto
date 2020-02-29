package restaurant;

public class Waitress {
	
	private DinnerMenu dinnerMenu;
	private PancakeHouseMenu pancakeHouseMenu;
	
	public Waitress(DinnerMenu dinnerMenu, PancakeHouseMenu pancakeHouseMenu) {
		this.dinnerMenu = dinnerMenu;
		this.pancakeHouseMenu = pancakeHouseMenu;
	}
	
	public void printMenu() {		
		Iterator dmi = this.dinnerMenu.createIterator();
		Iterator phmi = this.pancakeHouseMenu.createIterator();		
		print(dmi);
		print(phmi);		
	}
	
	private void print(Iterator i) {
		while(i.hasNext()){
			MenuItem item = (MenuItem) i.next();
			item.show();
		}
	}

}
