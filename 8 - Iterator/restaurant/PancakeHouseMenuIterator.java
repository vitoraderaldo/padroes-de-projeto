package restaurant;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{

	private int position = 0;
	private ArrayList menuItems;
		
	public PancakeHouseMenuIterator(ArrayList menuItems) {
		this.menuItems = menuItems;
	}
	
	public boolean hasNext() {		
		return position < this.menuItems.size();
	}

	
	public Object next() {		
		MenuItem item = (MenuItem) this.menuItems.get(this.position);
		this.position++;
		return item;
	}

}
