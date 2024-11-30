package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED =20;
	private DigitalVideoDisc itemsOrdered[]= new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("DVD was added to cart.");
        } else {
            System.out.println("Cart is full.");
        }
    }
	 public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		 for(DigitalVideoDisc dvd : dvdList) {
			 this.addDigitalVideoDisc(dvd);
		 }
	}
	 public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		 this.addDigitalVideoDisc(dvd1);
		 this.addDigitalVideoDisc(dvd2);
	 }
	 public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	        for (int i = 0; i < qtyOrdered; i++) {
	            if (itemsOrdered[i] == disc) {
	                
	                for (int j = i; j < qtyOrdered - 1; j++) {
	                    itemsOrdered[j] = itemsOrdered[j + 1];
	                }
	                itemsOrdered[qtyOrdered - 1] = null;  
	                qtyOrdered--;
	                System.out.println("DVD was removed from cart.");
	                return;
	            }
	        }
	        System.out.println("DVD is not found in cart.");
	    }

	  public float totalCost() {
	        float total = 0;
	        for (int i = 0; i < qtyOrdered; i++) {
	            total += (itemsOrdered[i]).getCost();  
	        }
	        return total;
	    }
	 
	  public void printCart() {
	        System.out.println("***********************CART***********************");
	        System.out.println("Ordered Items:");
	        for (int i = 0; i < qtyOrdered; i++) {
	            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
	        }
	        System.out.println("Total cost: " + totalCost() + " $");
	        System.out.println("***************************************************");
	    }

	    
	   public void searchById(int id) {
	        for (int i = 0; i < qtyOrdered; i++) {
	            if (itemsOrdered[i].getId() == id) {
	                System.out.println("DVD found: " + itemsOrdered[i].toString());
	                return;
	            }
	        }
	        System.out.println("No match found for ID: " + id);
	    }

	   
	   public void searchByTitle(String title) {
	        boolean found = false;
	        for (int i = 0; i < qtyOrdered; i++) {
	            if (itemsOrdered[i].isMatch(title)) {
	                System.out.println("DVD found: " + itemsOrdered[i].toString());
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("No match found for title: " + title);
	        }
	    }
}

