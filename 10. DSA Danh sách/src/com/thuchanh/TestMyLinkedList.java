package com.thuchanh;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst("Long");
        ll.add(4,9);
        ll.add(4,9);
        ll.printList();
        MyLinkedList ll1 = new MyLinkedList();
        ll1.addFirst("abc");
        ll1.printList();

    }
}
