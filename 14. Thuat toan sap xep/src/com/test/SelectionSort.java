package com.test;

public class SelectionSort {
    static void selectionSort(int[] a){
        int count = 0;
        for (int i = 0; i < a.length -1; i++) {
            int min_index = i;
            for (int j = i+1; j < a.length ; j++) {
                if(a[min_index] > a[j]){
                    min_index = j;
                }
            }
            int temp = a[i];
            a[i] = a[min_index];
            a[min_index] = temp;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] a = {3,4,5,2,1};
        selectionSort(a);
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
        //}
    }
}
