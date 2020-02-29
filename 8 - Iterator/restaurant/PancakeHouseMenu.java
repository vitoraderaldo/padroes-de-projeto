package restaurant;

import java.util.ArrayList;

public class PancakeHouseMenu {
	
	private ArrayList menuItems;
	
	public PancakeHouseMenu() {
		this.menuItems = new ArrayList();		
		addItem("Pancake 1","Awesome Pancake 1",false,3.4);
		addItem("Pancake 2","Awesome Pancake 2",true,4.2);
		addItem("Pancake 3","Awesome Pancake 3",false,3);
		addItem("Pancake 4","Awesome Pancake 4",false,5.2);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		this.menuItems.add(menuItem);
	}
	
	/* Com o iterator essa funcao pode ser removida */
	public ArrayList getMenuItems() {
		return this.menuItems;
	}
	
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(this.menuItems);
	}

}
