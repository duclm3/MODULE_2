package com.baitap;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;//Độ dài mặc định khi khởi tạo list
    private Object elements[];
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        if(capacity > 0){
            elements = new Object[capacity];
        }
    }
//    @Override
//    public Object clone()
//    {
//        try {
//            MyList<E> v = (MyList<E>) super.clone();
//            v.elements = Arrays.copyOf(elements, size);
////            v.modCount = 0;
//            return v;
//        } catch (CloneNotSupportedException e) {
//            throw new InternalError(e);
//        }
//    }
    public E clone(){
        Object[] newElements = Arrays.copyOf(elements,size);
        return (E) Arrays.toString(newElements);
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(int index,E element){
        if (index>= size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        elements[size++] = element;
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    public static void main(String[] args) {
        MyList<Integer> a = new MyList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(3);
        a.add(4);
        Integer[] x = a.clone();
        System.out.println(a.clone());
    }
}
