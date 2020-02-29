package restaurant;

import java.util.ArrayList;

public class SemIterator{
	public static void main(String args[]) {
		
		PancakeHouseMenu phm = new PancakeHouseMenu();
		ArrayList items = phm.getMenuItems();
		
		DinnerMenu dm = new DinnerMenu();
		MenuItem[] itemsDinner = dm.getMenuItems();
		
		for(int i = 0; i < items.size(); i++) {
			MenuItem item = (MenuItem) items.get(i);
			item.show();
		}
		
		for(int i = 0; i < dm.getNumberOfItems() ; i++) {
			MenuItem item = itemsDinner[i];
			item.show();
		}
	
	}
}