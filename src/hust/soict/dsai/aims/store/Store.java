package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    public static final int MAX_ITEMS = 100; 
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_ITEMS];
    private int numItems = 0;

    public void addDVD(DigitalVideoDisc dvd) {
        if (numItems < MAX_ITEMS) {
            itemsInStore[numItems] = dvd;
            numItems++;
            System.out.println("DVD was added to the store: " + dvd.getTitle());
        } else {
            System.out.println("The store is full. Can't add more DVDs.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < numItems; i++) {
            if (itemsInStore[i] == dvd) {
                for (int j = i; j < numItems - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[numItems - 1] = null; // Clear the last slot
                numItems--;
                System.out.println("DVD was removed from the store: " + dvd.getTitle());
                return;
            }
        }
        System.out.println("DVD not found in the store.");
    }

    public void printStore() {
        System.out.println("*************** STORE ***************");
        for (int i = 0; i < numItems; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i].toString());
        }
        System.out.println("**************************************");
    }
}
