package com.baitap.LinkedList;

import com.baitap.ArrayList.ProductManager;

public class MainLinkedListProduct {
    public static void main(String[] args) {
        ProductManager prm =  new ProductManager();
        prm.delete();
        prm.display();
        prm.add();
        prm.add();
        prm.add();
        prm.display();

        prm.edit();
        prm.display();



        prm.sort();
        prm.display();

        prm.searchByName();
    }
}
