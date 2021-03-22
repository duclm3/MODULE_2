package com.Interface;

public interface IManagerProduct<E> {
    int searchById (String id);

    void add ();

    void edit ();

    void delete ();

    void displayProduct();

    void displayImportDate();

    void sortByPrice();

    void findProductMaxPrice();

    void readFile();

    void writeFile();


}
