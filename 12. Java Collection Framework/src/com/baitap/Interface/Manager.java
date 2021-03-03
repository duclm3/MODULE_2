package com.baitap.Interface;

import java.util.List;

public interface Manager<E> {
    boolean add();
    boolean edit();
    boolean delete();
    int searchById(int id);
    void sort();
    void searchByName();
    void display();
    E getById(int id);
}
