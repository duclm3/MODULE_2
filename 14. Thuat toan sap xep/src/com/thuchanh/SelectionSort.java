package com.thuchanh;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(double[] a) {
        for (int i = 0; i < a.length -1; i++) {
            for (int j = i+1; j < i+2; j++) {
                if(a[i] > a[j]){
                    double temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    //a[i] vs a[i+1]
    //a[i+1] vs a[i+2]
    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
