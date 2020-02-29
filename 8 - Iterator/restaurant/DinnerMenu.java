package restaurant;

public class DinnerMenu {
	
	static final int MAX_ITEMS = 6;
	private int numberOfItems = 0;
	private MenuItem[] menuItems;
	
	public DinnerMenu() {
		this.menuItems = new MenuItem[MAX_ITEMS];
		addItem("Dinner 1","Awesome Dinner 1",false,13.6);
		addItem("Dinner 2","Awesome Dinner 2",false,14.2);
		addItem("Dinner 3","Awesome Dinner 3",true,15.3);
		addItem("Dinner 4","Awesome Dinner 4",false,10.1);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(this.numberOfItems >= MAX_ITEMS) {
			System.out.println("Sorry, menu is full !");
		}else {
			this.menuItems[this.numberOfItems] = menuItem;
			this.numberOfItems++;
		}
	}	
	
	/* Obs: Com o iterator essa funcao pode ser apagada */
	public MenuItem[] getMenuItems() {
		return this.menuItems;
	}
	
	public Iterator createIterator() {
		return new DinnerMenuIterator(this.menuItems);
	}
	
	public int getNumberOfItems() {
		return this.numberOfItems;
	}
	

}
