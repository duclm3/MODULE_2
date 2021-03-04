package com.thuchanh;

public class InsertionSort {
    static void insertionSort(int[] a){
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i -1;
            while (j >=0  && a[j] > key){
                a[j + 1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] a = {8,9,1,6,7,0};
        insertionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
