package hust.soict.dsai.aims.Aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {
	public static void main(String[] args) {
	
		Cart anOrder = new Cart();
	
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King","Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars","Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
	
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladin","Animation", null, 0, 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
	
		anOrder.removeDigitalVideoDisc(dvd1);
		
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
	} 
}
