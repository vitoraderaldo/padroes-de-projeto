package restaurant;

public class DinnerMenuIterator implements Iterator {
	
	MenuItem[] items;
	int position = 0;
	
	public DinnerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	public boolean hasNext() {		
		return this.items[this.position] != null;		
	}

	public Object next() {
		MenuItem item = this.items[this.position];
		this.position++;
		return item;
	}	

}
