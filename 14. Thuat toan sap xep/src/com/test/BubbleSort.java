package com.test;

public class BubbleSort {
    static void bubbleSort(int a[]){
        int count =0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            count ++;
        }
        System.out.println(count);
    }
    //sau khi đã ss tìm được số lớn nhất thì lần duyệt tiếp theo
    //sẽ chỉ duyệt đến số có index số đó - 1,tương tự lặp lại
    // các lần thì số - đằng sau đều tăng dần và số đó là i, mà
    public static void main(String[] args) {
        int[] a = {3,4,5,2,1};
        bubbleSort(a);
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
    }
}
