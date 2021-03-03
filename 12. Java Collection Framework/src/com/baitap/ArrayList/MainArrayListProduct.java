package com.baitap.ArrayList;

import java.util.List;

public class MainArrayListProduct {
    public static void main(String[] args) {
        ProductManager prm =  new ProductManager();
        prm.add();
        prm.add();
        prm.add();
        prm.display();

        prm.edit();
        prm.display();

        prm.delete();
        prm.display();

        prm.sort();
        prm.display();

        prm.searchByName();
    }
}
