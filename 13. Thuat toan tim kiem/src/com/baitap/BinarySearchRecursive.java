package com.baitap;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9,11,13,15};
        System.out.println(BinarySeach(a,11,0,a.length-1));
    }
    static int BinarySeach(int[] a,int x,int l, int r){
        if(r >= l){
            int mid = (l+r)/2;
            if(x == a[mid]){
                return mid;
            }
            //return dừng hàm
            if(x > a[mid]){
                 return BinarySeach(a,x,mid+1,r);
            }
            return BinarySeach(a,x,l,mid-1);
        }
        return -1;
    }
}
