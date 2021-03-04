package com.test;

public class InsertionSort {
    static void insertionSort(int a[]){
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j -- ;//j = -1
            }
            a[j + 1] = key;//sau khi ss ko thấy còn thấy thằng nào nhỏ
        }// trong mảng bên phải thì nó gán a[j] = key( j+1 vì j bên trên)
    }//đã giảm trước khi gán

    public static void main(String[] args) {
        int[] a = {5,8,0,1,2,3,-1};
        insertionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
