package com.baitap.ArrayList;

import java.util.List;

public class MainArrayListProduct {
    public static void main(String[] args) {
        ProductManager prm =  new ProductManager();
        System.out.println("Add:");
        prm.add();
        prm.add();
        prm.add();
        prm.display();

        System.out.println("Edit:");
        prm.edit();
        prm.display();

        System.out.println("Delete:");
        prm.delete();
        prm.display();

        System.out.println("Sort:");
        prm.sort();
        prm.display();

        prm.searchByName();
    }
}
